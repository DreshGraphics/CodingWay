/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingway.livro;

import codingway.util.GenericDAO;
import codingway.util.HibernateUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author Brenno
 */
public class LivrosDAO extends GenericDAO<Livros>{
    
    public LivrosDAO() {
        super(Livros.class);
    }
    
    public void iniciarSessao(){
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
    }
    
    
    public void salvar(Livros livros) {
        
        Object[] options = {"Sim", "Não"};
        if (livros.getIdLivro()== 0) {
            if (adicionar(livros)) {
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "CodingWay", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(livros)) {
                JOptionPane.showMessageDialog(null, "Livro editado com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
        
        
    }
}
