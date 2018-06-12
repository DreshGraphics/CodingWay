package codingway.telas;

import codingway.aluno.*;
import codingway.livro.*;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane1.setBounds(50, 20, 600, 420);

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltar);
        btVoltar.setBounds(50, 450, 100, 30);

        btEditar.setText("EDITAR");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btEditar);
        btEditar.setBounds(170, 450, 100, 30);

        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btExcluir);
        btExcluir.setBounds(290, 450, 100, 30);

        btRetornar.setText("RETORNAR");
        btRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        });
        jPanel1.add(btRetornar);
        btRetornar.setBounds(410, 450, 100, 30);

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
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btRetornar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLivro;
    // End of variables declaration//GEN-END:variables
}
