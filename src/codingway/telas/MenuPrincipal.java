/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingway.telas;

import codingway.usuario.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Dresh
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Usuario usuario;
    
    public MenuPrincipal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        jUser.setText(usuario.getLogin());
    }

    private MenuPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAluno = new javax.swing.JButton();
        btLivro = new javax.swing.JButton();
        btReserva = new javax.swing.JButton();
        btUsuario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(800, 600));

        btAluno.setBackground(new java.awt.Color(255, 255, 255));
        btAluno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Student_Male_25px.png"))); // NOI18N
        btAluno.setText("ALUNO");
        btAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAluno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlunoActionPerformed(evt);
            }
        });

        btLivro.setBackground(new java.awt.Color(255, 255, 255));
        btLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Book_25px.png"))); // NOI18N
        btLivro.setText("LIVRO");
        btLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLivro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLivro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLivroActionPerformed(evt);
            }
        });

        btReserva.setBackground(new java.awt.Color(255, 255, 255));
        btReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Return_Book_25px.png"))); // NOI18N
        btReserva.setText("RESERVA");
        btReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservaActionPerformed(evt);
            }
        });

        btUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_User_25px.png"))); // NOI18N
        btUsuario.setText("USUÁRIO");
        btUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuarioActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jUser.setForeground(new java.awt.Color(255, 255, 255));
        jUser.setText("user");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_User_25px_2.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Exit_25px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(490, 490, 490)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlunoActionPerformed
        TelaCadastroAluno telaAluno = new TelaCadastroAluno();
        telaAluno.setVisible(true);
    }//GEN-LAST:event_btAlunoActionPerformed

    private void btLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLivroActionPerformed
        TelaCadastroLivro telaLivro = new TelaCadastroLivro();
        telaLivro.setVisible(true);
    }//GEN-LAST:event_btLivroActionPerformed

    private void btReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservaActionPerformed
        TelaCadastroReserva telaReserva = new TelaCadastroReserva();
        telaReserva.setVisible(true);
    }//GEN-LAST:event_btReservaActionPerformed

    private void btUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuarioActionPerformed
        TelaCadastroUsuario telaUsuario = new TelaCadastroUsuario();
        telaUsuario.setVisible(true);
    }//GEN-LAST:event_btUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente deslogar ?", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

            JOptionPane.showMessageDialog(this, jUser.getText()+ " Deslogado!");
            AutenticarUsuario logout = new AutenticarUsuario();
            logout.setVisible(true);
            dispose();
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAluno;
    private javax.swing.JButton btLivro;
    private javax.swing.JButton btReserva;
    private javax.swing.JButton btUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jUser;
    // End of variables declaration//GEN-END:variables
}
