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

    MenuPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jUser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        subCadastroAluno = new javax.swing.JMenuItem();
        subCadastroReserva = new javax.swing.JMenuItem();
        subCadastroLivro = new javax.swing.JMenuItem();
        subCadastroUsuario = new javax.swing.JMenuItem();
        MenuConsulta = new javax.swing.JMenu();
        subConsultaAluno = new javax.swing.JMenuItem();
        subConsultaReserva = new javax.swing.JMenuItem();
        subConsultaLivro = new javax.swing.JMenuItem();
        subConsultaUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_User_40px.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 390, 40, 40);

        jUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jUser.setText("user");
        jPanel1.add(jUser);
        jUser.setBounds(60, 390, 100, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Sign_Out_40px_1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 390, 40, 40);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(110, 60));

        MenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Save_24px.png"))); // NOI18N
        MenuCadastro.setText("Cadastro");
        MenuCadastro.setToolTipText("");
        MenuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuCadastro.setMaximumSize(new java.awt.Dimension(102, 32767));
        MenuCadastro.setPreferredSize(new java.awt.Dimension(101, 24));

        subCadastroAluno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subCadastroAluno.setText("Aluno");
        subCadastroAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subCadastroAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subCadastroAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subCadastroAluno.setPreferredSize(new java.awt.Dimension(100, 30));
        subCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCadastroAlunoActionPerformed(evt);
            }
        });
        MenuCadastro.add(subCadastroAluno);

        subCadastroReserva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subCadastroReserva.setText("Reserva");
        subCadastroReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subCadastroReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subCadastroReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subCadastroReserva.setPreferredSize(new java.awt.Dimension(100, 30));
        MenuCadastro.add(subCadastroReserva);

        subCadastroLivro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subCadastroLivro.setText("Livro");
        subCadastroLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subCadastroLivro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subCadastroLivro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subCadastroLivro.setPreferredSize(new java.awt.Dimension(100, 30));
        MenuCadastro.add(subCadastroLivro);

        subCadastroUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subCadastroUsuario.setText("Usuário");
        subCadastroUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subCadastroUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subCadastroUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subCadastroUsuario.setPreferredSize(new java.awt.Dimension(100, 30));
        subCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCadastroUsuarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(subCadastroUsuario);

        jMenuBar1.add(MenuCadastro);

        MenuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Search_32px_1.png"))); // NOI18N
        MenuConsulta.setText("Consulta");
        MenuConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuConsulta.setPreferredSize(new java.awt.Dimension(102, 32));

        subConsultaAluno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subConsultaAluno.setText("Aluno");
        subConsultaAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subConsultaAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subConsultaAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subConsultaAluno.setPreferredSize(new java.awt.Dimension(100, 30));
        MenuConsulta.add(subConsultaAluno);

        subConsultaReserva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subConsultaReserva.setText("Reserva");
        subConsultaReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subConsultaReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subConsultaReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subConsultaReserva.setPreferredSize(new java.awt.Dimension(100, 30));
        MenuConsulta.add(subConsultaReserva);

        subConsultaLivro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subConsultaLivro.setText("Livro");
        subConsultaLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subConsultaLivro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subConsultaLivro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subConsultaLivro.setPreferredSize(new java.awt.Dimension(100, 30));
        MenuConsulta.add(subConsultaLivro);

        subConsultaUsuario.setText("Usuário");
        subConsultaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subConsultaUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subConsultaUsuario.setPreferredSize(new java.awt.Dimension(100, 30));
        MenuConsulta.add(subConsultaUsuario);

        jMenuBar1.add(MenuConsulta);

        setJMenuBar(jMenuBar1);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente deslogar ?", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        
            JOptionPane.showMessageDialog(this, jUser.getText()+ " Deslogado!");
            AutenticarUsuario logout = new AutenticarUsuario();
            logout.setVisible(true);
            dispose();
    }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void subCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCadastroAlunoActionPerformed
        TelaCadastroAlunos telaAluno = new TelaCadastroAlunos();
        telaAluno.setVisible(true);
    }//GEN-LAST:event_subCadastroAlunoActionPerformed

    private void subCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCadastroUsuarioActionPerformed
        TelaCadastroUsuario telaUser = new TelaCadastroUsuario();
        telaUser.setVisible(true);
    }//GEN-LAST:event_subCadastroUsuarioActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jUser;
    private javax.swing.JMenuItem subCadastroAluno;
    private javax.swing.JMenuItem subCadastroLivro;
    private javax.swing.JMenuItem subCadastroReserva;
    private javax.swing.JMenuItem subCadastroUsuario;
    private javax.swing.JMenuItem subConsultaAluno;
    private javax.swing.JMenuItem subConsultaLivro;
    private javax.swing.JMenuItem subConsultaReserva;
    private javax.swing.JMenuItem subConsultaUsuario;
    // End of variables declaration//GEN-END:variables
}
