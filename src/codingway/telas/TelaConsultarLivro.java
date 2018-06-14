package codingway.telas;

import codingway.aluno.*;
import codingway.livro.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dresh
 */
public class TelaConsultarLivro extends javax.swing.JFrame {

    Livro livro = new Livro();
    LivroDAO livroDAO = new LivroDAO();
    
    Aluno aluno = new Aluno();
    AlunoDAO alunoDAO = new AlunoDAO();
    
    public TelaConsultarLivro() {
        initComponents();
        atualizarTabela();
    }
    
    public void atualizarTabela(){
        LivroTableModel modelo = new 
        LivroTableModel(livroDAO.listarLivro());
        tbLivro.setModel(modelo);
    }
    
    public void atualizarBuscaLike(String busca){
        LivroTableModel modelo = new 
        LivroTableModel(livroDAO.listarBuscaLike(busca));
        tbLivro.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLivro = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btRetornar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tfBuscaLivro = new javax.swing.JTextField();
        btBuscaLivro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        tbLivro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbLivro);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 150, 600, 200);

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

        btEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btEditar.setForeground(new java.awt.Color(255, 255, 255));
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Change_User_20px.png"))); // NOI18N
        btEditar.setText("EDITAR");
        btEditar.setContentAreaFilled(false);
        btEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btEditar);
        btEditar.setBounds(190, 450, 140, 30);

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
        btExcluir.setBounds(370, 450, 140, 30);

        btRetornar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btRetornar.setForeground(new java.awt.Color(255, 255, 255));
        btRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Return_20px.png"))); // NOI18N
        btRetornar.setText("RETORNAR");
        btRetornar.setContentAreaFilled(false);
        btRetornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        });
        jPanel1.add(btRetornar);
        btRetornar.setBounds(510, 450, 140, 30);

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

        tfBuscaLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfBuscaLivro.setForeground(new java.awt.Color(0, 0, 51));
        tfBuscaLivro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBuscaLivro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        tfBuscaLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscaLivroKeyPressed(evt);
            }
        });
        jPanel1.add(tfBuscaLivro);
        tfBuscaLivro.setBounds(420, 110, 200, 30);

        btBuscaLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Search_20px.png"))); // NOI18N
        btBuscaLivro.setContentAreaFilled(false);
        btBuscaLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBuscaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaLivroActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscaLivro);
        btBuscaLivro.setBounds(620, 110, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/TelaConsultaLivro.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linha = tbLivro.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }else if(JOptionPane.showConfirmDialog
        (rootPane, "Deseja realmente excluir?", "Excluir"
        , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            livro = livroDAO.pesquisarLivroId
        ((int) tbLivro.getValueAt(linha, 0));
            livroDAO.excluirLivro(livro);
            JOptionPane.showMessageDialog(rootPane, "Livro excluído!");
            atualizarTabela();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaCadastroLivro telaLivro = new TelaCadastroLivro();
        telaLivro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int linha = tbLivro.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }else{
            livro = livroDAO.pesquisarLivroId
        ((int) tbLivro.getValueAt(linha, 0));
            TelaCadastroLivro telaLivro = new TelaCadastroLivro();
            telaLivro.livro = livro;
            telaLivro.atualizarDados();
            telaLivro.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetornarActionPerformed
        int linha = tbLivro.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(rootPane, "Selecione unma linha!");
        }else{
            livro = livroDAO.pesquisarLivroId
            ((int) tbLivro.getValueAt(linha, 0));
            TelaCadastroReserva telaLivro = new TelaCadastroReserva();
            telaLivro.livro = livro;
            telaLivro.aluno = aluno;
            telaLivro.preencherLivro();
            telaLivro.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btRetornarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCadastroLivro telaLivro = new TelaCadastroLivro();
        telaLivro.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfBuscaLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscaLivroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(tfBuscaLivro.getText().equals("")){
            atualizarTabela();
        } else {
            atualizarBuscaLike(tfBuscaLivro.getText());
        }
        }
    }//GEN-LAST:event_tfBuscaLivroKeyPressed

    private void btBuscaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaLivroActionPerformed
        if(tfBuscaLivro.getText().equals("")){
            atualizarTabela();
        } else {
            atualizarBuscaLike(tfBuscaLivro.getText());
        }
    }//GEN-LAST:event_btBuscaLivroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsultarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaConsultarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscaLivro;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btRetornar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLivro;
    private javax.swing.JTextField tfBuscaLivro;
    // End of variables declaration//GEN-END:variables
}
