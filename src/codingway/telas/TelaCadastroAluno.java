package codingway.telas;

import codingway.aluno.*;
import codingway.usuario.Usuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dresh
 */
public class TelaCadastroAluno extends javax.swing.JFrame {

    Aluno aluno = new Aluno();
    AlunoDAO AlunoDAO;
    

    Date data = new Date();

    public TelaCadastroAluno() {
        initComponents();
        AlunoDAO = new AlunoDAO();
    }
    
    public void atualizarDados() {
        tfMatricula.setText(String.valueOf(aluno.getMatricula()));
        tfNome.setText(aluno.getAluno());
        jbCurso.setSelectedItem(aluno.getCurso());
        tfEmail.setText(aluno.getEmail());
    }

    private void limparCampos() {
        aluno = new Aluno();
        tfNome.setText("");
        tfEmail.setText("");
        tfMatricula.setText("");
    }

    public void preencherAluno() {
        tfNome.setText(aluno.getAluno());
    }

    private Date formataData(String data) {
        if (data == null || data.equals("")) {
            return null;
        }
        Date d = null;
        try {
            DateFormat formatar = new SimpleDateFormat("dd/mm/yyyy");
            d = formatar.parse(data);
        } catch (ParseException e) {

        }
        return d;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jbCurso = new javax.swing.JComboBox<>();
        tfMatricula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Matricula:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 140, 100, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 190, 100, 30);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 240, 100, 30);

        tfEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(tfEmail);
        tfEmail.setBounds(150, 240, 500, 30);

        tfNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(tfNome);
        tfNome.setBounds(150, 190, 500, 30);

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Back_18px.png"))); // NOI18N
        btVoltar.setText("VOLTAR");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltar);
        btVoltar.setBounds(30, 430, 110, 50);

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Broom_18px.png"))); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpar);
        btLimpar.setBounds(170, 430, 110, 50);

        btPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Search_18px.png"))); // NOI18N
        btPesquisar.setText("PESQUISAR");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisar);
        btPesquisar.setBounds(420, 430, 110, 50);

        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Save_18px.png"))); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar);
        btSalvar.setBounds(560, 430, 110, 50);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Curso:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 290, 100, 30);

        jbCurso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Análise de Sistemas", "Ciências Contábeis", "Direito", "Educação Fisica", "Enfermagem", "Fisioterápia", "Psicologia", "Serviço Social" }));
        jPanel1.add(jbCurso);
        jbCurso.setBounds(150, 290, 200, 30);

        tfMatricula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfMatricula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(tfMatricula);
        tfMatricula.setBounds(150, 140, 200, 30);

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/TelaCadastroAluno.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 500);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
        aluno = new Aluno();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        TelaConsultarAluno telaPesquisa = new TelaConsultarAluno();
        telaPesquisa.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if ((AlunoDAO.pesquisarEmail(tfEmail.getText()) == null || AlunoDAO.pesquisarEmail(tfEmail.getText()).getEmail().equals(aluno.getEmail()))
                || (AlunoDAO.pesquisarEmail(tfMatricula.getText()) == null || AlunoDAO.pesquisarMatricula(Integer.parseInt(tfEmail.getText())).getMatricula() == aluno.getMatricula())) {
            if (tfMatricula.getText().equals("") || tfNome.getText().equals("") || tfEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            } else {
                aluno.setMatricula(Integer.parseInt(tfMatricula.getText()));
                aluno.setAluno(tfNome.getText().toUpperCase());
                aluno.setCurso(String.valueOf(jbCurso.getSelectedItem()));
                aluno.setEmail(tfEmail.getText());

                if (aluno.getIdAluno() == 0) {
                    AlunoDAO.salvarAluno(aluno);
                    JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso");
                    limparCampos();
                } else {
                    AlunoDAO.editarAluno(aluno);
                    JOptionPane.showMessageDialog(this, "Aluno editado com sucesso");
                    limparCampos();
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "O email ou matricula já existe");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
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
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jbCurso;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void setModal(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
