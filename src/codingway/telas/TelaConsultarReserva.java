package codingway.telas;

import codingway.reserva.*;
import codingway.util.Util;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.Timer;

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
        String status = "ESPERA";
        atualizarTabela(status);
        Util.checkTimer();
    }

    private String converterDataString(Date date) {
        return f.format(date);
    }

    public void atualizarTabela(String status) {
        ReservaTableModel modelo = new ReservaTableModel(reservaDAO.listarReservaData(status));
        tbReserva.setModel(modelo);
    }

    public void atualizarTabelaLike(String busca) {
        ReservaTableModel modelo = new ReservaTableModel(reservaDAO.listarBusca(busca));
        tbReserva.setModel(modelo);
    }

    public void atualizarTabelaData(Date data) {
        ReservaTableModel modelo = new ReservaTableModel(reservaDAO.listarBuscaData(data));
        tbReserva.setModel(modelo);
    }

    public void atualizarTabelaStatus() {
        ReservaTableModel modelo = new ReservaTableModel(reservaDAO.listarReservaDataExp());
        tbReserva.setModel(modelo);
    }
    
    public void atualizarTabelaStatusDt(){
        ReservaTableModel modelo = new ReservaTableModel(reservaDAO.listarReservaStatusExp());
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
        tfData = new javax.swing.JTextField();
        try{       javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");       tfData = new javax.swing.JFormattedTextField(data);    }       catch (Exception e){    }
        jbStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        jScrollPane1.setBounds(50, 150, 600, 200);

        tfBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfBuscar.setForeground(new java.awt.Color(0, 0, 51));
        tfBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBuscar.setText("Buscar Livro");
        tfBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        tfBuscar.setCaretColor(new java.awt.Color(0, 0, 51));
        tfBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBuscarFocusGained(evt);
            }
        });
        tfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscarMouseClicked(evt);
            }
        });
        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscarKeyPressed(evt);
            }
        });
        jPanel1.add(tfBuscar);
        tfBuscar.setBounds(420, 110, 200, 30);

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Back_18px.png"))); // NOI18N
        btVoltar.setText("VOLTAR");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltar);
        btVoltar.setBounds(50, 450, 140, 30);

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Full_Trash_18px.png"))); // NOI18N
        btExcluir.setText("EXCLUIR");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btExcluir);
        btExcluir.setBounds(190, 450, 140, 30);

        btBuscarLike.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btBuscarLike.setForeground(new java.awt.Color(0, 0, 51));
        btBuscarLike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Search_20px.png"))); // NOI18N
        btBuscarLike.setContentAreaFilled(false);
        btBuscarLike.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBuscarLike.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btBuscarLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarLikeActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscarLike);
        btBuscarLike.setBounds(620, 110, 30, 30);

        btNotificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btNotificar.setForeground(new java.awt.Color(255, 255, 255));
        btNotificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Notification_20px.png"))); // NOI18N
        btNotificar.setText("NOTIFICAR");
        btNotificar.setContentAreaFilled(false);
        btNotificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNotificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNotificarActionPerformed(evt);
            }
        });
        jPanel1.add(btNotificar);
        btNotificar.setBounds(370, 450, 140, 30);

        btBuscarDt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btBuscarDt.setForeground(new java.awt.Color(0, 0, 51));
        btBuscarDt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Search_20px.png"))); // NOI18N
        btBuscarDt.setActionCommand("");
        btBuscarDt.setContentAreaFilled(false);
        btBuscarDt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBuscarDt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btBuscarDt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarDtActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscarDt);
        btBuscarDt.setBounds(150, 110, 30, 30);

        tfData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfData.setForeground(new java.awt.Color(0, 0, 51));
        tfData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfData.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfData.setCaretColor(new java.awt.Color(0, 0, 51));
        tfData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(tfData);
        tfData.setBounds(50, 110, 100, 30);

        jbStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESPERA", "NOTIFICADO", "EXPIRADO" }));
        jbStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jbStatusItemStateChanged(evt);
            }
        });
        jPanel1.add(jbStatus);
        jbStatus.setBounds(510, 450, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/TelaConsultaReserva.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

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
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        } else if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?", "Excluir",
                 JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            reserva = reservaDAO.pesquisarReservaId((int) tbReserva.getValueAt(linha, 0));
            reservaDAO.excluirReserva(reserva);
            JOptionPane.showMessageDialog(rootPane, "Reserva excluída!");
            String status = "ESPERA";
            atualizarTabela(status);
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
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        } else if (JOptionPane.showConfirmDialog(rootPane, "O livro realmente está disponivel?", "Reivindicar",
                 JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            try {
                String host = "smtp.gmail.com";
                String user = "oslibraryfvs@gmail.com";
                String pass = "codingway2018";
                String to = (String) tbReserva.getValueAt(linha, 2);
                String from = "oslibaryfvs@gmail.com";
                String subject = "OSLibrary FVS";
                String messageText = "A biblioteca da FVS informa que o livro " + (String) tbReserva.getValueAt(linha, 3) + " encontra-se disponível. \nVocê tem 24 horas para pegar o livro, caso contrário perderá sua vez! \nAtenciosamente Biblioteca da FVS.";
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
                msg.setSubject(subject);
                msg.setSentDate(new Date());
                msg.setText(messageText);

                Transport transport = mailSession.getTransport("smtp");
                transport.connect(host, user, pass);
                transport.sendMessage(msg, msg.getAllRecipients());
                transport.close();
                JOptionPane.showMessageDialog(this, "Email enviado para o aluno " + (String) tbReserva.getValueAt(linha, 1) + " com sucesso !");
                reserva = reservaDAO.pesquisarReservaId((int) tbReserva.getValueAt(linha, 0));

                //Pegar a data do dia seguinte e passá-la pra dataExpira
                Date data = new Date();
                Calendar dataExpira = Calendar.getInstance();
                dataExpira.setTime(data);
                dataExpira.add(Calendar.DAY_OF_MONTH, 1);
                Date dataExpiraDate = dataExpira.getTime();

                reserva.setDataExpira(data);
                reserva.setStatus("NOTIFICADO");
                reservaDAO.editarReserva(reserva);
                String status = "ESPERA";
                atualizarTabela("ESPERA");

                /*vencimento.setTime(new Date());
           int inteiro = 1; 
           vencimento.add(Calendar.DAY_OF_MONTH, inteiro);  		
                 */
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }

        }
    }//GEN-LAST:event_btNotificarActionPerformed

    private void btBuscarLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarLikeActionPerformed
        if (tfBuscar.getText().equals("") || tfBuscar.getText().equals("Buscar Livro")) {
            String status = "ESPERA";
            atualizarTabela(status);

        } else {
            atualizarTabelaLike(tfBuscar.getText());
        }
    }//GEN-LAST:event_btBuscarLikeActionPerformed

    private void tfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tfBuscar.getText().equals("") || tfBuscar.getText().equals("Buscar Livro")) {
                String status = "ESPERA";
                atualizarTabela(status);
            } else {
                atualizarTabelaLike(tfBuscar.getText());
            }
        }
    }//GEN-LAST:event_tfBuscarKeyPressed

    private void btBuscarDtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarDtActionPerformed
        if (tfData.getText().equals("  /  /    ")) {
            String status = "ESPERA";
            atualizarTabela(status);
        } else {
            try {
                atualizarTabelaData(f.parse(tfData.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(TelaConsultarReserva.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btBuscarDtActionPerformed

    private void jbStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jbStatusItemStateChanged
        if (jbStatus.getSelectedItem().equals("ESPERA")) {
            String status = "ESPERA";
            atualizarTabela(status);
        } else if (jbStatus.getSelectedItem().equals("NOTIFICADO")) {
            atualizarTabelaStatus();
        } else if(jbStatus.getSelectedItem().equals("EXPIRADO")){
            atualizarTabelaStatusDt();
        }
    }//GEN-LAST:event_jbStatusItemStateChanged

    private void tfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarMouseClicked
        tfBuscar.setText("");
    }//GEN-LAST:event_tfBuscarMouseClicked

    private void tfBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarFocusGained
        if (tfBuscar.getText().equals("") || tfBuscar.getText().equals("Buscar Livro")) {
            String status = "ESPERA";
            atualizarTabela(status);

        } else {
            atualizarTabelaLike(tfBuscar.getText());
        }
    }//GEN-LAST:event_tfBuscarFocusGained

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jbStatus;
    private javax.swing.JTable tbReserva;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfData;
    // End of variables declaration//GEN-END:variables
}
