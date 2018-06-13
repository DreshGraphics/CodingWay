package codingway.telas;

import codingway.aluno.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dresh
 */
public class TelaConsultarAluno extends javax.swing.JFrame {

    Aluno aluno = new Aluno();
    AlunoDAO alunoDAO = new AlunoDAO();
    
    public TelaConsultarAluno() {
        initComponents();
        atualizarTabela();
    }
    
    public void atualizarTabela(){
        AlunoTableModel modelo = new 
        AlunoTableModel(alunoDAO.listarAluno());
        tbAluno.setModel(modelo);
    }
    
    public void atualizarTabelaCurso(String curso){
        AlunoTableModel modelo = new 
        AlunoTableModel(alunoDAO.listarAlunoCurso(curso));
        tbAluno.setModel(modelo);
    }
    
    public void atualizarTabelaLike(String busca){
        AlunoTableModel modelo = new 
        AlunoTableModel(alunoDAO.listarBusca(busca));
        tbAluno.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAluno = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btRetornar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbCurso = new javax.swing.JComboBox<>();
        tfBuscaAluno = new javax.swing.JTextField();
        btBuscaAluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        tbAluno.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbAluno);

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

        jbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curso", "Administração", "Análise de Sistemas", "Ciências Contábeis", "Direito", "Educação Fisica", "Enfermagem", "Fisioterápia", "Psicologia", "Serviço Social" }));
        jbCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jbCursoItemStateChanged(evt);
            }
        });
        jPanel1.add(jbCurso);
        jbCurso.setBounds(50, 110, 180, 30);

        tfBuscaAluno.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfBuscaAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscaAlunoKeyPressed(evt);
            }
        });
        jPanel1.add(tfBuscaAluno);
        tfBuscaAluno.setBounds(330, 110, 210, 30);

        btBuscaAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btBuscaAluno.setForeground(new java.awt.Color(0, 0, 51));
        btBuscaAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Search_20px.png"))); // NOI18N
        btBuscaAluno.setText("ALUNO");
        btBuscaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscaAluno);
        btBuscaAluno.setBounds(550, 110, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/TelaConsultaAluno.png"))); // NOI18N
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
        int linha = tbAluno.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }else if(JOptionPane.showConfirmDialog
        (rootPane, "Deseja realmente excluir?", "Excluir"
        , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            aluno = alunoDAO.pesquisarAlunoId
        ((int) tbAluno.getValueAt(linha, 0));
            alunoDAO.excluirAluno(aluno);
            JOptionPane.showMessageDialog(rootPane, "Aluno excluído!");
            atualizarTabela();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaCadastroAluno telaAluno = new TelaCadastroAluno();
        telaAluno.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int linha = tbAluno.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }else{
            aluno = alunoDAO.pesquisarAlunoId
        ((int) tbAluno.getValueAt(linha, 0));
            TelaCadastroAluno telaAluno = new TelaCadastroAluno();
            telaAluno.aluno = aluno;
            telaAluno.atualizarDados();
            telaAluno.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetornarActionPerformed
        int linha = tbAluno.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(rootPane, "Selecione unma linha!");
        }else{
            aluno = alunoDAO.pesquisarAlunoId
            ((int) tbAluno.getValueAt(linha, 0));

            TelaCadastroReserva telaReserva = new TelaCadastroReserva();
            telaReserva.aluno = aluno;
            telaReserva.preencherAluno();
            telaReserva.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btRetornarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCadastroAluno telaAluno = new TelaCadastroAluno();
        telaAluno.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jbCursoItemStateChanged
        if(jbCurso.getSelectedItem().equals("Administração")){
            String curso = "Administração";
            atualizarTabelaCurso(curso);
        } else if(jbCurso.getSelectedItem().equals("Análise de Sistemas")){
            String curso = "Análise de Sistemas";
            atualizarTabelaCurso(curso);
        } else if(jbCurso.getSelectedItem().equals("Ciências Contábeis")){
            String curso = "Ciências Contábeis";
            atualizarTabelaCurso(curso);
        } else if(jbCurso.getSelectedItem().equals("Direito")){
            String curso = "Direito";
            atualizarTabelaCurso(curso);
        } else if(jbCurso.getSelectedItem().equals("Educação Fisica")){
            String curso = "Educação Fisica";
            atualizarTabelaCurso(curso);
        } else if(jbCurso.getSelectedItem().equals("Enfermagem")){
            String curso = "Enfermagem";
            atualizarTabelaCurso(curso);
        } else if(jbCurso.getSelectedItem().equals("Fisioterápia")){
            String curso = "Fisioterápia";
            atualizarTabelaCurso(curso);
        } else if(jbCurso.getSelectedItem().equals("Psicologia")){
            String curso = "Psicologia";
            atualizarTabelaCurso(curso);
        } else if(jbCurso.getSelectedItem().equals("Serviço Social")){
            String curso = "Serviço Social";
            atualizarTabelaCurso(curso);
        } else {
            atualizarTabela();
        }
    }//GEN-LAST:event_jbCursoItemStateChanged

    private void btBuscaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaAlunoActionPerformed
        atualizarTabelaLike(tfBuscaAluno.getText());
    }//GEN-LAST:event_btBuscaAlunoActionPerformed

    private void tfBuscaAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscaAlunoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(tfBuscaAluno.getText().equals("")){
                atualizarTabela();
            } else {
                atualizarTabelaLike(tfBuscaAluno.getText());
        }
      }
    }//GEN-LAST:event_tfBuscaAlunoKeyPressed

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
            java.util.logging.Logger.getLogger(TelaConsultarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscaAluno;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btRetornar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jbCurso;
    private javax.swing.JTable tbAluno;
    private javax.swing.JTextField tfBuscaAluno;
    // End of variables declaration//GEN-END:variables
}
