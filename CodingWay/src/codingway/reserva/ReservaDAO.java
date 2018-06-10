/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingway.reserva;

import codingway.connection.ConnectionFactory;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;
import codingway.util.HibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void reivindicarLivro(){
        
    }
    
    public List<Reserva> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Reserva> reservas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM reserva WHERE descricao LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Reserva reserva = new Reserva();

                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setNomeAutor(rs.getString("nomeAutor"));
                reserva.setNomeLivro(rs.getString("nomeLivro"));
                reserva.setNomeAluno(rs.getString("nomeAluno"));
                reservas.add(reserva);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return reservas;

    }
    
}
