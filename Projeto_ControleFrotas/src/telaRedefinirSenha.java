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
        btnEnviarEmail = new javax.swing.JButton();
        telaRedefinirSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abraão Lemos LTDA");
        setLocationByPlatform(true);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(10, 10));
        setPreferredSize(new java.awt.Dimension(1440, 900));
        getContentPane().setLayout(new java.awt.FlowLayout());

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
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 540, -1));

        btnEnviarEmail.setContentAreaFilled(false);
        btnEnviarEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEnviarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 330, 40));

        telaRedefinirSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Redefinir Senha.png"))); // NOI18N
        telaRedefinirSenha.setMaximumSize(null);
        telaRedefinirSenha.setMinimumSize(null);
        telaRedefinirSenha.setName(""); // NOI18N
        jPanel1.add(telaRedefinirSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 900));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyReleased
        //usuario.setText(usuario.getText().toUpperCase());
    }//GEN-LAST:event_usuarioKeyReleased

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel telaRedefinirSenha;
    private app.bolivia.swing.JCTextField usuario;
    // End of variables declaration//GEN-END:variables
}
