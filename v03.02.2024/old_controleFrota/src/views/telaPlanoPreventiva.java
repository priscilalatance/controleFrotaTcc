/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author maria
 */
public class telaPlanoPreventiva extends javax.swing.JFrame {

    /**
     * Creates new form telaPlanoPreventiva
     */
    public telaPlanoPreventiva() {
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
        cboItem = new javax.swing.JComboBox<>();
        cboFabricante = new javax.swing.JComboBox<>();
        btnConsultarKit = new javax.swing.JButton();
        cboAnoFabricacaoKit = new javax.swing.JComboBox<>();
        cboAnoModeloKit = new javax.swing.JComboBox<>();
        cboKmManutencaoKit = new javax.swing.JComboBox<>();
        cboMotorKit = new javax.swing.JComboBox<>();
        cboModeloKit = new javax.swing.JComboBox<>();
        cboMarcaKit = new javax.swing.JComboBox<>();
        cboAnoFabricacaoPlano = new javax.swing.JComboBox<>();
        cboAnoModeloPlano = new javax.swing.JComboBox<>();
        cboKmManutencaoPlano = new javax.swing.JComboBox<>();
        cboMotorPlano = new javax.swing.JComboBox<>();
        cboModeloPlano = new javax.swing.JComboBox<>();
        cboMarcaPlano = new javax.swing.JComboBox<>();
        btnTelaHistorico = new javax.swing.JButton();
        btnTelaPreventivaCorretiva = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnConsultarPlano = new javax.swing.JButton();
        scrpListaPlano = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKitporTipoVeiculo = new javax.swing.JTable();
        telaPlanoPreventiva = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abraão Lemos LTDA");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(cboItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 340, 30));

        jPanel1.add(cboFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 350, 30));

        btnConsultarKit.setContentAreaFilled(false);
        btnConsultarKit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnConsultarKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 500, 30, 30));

        jPanel1.add(cboAnoFabricacaoKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 510, 150, 30));

        jPanel1.add(cboAnoModeloKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 510, 150, 30));

        jPanel1.add(cboKmManutencaoKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, 160, 30));

        jPanel1.add(cboMotorKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 190, 30));

        jPanel1.add(cboModeloKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 150, 30));

        jPanel1.add(cboMarcaKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 150, 30));

        jPanel1.add(cboAnoFabricacaoPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 100, 150, 30));

        jPanel1.add(cboAnoModeloPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 100, 150, 30));

        jPanel1.add(cboKmManutencaoPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 160, 30));

        jPanel1.add(cboMotorPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 190, 30));

        jPanel1.add(cboModeloPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 150, 30));

        jPanel1.add(cboMarcaPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 150, 30));

        btnTelaHistorico.setContentAreaFilled(false);
        btnTelaHistorico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnTelaHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 240, 50));

        btnTelaPreventivaCorretiva.setContentAreaFilled(false);
        btnTelaPreventivaCorretiva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnTelaPreventivaCorretiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 240, 50));

        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 840, 140, 30));

        btnAlterar.setContentAreaFilled(false);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 840, 150, 30));

        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 840, 140, 30));

        btnRemover.setContentAreaFilled(false);
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 360, 130, 20));

        btnIncluir.setContentAreaFilled(false);
        btnIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 360, 130, 20));

        btnConsultarPlano.setContentAreaFilled(false);
        btnConsultarPlano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnConsultarPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 100, 40, 30));
        jPanel1.add(scrpListaPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 1100, 130));

        tblKitporTipoVeiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblKitporTipoVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MARCA", "MODELO", "MOTOR", "ANO MODELO", "ANO FABRICAÇÃO", "KM MANUTENÇÃO", "ITEM"
            }
        ));
        tblKitporTipoVeiculo.setRowHeight(30);
        jScrollPane1.setViewportView(tblKitporTipoVeiculo);
        if (tblKitporTipoVeiculo.getColumnModel().getColumnCount() > 0) {
            tblKitporTipoVeiculo.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblKitporTipoVeiculo.getColumnModel().getColumn(1).setPreferredWidth(40);
            tblKitporTipoVeiculo.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblKitporTipoVeiculo.getColumnModel().getColumn(3).setPreferredWidth(40);
            tblKitporTipoVeiculo.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblKitporTipoVeiculo.getColumnModel().getColumn(5).setPreferredWidth(40);
            tblKitporTipoVeiculo.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 1100, 210));

        telaPlanoPreventiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TelaPlanoPreventiva.png"))); // NOI18N
        jPanel1.add(telaPlanoPreventiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(telaPlanoPreventiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPlanoPreventiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPlanoPreventiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPlanoPreventiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPlanoPreventiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultarKit;
    private javax.swing.JButton btnConsultarPlano;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTelaHistorico;
    private javax.swing.JButton btnTelaPreventivaCorretiva;
    private javax.swing.JComboBox<String> cboAnoFabricacaoKit;
    private javax.swing.JComboBox<String> cboAnoFabricacaoPlano;
    private javax.swing.JComboBox<String> cboAnoModeloKit;
    private javax.swing.JComboBox<String> cboAnoModeloPlano;
    private javax.swing.JComboBox<String> cboFabricante;
    private javax.swing.JComboBox<String> cboItem;
    private javax.swing.JComboBox<String> cboKmManutencaoKit;
    private javax.swing.JComboBox<String> cboKmManutencaoPlano;
    private javax.swing.JComboBox<String> cboMarcaKit;
    private javax.swing.JComboBox<String> cboMarcaPlano;
    private javax.swing.JComboBox<String> cboModeloKit;
    private javax.swing.JComboBox<String> cboModeloPlano;
    private javax.swing.JComboBox<String> cboMotorKit;
    private javax.swing.JComboBox<String> cboMotorPlano;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.ScrollPane scrpListaPlano;
    private javax.swing.JTable tblKitporTipoVeiculo;
    private javax.swing.JLabel telaPlanoPreventiva;
    // End of variables declaration//GEN-END:variables
}