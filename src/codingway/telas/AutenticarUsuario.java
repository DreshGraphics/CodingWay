package codingway.telas;

import codingway.reserva.Reserva;
import codingway.reserva.ReservaDAO;
import codingway.usuario.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dresh
 */
public class AutenticarUsuario extends javax.swing.JFrame {

    Usuario usuario;
    UsuarioDAO UsuarioDAO = new UsuarioDAO();
    
    public AutenticarUsuario() {
        initComponents();
        tfLogin.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        tfSenha.setBackground(new Color(1.0f,1.0f,1.0f,0f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jsLogin = new javax.swing.JSeparator();
        jsSenha = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(28, 17, 65));
        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(28, 17, 65));
        jLabel2.setText("Biblioteca");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 30, 300, 48);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(28, 17, 65));
        jLabel4.setText("system");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(164, 65, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(28, 17, 65));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Coding Way");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(150, 425, 100, 30);

        jSeparator1.setForeground(new java.awt.Color(28, 17, 65));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 440, 100, 2);

        jSeparator2.setForeground(new java.awt.Color(28, 17, 65));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(300, 440, 100, 2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_User_15px.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 190, 15, 15);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Password_15px.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 290, 15, 15);

        jlSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlSenha.setForeground(new java.awt.Color(255, 255, 255));
        jlSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlSenha.setText("Senha");
        jPanel1.add(jlSenha);
        jlSenha.setBounds(50, 250, 100, 30);

        jlLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlLogin.setText("Login");
        jPanel1.add(jlLogin);
        jlLogin.setBounds(50, 150, 100, 30);

        tfLogin.setBackground(new java.awt.Color(28, 17, 65));
        tfLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfLogin.setForeground(new java.awt.Color(255, 255, 255));
        tfLogin.setBorder(null);
        tfLogin.setOpaque(false);
        jPanel1.add(tfLogin);
        tfLogin.setBounds(70, 180, 180, 30);

        tfSenha.setBackground(new java.awt.Color(28, 17, 65));
        tfSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfSenha.setForeground(new java.awt.Color(255, 255, 255));
        tfSenha.setBorder(null);
        tfSenha.setOpaque(false);
        tfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(tfSenha);
        tfSenha.setBounds(70, 280, 180, 30);

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Enter_25px.png"))); // NOI18N
        btnEntrar.setText("ENTRAR");
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar);
        btnEntrar.setBounds(100, 400, 120, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Multiply_28px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(265, 0, 35, 35);

        jsLogin.setForeground(new java.awt.Color(28, 17, 65));
        jsLogin.setOpaque(true);
        jPanel1.add(jsLogin);
        jsLogin.setBounds(50, 210, 200, 2);

        jsSenha.setForeground(new java.awt.Color(28, 17, 65));
        jsSenha.setOpaque(true);
        jPanel1.add(jsSenha);
        jsSenha.setBounds(50, 310, 200, 2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/fundologin.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 500);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(400, 0, 300, 500);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/BackLogin.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if(tfLogin.getText().equals("") || tfSenha.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        } else {
            usuario = UsuarioDAO.autenticarUsuario(tfLogin.getText(), tfSenha.getText());

        if (usuario != null) {
            MenuPrincipal menu = new MenuPrincipal(usuario);
            menu.setVisible(true);
            dispose();
        }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void tfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnEntrarActionPerformed(null);
        }
    }//GEN-LAST:event_tfSenhaKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente fechar o sistema?", "Fechar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
           JOptionPane.showMessageDialog(this, "Todos os Direitos Reservados \n \nCoding Way");
           System.exit(0); 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AutenticarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutenticarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutenticarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutenticarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutenticarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JSeparator jsLogin;
    private javax.swing.JSeparator jsSenha;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
