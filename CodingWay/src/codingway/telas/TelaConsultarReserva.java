package codingway.telas;

import codingway.reserva.*;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Dresh
 */
public class TelaConsultarReserva extends javax.swing.JFrame {

    Reserva reserva = new Reserva();
    ReservaDAO reservaDAO = new ReservaDAO();
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    
    Date date = new Date();
    
    GregorianCalendar vencimento = new GregorianCalendar(); 
	
                 
    
    public TelaConsultarReserva() {
        initComponents();
        atualizarTabela();
    }
    
    private String converterDataString(Date date) {
        return f.format(date);
    }
    
    public void atualizarTabela(){
        ReservaTableModel modelo = new 
        ReservaTableModel(reservaDAO.listarReservaData());
        tbReserva.setModel(modelo);
    }
    
    public void atualizarTabelaLike(String busca){
        ReservaTableModel modelo = new 
        ReservaTableModel(reservaDAO.listarBusca(busca));
        tbReserva.setModel(modelo);
    }
    
    public void atualizarTabelaData(Date data){
        ReservaTableModel modelo = new 
        ReservaTableModel(reservaDAO.listarBuscaData(data));
        tbReserva.setModel(modelo);
    }
    
    public void atualizarTabelaStatus(){
        ReservaTableModel modelo = new 
        ReservaTableModel(reservaDAO.listarReservaDataExp());
        tbReserva.setModel(modelo);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbReserva = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btBuscar1 = new javax.swing.JButton();
        tfData = new javax.swing.JFormattedTextField();
        btEspera = new javax.swing.JButton();
        btExpirado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbReservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbReserva);

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscarKeyPressed(evt);
            }
        });

        btBuscar.setText("BUSCAR");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("REINVIDICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btBuscar1.setText("BUSCAR");
        btBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscar1ActionPerformed(evt);
            }
        });

        try {
            tfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btEspera.setText("ESPERA");
        btEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEsperaActionPerformed(evt);
            }
        });

        btExpirado.setText("EXPIRADO");
        btExpirado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExpiradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btEspera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExpirado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfData)
                            .addComponent(tfBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btBuscar)
                            .addComponent(btBuscar1))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar1)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEspera)
                    .addComponent(btExpirado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btExcluir)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linha = tbReserva.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }else if(JOptionPane.showConfirmDialog
        (rootPane, "Deseja realmente excluir?", "Excluir"
        , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            reserva = reservaDAO.pesquisarReservaId
        ((int) tbReserva.getValueAt(linha, 0));
            reservaDAO.excluirReserva(reserva);
            JOptionPane.showMessageDialog(rootPane, "Reserva excluída!");
            atualizarTabela();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaCadastroReserva telaReserva = new TelaCadastroReserva();
        telaReserva.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void tbReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReservaMouseClicked

    }//GEN-LAST:event_tbReservaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int linha = tbReserva.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }else if(JOptionPane.showConfirmDialog
        (rootPane, "O livro realmente está disponivel?", "Reivindicar"
        , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

            try{    
            String host ="smtp.gmail.com" ;
            String user = "oslibaryfvs@gmail.com";
            String pass = "codingway2018";
            String to = (String) tbReserva.getValueAt(linha, 2);
            String from = "oslibaryfvs@gmail.com";
            String subject = "OSLibrary FVS";
            String messageText = "A biblioteca da FVS informa que o seu livro " +(String) tbReserva.getValueAt(linha, 3)+ " encontra-se disponível \nVocê tem 24 horas para pegar o livro, caso contrário perderá sua vez! \nAnteciosamente Biblioteca da FVS";
            boolean sessionDebug = false;
 
            Properties props = System.getProperties();
 
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
 
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);
 
           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           JOptionPane.showMessageDialog(this, "Email enviado para o aluno " +(String) tbReserva.getValueAt(linha, 1)+ " com sucesso !");
           
           reserva = reservaDAO.pesquisarReservaId((int) tbReserva.getValueAt(linha, 0));
           reserva.setStatus("EXPIRADO");
           reservaDAO.editarReserva(reserva);
           atualizarTabela();
           
           /*vencimento.setTime(new Date());
           int inteiro = 1; 
           vencimento.add(Calendar.DAY_OF_MONTH, inteiro);  		
           System.out.print(vencimento.getTime());*/
           
        } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
            
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        if(tfBuscar.getText().equals("")){
            atualizarTabela();
            
        } else {
        atualizarTabelaLike(tfBuscar.getText());
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void tfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(tfBuscar.getText().equals("")){
                atualizarTabela();
            } else {
                atualizarTabelaLike(tfBuscar.getText());
        }
        }
    }//GEN-LAST:event_tfBuscarKeyPressed

    private void btBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscar1ActionPerformed
        if(tfData.getText().equals("  /  /    ")){
            atualizarTabela();
        } else {
          try {
            atualizarTabelaData(f.parse(tfData.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(TelaConsultarReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_btBuscar1ActionPerformed

    private void btEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEsperaActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_btEsperaActionPerformed

    private void btExpiradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExpiradoActionPerformed
        atualizarTabelaStatus();
    }//GEN-LAST:event_btExpiradoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btBuscar1;
    private javax.swing.JButton btEspera;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btExpirado;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbReserva;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JFormattedTextField tfData;
    // End of variables declaration//GEN-END:variables
}
