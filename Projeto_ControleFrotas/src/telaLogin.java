/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class telaLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaInicial
     */
    public telaLogin() {
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

        painelLogin = new javax.swing.JPanel();
        usuario = new app.bolivia.swing.JCTextField();
        senha = new jpass.JRPasswordField();
        btnLogin = new javax.swing.JButton();
        cadastroUsuario = new javax.swing.JButton();
        telaInicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abraão Lemos LTDA");
        setPreferredSize(new java.awt.Dimension(1600, 1000));
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        painelLogin.setPreferredSize(new java.awt.Dimension(1600, 1000));
        painelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBackground(new java.awt.Color(34, 102, 145));
        usuario.setBorder(null);
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuario.setOpaque(false);
        usuario.setPhColor(new java.awt.Color(255, 255, 255));
        usuario.setPlaceholder("USUARIO");
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioKeyReleased(evt);
            }
        });
        painelLogin.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 350, -1));

        senha.setBackground(new java.awt.Color(34, 102, 145));
        senha.setBorder(null);
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        senha.setName(""); // NOI18N
        senha.setOpaque(false);
        senha.setPhColor(new java.awt.Color(255, 255, 255));
        senha.setPlaceholder("SENHA");
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        painelLogin.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 518, 350, -1));

        btnLogin.setToolTipText("");
        painelLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 625, 160, 30));
        painelLogin.add(cadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 220, 30));

        telaInicial.setIcon(new javax.swing.ImageIcon("C:\\Users\\maria\\OneDrive\\Documentos\\NetBeansProjects\\Projeto_ControleFrotas\\img\\Tela Login.png")); // NOI18N
        telaInicial.setToolTipText("");
        telaInicial.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelLogin.add(telaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -30, 1561, -1));

        getContentPane().add(painelLogin);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyReleased
        usuario.setText(usuario.getText().toUpperCase());
    }//GEN-LAST:event_usuarioKeyReleased

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton cadastroUsuario;
    private javax.swing.JPanel painelLogin;
    private jpass.JRPasswordField senha;
    private javax.swing.JLabel telaInicial;
    private app.bolivia.swing.JCTextField usuario;
    // End of variables declaration//GEN-END:variables
}
