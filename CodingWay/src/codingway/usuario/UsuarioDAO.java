/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingway.usuario;

import codingway.usuario.*;
import codingway.util.GenericDAO;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;
/*import codingway.aluno.Usuario;
import codingway.paciente.Paciente;*/
import codingway.util.HibernateUtil;

/**
 *
 * @author Dresh
 */
public class UsuarioDAO extends GenericDAO<Usuario> {

    public UsuarioDAO() {
        super(Usuario.class);
    }

    
    public void iniciarSessao(){
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
    }
    
    
    public void salvar(Usuario usuario) {
        Object[] options = {"Sim", "Não"};
        if (usuario.getIdUsuario() == 0) {
            if (adicionar(usuario)) {
                JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "CodingWay", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(usuario)) {
                JOptionPane.showMessageDialog(null, "Usuario editado com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }

    public Usuario autenticarUsuario(String login, String senha) {
        iniciarSessao();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("senha", senha)).add(Restrictions.eq("login", login)).uniqueResult();
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos!");
        } else {
            sessao.close();
            return usuario;
        }
        return usuario;
    }
    
    public boolean excluir(Usuario usuario) {
        Object[] options = {"Sim", "Não"};
        if (usuario.getIdUsuario() != 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o Usuário): " + usuario.getNome()
                    + "?", "CodingWay", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(usuario)) {
                    JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o Usuário" + usuario.getNome(),
                            "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "A exclusão foi cancelada!");
            }

        }
        return true;
    }
    
    public Usuario pesquisarUsuarioId(int id){
        iniciarSessao();
        Usuario usuario = (Usuario) sessao.createCriteria
       (Usuario.class).add(Restrictions.eq
       ("idUsuario", id)).uniqueResult();
        sessao.close();
        return usuario;
    }
    
    public Usuario pesquisarLogin(String login) {
        iniciarSessao();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("login", login)).uniqueResult();
        sessao.close();
        return usuario;
    }
    
}
