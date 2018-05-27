/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingway.aluno;

import codingway.util.GenericDAO;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;
/*import codingway.aluno.Aluno;
import codingway.paciente.Paciente;*/
import codingway.util.HibernateUtil;

/**
 *
 * @author Dresh
 */
public class AlunoDAO extends GenericDAO<Aluno> {

    public AlunoDAO() {
        super(Aluno.class);
    }

    
    public void iniciarSessao(){
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
    }
    
    
    public void salvar(Aluno aluno) {
        Object[] options = {"Sim", "Não"};
        if (aluno.getIdAluno() == 0) {
            if (adicionar(aluno)) {
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "CodingWay", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(aluno)) {
                JOptionPane.showMessageDialog(null, "Aluno editado com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }


    public boolean excluir(Aluno aluno) {
        Object[] options = {"Sim", "Não"};
        if (aluno.getIdAluno()!= 0) {
            if (JOptionPane.showOptionDialog(null, "Deseja excluir o aluno): " + aluno.getNome()
                    + "?", "CodingWay", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {

                if (remover(aluno)) {
                    JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");                    
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível excluir o Usuário" + aluno.getNome(),
                            "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "A exclusão foi cancelada!");
            }

        }
        return true;
    }
    
    public Aluno pesquisarUsuarioId(int id){
        iniciarSessao();
        Aluno aluno = (Aluno) sessao.createCriteria
       (Aluno.class).add(Restrictions.eq
       ("idAluno", id)).uniqueResult();
        sessao.close();
        return aluno;
    }
    
}
