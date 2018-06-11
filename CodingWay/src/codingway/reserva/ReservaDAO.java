/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingway.reserva;

import codingway.connection.ConnectionFactory;
import javax.swing.JOptionPane;
import codingway.util.HibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.*;

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
    
    public List<Reserva> listarReservaOr() {
        iniciarSessao();
        List<Reserva> reservas = sessao.createCriteria(Reserva.class).addOrder(Order.desc("idReserva")).list(); 
        sessao.close();
        return reservas;
    }
    
    
    public List<Reserva> listarReservaData() {
        iniciarSessao();
        List<Reserva> reservas = sessao.createCriteria(Reserva.class).add(Restrictions.eq("status", "ESPERA")).addOrder(Order.asc("dataPrevista")).list();
        sessao.close();
        return reservas;
    }
    
    public List<Reserva> listarReservaDataExp() {
        iniciarSessao();
        List<Reserva> reservas = sessao.createCriteria(Reserva.class).add(Restrictions.eq("status", "EXPIRADO")).addOrder(Order.desc("dataPrevista")).list();
        sessao.close();
        return reservas;
    }
    
    public List<Reserva> listarBusca(String busca) {
        iniciarSessao();
        List<Reserva> reservas = sessao.createCriteria(Reserva.class).add(Restrictions.like("nomeLivro", "%"+busca+"%")).list();
        sessao.close();
        return reservas;
    }
    
    public List<Reserva> listarBuscaData(Date data) {
        iniciarSessao();
        List<Reserva> reservas = sessao.createCriteria(Reserva.class).add(Restrictions.eq("dataPrevista", data)).list();
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
