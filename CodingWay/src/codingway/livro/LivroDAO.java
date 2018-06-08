/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingway.livro;

import codingway.livro.*;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;
import codingway.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Dresh
 */
public class LivroDAO{

    Session sessao;
    Transaction transacao;

    public void iniciarSessao() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
    }

    public void salvarLivro(Livro livro) {
            iniciarSessao();
            sessao.save(livro);
            transacao.commit();
            sessao.close();    
    }

    public void editarLivro(Livro livro) {
        iniciarSessao();
        sessao.update(livro);
        transacao.commit();
        sessao.close();
    }

    public void excluirLivro(Livro livro) {
        iniciarSessao();
        sessao.delete(livro);
        transacao.commit();
        sessao.close();
    }

    public List<Livro> listarLivro() {
        iniciarSessao();
        List<Livro> livros = sessao.createCriteria(Livro.class).list();
        sessao.close();
        return livros;
    }

    public Livro pesquisarLivroId(int id) {
        iniciarSessao();
        Livro livro = (Livro) sessao.createCriteria(Livro.class).add(Restrictions.eq("idLivro", id)).uniqueResult();
        sessao.close();
        return livro;
    }
    
}
