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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReserva = new javax.swing.JTable();
        tfBuscar = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btBuscarLike = new javax.swing.JButton();
        btNotificar = new javax.swing.JButton();
        btBuscarDt = new javax.swing.JButton();
        tfData = new javax.swing.JFormattedTextField();
        jbStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 600, 350);

        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscarKeyPressed(evt);
            }
        });
        jPanel1.add(tfBuscar);
        tfBuscar.setBounds(400, 30, 150, 30);

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltar);
        btVoltar.setBounds(50, 450, 100, 30);

        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btExcluir);
        btExcluir.setBounds(170, 450, 100, 30);

        btBuscarLike.setText("BUSCAR");
        btBuscarLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarLikeActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscarLike);
        btBuscarLike.setBounds(550, 30, 100, 30);

        btNotificar.setText("NOTIFICAR");
        btNotificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNotificarActionPerformed(evt);
            }
        });
        jPanel1.add(btNotificar);
        btNotificar.setBounds(290, 450, 100, 30);

        btBuscarDt.setText("BUSCAR");
        btBuscarDt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarDtActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscarDt);
        btBuscarDt.setBounds(130, 30, 80, 30);

        try {
            tfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(tfData);
        tfData.setBounds(50, 30, 80, 30);

        jbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESPERA", "NOTIFICADO" }));
        jbStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jbStatusItemStateChanged(evt);
            }
        });
        jbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStatusActionPerformed(evt);
            }
        });
        jPanel1.add(jbStatus);
        jbStatus.setBounds(550, 450, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btNotificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNotificarActionPerformed
        int linha = tbReserva.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }else if(JOptionPane.showConfirmDialog
        (rootPane, "O livro realmente está disponivel?", "Reivindicar"
        , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

            try{    
            String host ="smtp.gmail.com" ;
            String user = "oslibraryfvs@gmail.com";
            String pass = "codingway2018";
            String to = (String) tbReserva.getValueAt(linha, 2);
            String from = "oslibaryfvs@gmail.com";
            String subject = "OSLibrary FVS";
            String messageText = "A biblioteca da FVS informa que o livro " +(String) tbReserva.getValueAt(linha, 3)+ " encontra-se disponível. \nVocê tem 24 horas para pegar o livro, caso contrário perderá sua vez! \nAtenciosamente Biblioteca da FVS.";
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
           
           //Pegar a data do dia seguinte e passá-la pra dataExpira
           Date data = reserva.getDataPrevista();
           Calendar dataExpira = Calendar.getInstance();
           dataExpira.setTime(data);
           dataExpira.add(Calendar.DAY_OF_MONTH, 1);
           Date dataExpiraDate = dataExpira.getTime();       
           
           reserva.setDataExpira(dataExpiraDate);           
           reserva.setStatus("NOTIFICADO");
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
    }//GEN-LAST:event_btNotificarActionPerformed

    private void btBuscarLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarLikeActionPerformed
        if(tfBuscar.getText().equals("")){
            atualizarTabela();
            
        } else {
        atualizarTabelaLike(tfBuscar.getText());
        }
    }//GEN-LAST:event_btBuscarLikeActionPerformed

    private void tfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(tfBuscar.getText().equals("")){
                atualizarTabela();
            } else {
                atualizarTabelaLike(tfBuscar.getText());
        }
        }
    }//GEN-LAST:event_tfBuscarKeyPressed

    private void btBuscarDtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarDtActionPerformed
        if(tfData.getText().equals("  /  /    ")){
            atualizarTabela();
        } else {
          try {
            atualizarTabelaData(f.parse(tfData.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(TelaConsultarReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_btBuscarDtActionPerformed

    private void jbStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jbStatusItemStateChanged
        if(jbStatus.getSelectedItem().equals("ESPERA")){
            atualizarTabela();
        } else if(jbStatus.getSelectedItem().equals("NOTIFICADO")){
            atualizarTabelaStatus();
        }
    }//GEN-LAST:event_jbStatusItemStateChanged

    private void jbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbStatusActionPerformed

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
    private javax.swing.JButton btBuscarDt;
    private javax.swing.JButton btBuscarLike;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNotificar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jbStatus;
    private javax.swing.JTable tbReserva;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JFormattedTextField tfData;
    // End of variables declaration//GEN-END:variables
}
