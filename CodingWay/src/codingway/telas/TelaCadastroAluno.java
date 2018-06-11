package codingway.telas;

import codingway.aluno.*;
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
    
   
    public TelaCadastroAluno(){
        initComponents();
        btExcluir.setEnabled(false);
        AlunoDAO = new AlunoDAO();
    }

    public void atualizarDados(){
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
    
    public void preencherAluno(){
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jbCurso = new javax.swing.JComboBox<>();
        tfMatricula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Aluno");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 10, 300, 50);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Matricula:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 120, 100, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 170, 100, 30);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 220, 100, 30);

        tfEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(tfEmail);
        tfEmail.setBounds(150, 220, 500, 30);

        tfNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(tfNome);
        tfNome.setBounds(150, 170, 500, 30);

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(0, 190, 170));
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Back_32px.png"))); // NOI18N
        btVoltar.setText("Voltar");
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
        btVoltar.setBounds(10, 430, 100, 50);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(0, 190, 170));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Broom_24px.png"))); // NOI18N
        btLimpar.setText("Limpar");
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
        btLimpar.setBounds(160, 430, 100, 50);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(0, 190, 170));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Search_32px_1.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
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
        btPesquisar.setBounds(300, 430, 100, 50);

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(0, 190, 170));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Empty_Trash_32px.png"))); // NOI18N
        btExcluir.setText("Excluir");
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
        btExcluir.setBounds(450, 430, 100, 50);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(0, 190, 170));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codingway/imagens/icons8_Save_24px.png"))); // NOI18N
        btSalvar.setText("Salvar");
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
        btSalvar.setBounds(590, 430, 100, 50);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Curso:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 270, 100, 30);

        jbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Análise de Sistemas", "Ciências Contábeis", "Direito", "Educação Fisica", "Enfermagem", "Fisioterápia", "Psicologia", " " }));
        jPanel1.add(jbCurso);
        jbCurso.setBounds(150, 270, 200, 30);

        tfMatricula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(tfMatricula);
        tfMatricula.setBounds(150, 120, 200, 30);

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
        btExcluir.setEnabled(false);
        aluno = new Aluno();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        TelaConsultarAluno telaPesquisa = new TelaConsultarAluno();
        telaPesquisa.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if(AlunoDAO.pesquisarEmail(tfEmail.getText()) == null || 
                AlunoDAO.pesquisarEmail(tfEmail.getText()).getEmail().equals(aluno.getEmail())){
            
                
        if(tfMatricula.getText().equals("") || tfNome.getText().equals("") || tfEmail.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        } else {         
        aluno.setMatricula(Integer.parseInt(tfMatricula.getText()));
        aluno.setAluno(tfNome.getText().toUpperCase());
        aluno.setCurso(String.valueOf(jbCurso.getSelectedItem()));
        aluno.setEmail(tfEmail.getText());
        
        if(aluno.getIdAluno()== 0){
            AlunoDAO.salvarAluno(aluno);
            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso");
            limparCampos();
        }  else{
            AlunoDAO.editarAluno(aluno);
            JOptionPane.showMessageDialog(this, "Aluno editado com sucesso");
            limparCampos();
        }

        }
        
        } else {
            JOptionPane.showMessageDialog(this, "O email já existe");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

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
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
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
