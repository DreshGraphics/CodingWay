/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingway.reserva;

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
public class ReservaDAO{

    Session sessao;
    Transaction transacao;

    public void iniciarSessao() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
    }

    public void salvarReserva(Reserva reserva) {
        iniciarSessao();
        sessao.save(reserva);
        transacao.commit();
        sessao.close();    
    }

    public void editarReserva(Reserva reserva) {
        iniciarSessao();
        sessao.update(reserva);
        transacao.commit();
        sessao.close();
    }

    public void excluirReserva(Reserva reserva) {
        iniciarSessao();
        sessao.delete(reserva);
        transacao.commit();
        sessao.close();
    }

    public List<Reserva> listarReserva() {
        iniciarSessao();
        List<Reserva> reservas = sessao.createCriteria(Reserva.class).list();
        sessao.close();
        return reservas;
    }

    public Reserva pesquisarReservaId(int id) {
        iniciarSessao();
        Reserva reserva = (Reserva) sessao.createCriteria(Reserva.class).add(Restrictions.eq("idReserva", id)).uniqueResult();
        sessao.close();
        return reserva;
    }
    
}
