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
public class telaConfirmarSenha extends javax.swing.JFrame {

    /**
     * Creates new form telaConfirmarSenha
     */
    public telaConfirmarSenha() {
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
        senha = new jpass.JRPasswordField();
        confirmarSenha = new jpass.JRPasswordField();
        btnConfirmarNovaSenha = new javax.swing.JButton();
        telaConfirmarSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abraão Lemos LDTA");
        setMinimumSize(new java.awt.Dimension(10, 10));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        senha.setBackground(java.awt.SystemColor.controlHighlight);
        senha.setBorder(null);
        senha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        senha.setName(""); // NOI18N
        senha.setOpaque(false);
        senha.setPhColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 450, 320, 40));

        confirmarSenha.setBackground(java.awt.SystemColor.controlHighlight);
        confirmarSenha.setBorder(null);
        confirmarSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        confirmarSenha.setName(""); // NOI18N
        confirmarSenha.setOpaque(false);
        confirmarSenha.setPhColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(confirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, 320, -1));

        btnConfirmarNovaSenha.setContentAreaFilled(false);
        btnConfirmarNovaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarNovaSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmarNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, 260, 30));

        telaConfirmarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Confirmar Senha.png"))); // NOI18N
        jPanel1.add(telaConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarNovaSenhaActionPerformed
        new telaLogin().setVisible(true);  
    }//GEN-LAST:event_btnConfirmarNovaSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(telaConfirmarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaConfirmarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaConfirmarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaConfirmarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaConfirmarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarNovaSenha;
    private jpass.JRPasswordField confirmarSenha;
    private javax.swing.JPanel jPanel1;
    private jpass.JRPasswordField senha;
    private javax.swing.JLabel telaConfirmarSenha;
    // End of variables declaration//GEN-END:variables
}
