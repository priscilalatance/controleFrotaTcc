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
public class telaRedefinirSenha extends javax.swing.JFrame {

    /**
     * Creates new form telaRedefinirSenha
     */
    public telaRedefinirSenha() {
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

        jPanel1 = new javax.swing.JPanel();
        usuario = new app.bolivia.swing.JCTextField();
        txtCPF = new app.bolivia.swing.JCTextField();
        btnEnviarEmail = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        telaRedefinirSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abraão Lemos LTDA");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(10, 10));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBackground(java.awt.SystemColor.controlHighlight);
        usuario.setBorder(null);
        usuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usuario.setOpaque(false);
        usuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioKeyReleased(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 450, -1));

        txtCPF.setBackground(java.awt.SystemColor.controlHighlight);
        txtCPF.setBorder(null);
        txtCPF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCPF.setOpaque(false);
        txtCPF.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCPFKeyReleased(evt);
            }
        });
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 280, -1));

        btnEnviarEmail.setBorderPainted(false);
        btnEnviarEmail.setContentAreaFilled(false);
        btnEnviarEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEnviarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 590, 130, 30));

        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 130, 30));

        telaRedefinirSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Redefinir Senha.png"))); // NOI18N
        telaRedefinirSenha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        telaRedefinirSenha.setMaximumSize(null);
        telaRedefinirSenha.setMinimumSize(null);
        telaRedefinirSenha.setName(""); // NOI18N
        telaRedefinirSenha.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(telaRedefinirSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 5, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyReleased
        //usuario.setText(usuario.getText().toUpperCase());
    }//GEN-LAST:event_usuarioKeyReleased

    private void txtCPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFKeyReleased

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
            java.util.logging.Logger.getLogger(telaRedefinirSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaRedefinirSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaRedefinirSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaRedefinirSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaRedefinirSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarEmail;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel telaRedefinirSenha;
    private app.bolivia.swing.JCTextField txtCPF;
    private app.bolivia.swing.JCTextField usuario;
    // End of variables declaration//GEN-END:variables
}
