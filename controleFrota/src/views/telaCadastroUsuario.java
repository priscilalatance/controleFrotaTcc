package views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class telaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form telaCadastroUsuario
     */
    public telaCadastroUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        nome = new app.bolivia.swing.JCTextField();
        endereco = new app.bolivia.swing.JCTextField();
        telefone = new app.bolivia.swing.JCTextField();
        email = new app.bolivia.swing.JCTextField();
        cpf = new app.bolivia.swing.JCTextField();
        re = new app.bolivia.swing.JCTextField();
        senha = new jpass.JRPasswordField();
        confirmarSenha = new jpass.JRPasswordField();
        reConsultar = new app.bolivia.swing.JCTextField();
        btnConsultarRE = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        telaCadastroUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abraão Lemos LTDA");
        setMinimumSize(new java.awt.Dimension(10, 10));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome.setBackground(java.awt.SystemColor.controlHighlight);
        nome.setBorder(null);
        nome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nome.setOpaque(false);
        nome.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeKeyReleased(evt);
            }
        });
        jPanel2.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 470, -1));

        endereco.setBackground(java.awt.SystemColor.controlHighlight);
        endereco.setBorder(null);
        endereco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        endereco.setOpaque(false);
        endereco.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        endereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enderecoKeyReleased(evt);
            }
        });
        jPanel2.add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 720, -1));

        telefone.setBackground(java.awt.SystemColor.controlHighlight);
        telefone.setBorder(null);
        telefone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        telefone.setOpaque(false);
        telefone.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        telefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefoneKeyReleased(evt);
            }
        });
        jPanel2.add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 320, -1));

        email.setBackground(java.awt.SystemColor.controlHighlight);
        email.setBorder(null);
        email.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        email.setOpaque(false);
        email.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 510, -1));

        cpf.setBackground(java.awt.SystemColor.controlHighlight);
        cpf.setBorder(null);
        cpf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cpf.setOpaque(false);
        cpf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpfKeyReleased(evt);
            }
        });
        jPanel2.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, 320, -1));

        re.setBackground(java.awt.SystemColor.controlHighlight);
        re.setBorder(null);
        re.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        re.setOpaque(false);
        re.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        re.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                reKeyReleased(evt);
            }
        });
        jPanel2.add(re, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 230, 180, -1));

        senha.setBackground(java.awt.SystemColor.controlHighlight);
        senha.setBorder(null);
        senha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        senha.setName(""); // NOI18N
        senha.setOpaque(false);
        senha.setPhColor(new java.awt.Color(255, 255, 255));
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        jPanel2.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 320, -1));

        confirmarSenha.setBackground(java.awt.SystemColor.controlHighlight);
        confirmarSenha.setBorder(null);
        confirmarSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        confirmarSenha.setName(""); // NOI18N
        confirmarSenha.setOpaque(false);
        confirmarSenha.setPhColor(new java.awt.Color(255, 255, 255));
        confirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(confirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 610, 320, -1));

        reConsultar.setBackground(java.awt.SystemColor.controlHighlight);
        reConsultar.setBorder(null);
        reConsultar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reConsultar.setOpaque(false);
        reConsultar.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        reConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                reConsultarKeyReleased(evt);
            }
        });
        jPanel2.add(reConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 180, 30));

        btnConsultarRE.setContentAreaFilled(false);
        btnConsultarRE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnConsultarRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 40, 40));

        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 680, 160, 40));

        btnAlterar.setContentAreaFilled(false);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 680, 150, 40));

        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 680, 140, 40));
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 480, 30, 30));

        telaCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Tela Cadastro Usuário.png"))); // NOI18N
        jPanel2.add(telaCadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyReleased
        //usuario.setText(usuario.getText().toUpperCase());
    }//GEN-LAST:event_nomeKeyReleased

    private void enderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enderecoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoKeyReleased

    private void reKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_reKeyReleased

    private void telefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_emailKeyReleased

    private void cpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfKeyReleased

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void confirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarSenhaActionPerformed

    private void reConsultarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reConsultarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_reConsultarKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        new telaInicial().setVisible(true);  
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new telaInicial().setVisible(true);  
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultarRE;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private jpass.JRPasswordField confirmarSenha;
    private app.bolivia.swing.JCTextField cpf;
    private app.bolivia.swing.JCTextField email;
    private app.bolivia.swing.JCTextField endereco;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private app.bolivia.swing.JCTextField nome;
    private app.bolivia.swing.JCTextField re;
    private app.bolivia.swing.JCTextField reConsultar;
    private jpass.JRPasswordField senha;
    private javax.swing.JLabel telaCadastroUsuario;
    private app.bolivia.swing.JCTextField telefone;
    // End of variables declaration//GEN-END:variables
}