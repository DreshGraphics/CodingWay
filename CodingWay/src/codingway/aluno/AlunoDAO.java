/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingway.aluno;

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
public class AlunoDAO{

    Session sessao;
    Transaction transacao;

    public void iniciarSessao() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
    }

    public void salvarAluno(Aluno aluno) {
            iniciarSessao();
            sessao.save(aluno);
            transacao.commit();
            sessao.close();
            
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");    
    }

    public void editarAluno(Aluno aluno) {
        iniciarSessao();
        sessao.update(aluno);
        transacao.commit();
        sessao.close();
    }

    public void excluirAluno(Aluno aluno) {
        iniciarSessao();
        sessao.delete(aluno);
        transacao.commit();
        sessao.close();
    }

    public List<Aluno> listarAluno() {
        iniciarSessao();
        List<Aluno> alunos = sessao.createCriteria(Aluno.class).list();
        sessao.close();
        return alunos;
    }

    public Aluno pesquisarAlunoId(int id) {
        iniciarSessao();
        Aluno aluno = (Aluno) sessao.createCriteria(Aluno.class).add(Restrictions.eq("Matricula", id)).uniqueResult();
        sessao.close();
        return aluno;
    }
    
}
