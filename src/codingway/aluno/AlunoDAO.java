package codingway.aluno;

import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;
import codingway.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author Dresh
 */
public class AlunoDAO extends HibernateUtil {

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
        Aluno aluno = (Aluno) sessao.createCriteria(Aluno.class).add(Restrictions.eq("idAluno", id)).uniqueResult();
        sessao.close();
        return aluno;
    }

    public Aluno pesquisarEmail(String email) {
        iniciarSessao();
        Aluno aluno = (Aluno) sessao.createCriteria(Aluno.class).add(Restrictions.eq("Email", email)).uniqueResult();
        sessao.close();
        return aluno;
    }
    
    public Aluno pesquisarMatricula(int matricula) {
        iniciarSessao();
        Aluno aluno = (Aluno) sessao.createCriteria(Aluno.class).add(Restrictions.eq("Matricula", matricula)).uniqueResult();
        sessao.close();
        return aluno;
    }
    
    public Aluno pesquisarDados(int matricula, String nome, String email) {
        iniciarSessao();
        Aluno aluno = (Aluno) sessao.createCriteria(Aluno.class).add(Restrictions.eq("Matricula", matricula)).add(Restrictions.eq("Aluno", nome)).add(Restrictions.eq("Email", email)).uniqueResult();
        sessao.close();
        return aluno;
    }
    
    public List<Aluno> listarAlunoCurso(String curso) {
        iniciarSessao();
        List<Aluno> alunos = sessao.createCriteria(Aluno.class).add(Restrictions.eq("Curso", curso)).addOrder(Order.asc("idAluno")).list();
        sessao.close();
        return alunos;
    }

    public List<Aluno> listarBusca(String busca, String curso) {
        iniciarSessao();
        List<Aluno> alunos = sessao.createCriteria(Aluno.class).add(Restrictions.like("Curso", curso)).add(Restrictions.like("Aluno", "%"+busca+"%")).list();
        sessao.close();
        return alunos;
    }
    
    public List<Aluno> listarBuscaLike(String busca) {
        iniciarSessao();
        List<Aluno> alunos = sessao.createCriteria(Aluno.class).add(Restrictions.like("Aluno", "%"+busca+"%")).list();
        sessao.close();
        return alunos;
    }
    
}
