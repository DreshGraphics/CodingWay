package codingway.telas;

import codingway.aluno.*;
import codingway.livro.*;
import codingway.reserva.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
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
public class TelaCadastroReserva extends javax.swing.JFrame {

    Aluno aluno = new Aluno();
    AlunoDAO alunoDAO = new AlunoDAO();
    
    Livro livro = new Livro();
    LivroDAO livroDAO = new LivroDAO();
    
    Reserva reserva = new Reserva();
    ReservaDAO reservaDAO = new ReservaDAO();
    
    Date data = new Date();
    SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
    String dataFormatada  = formataData.format(data);
        
    public TelaCadastroReserva() {
        initComponents();
        btExcluir.setEnabled(false);
        if(tfAluno.getText().equals("")){
            buscarLivro.setEnabled(false);
        }
    }
    
    /*public void atualizarTabela(){
        ReservaTableModel modelo = new 
        ReservaTableModel(reservaDAO.listarReserva());
        tbReserva.setModel(modelo);
    }
    
    public void atualizarTabelaOr(){
        ReservaTableModel modelo = new 
        ReservaTableModel(reservaDAO.listarReservaOr());
        tbReserva.setModel(modelo);
    }*/
    
    public void preencherAluno(){
        tfAluno.setText(aluno.getAluno());
        tfEmail.setText(aluno.getEmail());
        buscarLivro.setEnabled(true);
    }
    
    public void preencherLivro(){
        preencherAluno();
        tfLivro.setText(livro.getNomeLivro());
        tfAutor.setText(livro.getNomeAutor());
    }
    
    private void limparCampos() {
        reserva = new Reserva();
        tfAluno.setText("");
        tfAutor.setText("");
        tfLivro.setText("");
        tfData.setText("");
        tfEmail.setText("");
    }
    
    private Date formataData(String data) {
        if (data == null || data.equals("")) {
            return null;
        }
        Date d = null;
        try {
            DateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
            d = formatar.parse(data);
        } catch (ParseException e) {

        }
        return d;
    }

    private String converterDataString(Date date) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.format(date);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfAluno = new javax.swing.JTextField();
        tfLivro = new javax.swing.JTextField();
        buscarAluno = new javax.swing.JButton();
        buscarLivro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfAutor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        tfEmail = new javax.swing.JTextField();
        tfData = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");  
            tfData = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Aluno:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(135, 120, 100, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Livro:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(135, 170, 100, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(135, 270, 100, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Autor:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(135, 220, 100, 30);

        tfAluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfAluno.setEnabled(false);
        jPanel1.add(tfAluno);
        tfAluno.setBounds(235, 120, 300, 30);

        tfLivro.setEditable(false);
        tfLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfLivro.setEnabled(false);
        jPanel1.add(tfLivro);
        tfLivro.setBounds(235, 170, 300, 30);

        buscarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Search_20px.png"))); // NOI18N
        buscarAluno.setContentAreaFilled(false);
        buscarAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(buscarAluno);
        buscarAluno.setBounds(535, 120, 30, 30);

        buscarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Search_20px.png"))); // NOI18N
        buscarLivro.setToolTipText("");
        buscarLivro.setContentAreaFilled(false);
        buscarLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLivroActionPerformed(evt);
            }
        });
        jPanel1.add(buscarLivro);
        buscarLivro.setBounds(535, 170, 30, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Data Prevista:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(135, 320, 100, 30);

        tfAutor.setEditable(false);
        tfAutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfAutor.setEnabled(false);
        jPanel1.add(tfAutor);
        tfAutor.setBounds(235, 220, 300, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Multiply_28px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(665, 0, 35, 35);

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Back_18px.png"))); // NOI18N
        btVoltar.setText("VOLTAR");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltar);
        btVoltar.setBounds(10, 430, 110, 50);

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Broom_18px.png"))); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpar);
        btLimpar.setBounds(152, 430, 110, 50);

        btPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Search_18px.png"))); // NOI18N
        btPesquisar.setText("PESQUISAR");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisar);
        btPesquisar.setBounds(295, 430, 110, 50);

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Full_Trash_18px.png"))); // NOI18N
        btExcluir.setText("EXCLUIR");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btExcluir);
        btExcluir.setBounds(438, 430, 110, 50);

        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Save_18px.png"))); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar);
        btSalvar.setBounds(580, 430, 110, 50);

        tfEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfEmail.setEnabled(false);
        jPanel1.add(tfEmail);
        tfEmail.setBounds(235, 270, 300, 30);

        tfData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(tfData);
        tfData.setBounds(235, 320, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/TelaCadastroReserva.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 700, 500);

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

    private void buscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLivroActionPerformed
        if(tfAluno.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Selecione primeiro o aluno!");
        } else {
            TelaConsultarLivro telaLivro = new TelaConsultarLivro();
            telaLivro.aluno = aluno;
            telaLivro.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_buscarLivroActionPerformed

    private void buscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAlunoActionPerformed
        TelaConsultarAluno telaAluno = new TelaConsultarAluno();
        telaAluno.setVisible(true);
        dispose();
    }//GEN-LAST:event_buscarAlunoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
        btExcluir.setEnabled(false);
        aluno = new Aluno();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        TelaConsultarReserva telaPesquisa = new TelaConsultarReserva();
        telaPesquisa.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(formataData(tfData.getText()).after(data)){
            reserva.setNomeAluno(tfAluno.getText().toUpperCase());
            reserva.setNomeAutor(tfAutor.getText().toUpperCase());
            reserva.setNomeLivro(tfLivro.getText().toUpperCase());
            reserva.setEmail(tfEmail.getText());
            reserva.setDataPrevista(formataData(tfData.getText()));
            reserva.setStatus("ESPERA");

            if(reserva.getIdReserva()== 0){
                reservaDAO.salvarReserva(reserva);
                JOptionPane.showMessageDialog(this, "Reserva cadastrado com sucesso");
                
                try{    
            String host ="smtp.gmail.com" ;
            String user = "oslibraryfvs@gmail.com";
            String pass = "codingway2018";
            String to = tfEmail.getText();
            String from = "oslibaryfvs@gmail.com";
            String subject = "OSLibrary FVS";
            String messageText = "A biblioteca da FVS informa que o livro " +tfLivro.getText()+ " foi reservado. \nEstá previsto para estar disponivel no dia "+tfData.getText()+ "\nAtenciosamente Biblioteca da FVS.";
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
           JOptionPane.showMessageDialog(this, "Email enviado para o aluno " +tfEmail.getText()+ " com sucesso !");
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
                
                limparCampos();
            } else {
                reservaDAO.editarReserva(reserva);
                JOptionPane.showMessageDialog(this, "Reserva editado com sucesso");
                limparCampos();
            }  
        } else {
            JOptionPane.showMessageDialog(this, "Impossivel registrar reserva em um dia que já passou!");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaCadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaCadastroReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton buscarAluno;
    private javax.swing.JButton buscarLivro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfAluno;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfLivro;
    // End of variables declaration//GEN-END:variables
}
