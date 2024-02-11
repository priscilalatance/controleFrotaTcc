/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import config.CadastroItem;
import config.Conectar;
import config.PlanoItemManutencaoDao;
import config.PlanoManutencao;
import config.PlanoManutencaoDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class telaConsultaKitManutencao extends javax.swing.JFrame {

    //Criando a conexão com o banco
    Conectar con = new Conectar();
    Connection cn = con.conexao();

    public telaConsultaKitManutencao() {
        this.con = new Conectar();
        initComponents();
        popularJComboBoxConsultarKit();
        popularJComboBoxConsultarItemKit();
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
        cboModeloItemKit = new javax.swing.JComboBox<>();
        cboMotorItemKit = new javax.swing.JComboBox<>();
        cboKmManutItemKit = new javax.swing.JComboBox<>();
        cboAnoFabriItemKit = new javax.swing.JComboBox<>();
        cboAnoModItemKit = new javax.swing.JComboBox<>();
        cboMarcaKitVei = new javax.swing.JComboBox<>();
        cboModeloKitVei = new javax.swing.JComboBox<>();
        cboMotorKitVei = new javax.swing.JComboBox<>();
        cboAnoFabriKitVei = new javax.swing.JComboBox<>();
        cboAnoModKitVei = new javax.swing.JComboBox<>();
        btnConsultarItem = new javax.swing.JButton();
        btnLimparItem = new javax.swing.JButton();
        btnConsultarKit = new javax.swing.JButton();
        btnLimparKit = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKitporTipoVeiculo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKitporTipoVeiculo1 = new javax.swing.JTable();
        telaConsultaKitManutencao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abraão Lemos LTDA");
        setAlwaysOnTop(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(cboModeloItemKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 170, 30));

        jPanel1.add(cboMotorItemKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 210, 30));

        jPanel1.add(cboKmManutItemKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 150, 30));

        jPanel1.add(cboAnoFabriItemKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, 170, 30));

        jPanel1.add(cboAnoModItemKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 100, 170, 30));

        jPanel1.add(cboMarcaKitVei, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 180, 30));

        jPanel1.add(cboModeloKitVei, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 190, 30));

        jPanel1.add(cboMotorKitVei, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 180, 30));

        jPanel1.add(cboAnoFabriKitVei, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 520, 150, 30));

        jPanel1.add(cboAnoModKitVei, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 520, 140, 30));

        btnConsultarItem.setContentAreaFilled(false);
        btnConsultarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarItemActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 100, -1, 30));

        btnLimparItem.setContentAreaFilled(false);
        btnLimparItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparItemActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimparItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1353, 100, 40, 30));

        btnConsultarKit.setContentAreaFilled(false);
        btnConsultarKit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarKitActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 520, -1, 30));

        btnLimparKit.setContentAreaFilled(false);
        btnLimparKit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparKitActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimparKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1353, 520, 40, 30));

        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 860, 140, 30));

        tblKitporTipoVeiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblKitporTipoVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓD. ITEM", "DESCRIÇÃO ITEM", "MARCA", "MODELO", "COR", "ANO FABRICAÇÃO", "ANO MODELO", "VALOR UNIT."
            }
        ));
        tblKitporTipoVeiculo.setRowHeight(30);
        jScrollPane1.setViewportView(tblKitporTipoVeiculo);
        if (tblKitporTipoVeiculo.getColumnModel().getColumnCount() > 0) {
            tblKitporTipoVeiculo.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblKitporTipoVeiculo.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblKitporTipoVeiculo.getColumnModel().getColumn(2).setPreferredWidth(40);
            tblKitporTipoVeiculo.getColumnModel().getColumn(3).setPreferredWidth(40);
            tblKitporTipoVeiculo.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblKitporTipoVeiculo.getColumnModel().getColumn(5).setPreferredWidth(45);
            tblKitporTipoVeiculo.getColumnModel().getColumn(6).setPreferredWidth(30);
            tblKitporTipoVeiculo.getColumnModel().getColumn(7).setPreferredWidth(30);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 1080, 270));

        tblKitporTipoVeiculo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblKitporTipoVeiculo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MARCA", "MODELO", "MOTOR", "ANO MODELO", "ANO FABRICAÇÃO", "KM MANUTENÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKitporTipoVeiculo1.setRowHeight(30);
        jScrollPane2.setViewportView(tblKitporTipoVeiculo1);
        if (tblKitporTipoVeiculo1.getColumnModel().getColumnCount() > 0) {
            tblKitporTipoVeiculo1.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 1080, 270));

        telaConsultaKitManutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TelaConsultaKitManutencao.png"))); // NOI18N
        jPanel1.add(telaConsultaKitManutencao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarKitActionPerformed
        // TODO add your handling code here:

        PlanoManutencaoDao dao = new PlanoManutencaoDao();
        String marca = cboMarcaKitVei.getSelectedItem().toString();
        String modelo = cboModeloKitVei.getSelectedItem().toString();
        String motor = cboMotorKitVei.getSelectedItem().toString();
        Integer anoModelo = (Integer.parseInt(cboAnoModKitVei.getSelectedItem().toString()));
        Integer anoFabricacao = (Integer.parseInt(cboAnoFabriKitVei.getSelectedItem().toString()));

        List<PlanoManutencao> planoEncontrado = dao.consultarPorTipoVeiculo(marca, modelo, motor, anoModelo, anoFabricacao);

        if (planoEncontrado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado com a descrição fornecida.");
        } else {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Marca");
            model.addColumn("Modelo");
            model.addColumn("Motor");
            model.addColumn("Ano Modelo");
            model.addColumn("Ano Fabricação");
            model.addColumn("Km Manutençao");

            for (PlanoManutencao plano : planoEncontrado) {
                model.addRow(new Object[]{
                    plano.getMarca(),
                    plano.getModelo(),
                    plano.getMotor(),
                    plano.getAnoModelo(),
                    plano.getAnoFabricacao(),
                    plano.getKmManutencao(),
                });
            }

            tblKitporTipoVeiculo1.setModel(model);
        }
    }//GEN-LAST:event_btnConsultarKitActionPerformed

    private void btnLimparKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparKitActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblKitporTipoVeiculo1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnLimparKitActionPerformed

    private void btnConsultarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarItemActionPerformed
        // TODO add your handling code here:

        PlanoItemManutencaoDao dao = new PlanoItemManutencaoDao();
        String modelo = cboModeloItemKit.getSelectedItem().toString();
        String motor = cboMotorItemKit.getSelectedItem().toString();
        Integer km = (Integer.parseInt(cboKmManutItemKit.getSelectedItem().toString()));
        Integer anoModelo = (Integer.parseInt(cboAnoModItemKit.getSelectedItem().toString()));
        Integer anoFabricacao = (Integer.parseInt(cboAnoFabriItemKit.getSelectedItem().toString()));

        List<CadastroItem> itensKit = dao.consultarPorItem(modelo, motor, km, anoModelo, anoFabricacao);

        if (itensKit.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado com a descrição fornecida.");
        } else {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Código Item");
            model.addColumn("Descrição Item");
            model.addColumn("Marca");
            model.addColumn("Modelo");
            model.addColumn("Cor");
            model.addColumn("Ano Fabricação");
            model.addColumn("Ano Modelo");
            model.addColumn("Valor Unitário");

            for (CadastroItem item : itensKit) {
                model.addRow(new Object[]{
                    item.getIdCodigo(),
                    item.getDescricaoItem(),                    
                    item.getMarca(),
                    item.getModelo(),
                    item.getCor(),
                    item.getAnoFabricacao(),
                    item.getAnoModelo(),
                    item.getValorUnitario()
                });
            }

            tblKitporTipoVeiculo.setModel(model);
        }

    }//GEN-LAST:event_btnConsultarItemActionPerformed

    private void btnLimparItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparItemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblKitporTipoVeiculo.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnLimparItemActionPerformed

    public void popularJComboBoxConsultarKit() {
        try {

            String sqlMarca = "SELECT DISTINCT marca FROM veiculo ORDER BY marca ASC";
            Statement stMarca = cn.createStatement();
            ResultSet rsMarca = stMarca.executeQuery(sqlMarca);
            while (rsMarca.next()) {
                cboMarcaKitVei.addItem(rsMarca.getString("marca"));
            }

            String sqlModelo = "SELECT DISTINCT modelo FROM veiculo ORDER BY modelo ASC";
            Statement stModelo = cn.createStatement();
            ResultSet rsModelo = stModelo.executeQuery(sqlModelo);
            while (rsModelo.next()) {
                cboModeloKitVei.addItem(rsModelo.getString("modelo"));
            }

            String sqlMotor = "SELECT DISTINCT motor FROM veiculo ORDER BY motor ASC";
            Statement stMotor = cn.createStatement();
            ResultSet rsMotor = stMotor.executeQuery(sqlMotor);
            while (rsMotor.next()) {
                cboMotorKitVei.addItem(rsMotor.getString("motor"));
            }

            String sqlAnoModelo = "SELECT DISTINCT anoModelo FROM veiculo ORDER BY anoModelo ASC";
            Statement stAnoModelo = cn.createStatement();
            ResultSet rsAnoModelo = stAnoModelo.executeQuery(sqlAnoModelo);
            while (rsAnoModelo.next()) {
                cboAnoModKitVei.addItem(rsAnoModelo.getString("anoModelo"));
            }

            String sqlAnoFabricacao = "SELECT DISTINCT anoFabricacao FROM veiculo ORDER BY anoFabricacao ASC";
            Statement stAnoFabricacao = cn.createStatement();
            ResultSet rsAnoFabricacao = stAnoFabricacao.executeQuery(sqlAnoFabricacao);
            while (rsAnoFabricacao.next()) {
                cboAnoFabriKitVei.addItem(rsAnoFabricacao.getString("anoFabricacao"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void popularJComboBoxConsultarItemKit() {
        try {

            String sqlModelo = "SELECT DISTINCT modelo FROM veiculo ORDER BY modelo ASC";
            Statement stModelo = cn.createStatement();
            ResultSet rsModelo = stModelo.executeQuery(sqlModelo);
            while (rsModelo.next()) {
                cboModeloItemKit.addItem(rsModelo.getString("modelo"));
            }

            String sqlMotor = "SELECT DISTINCT motor FROM veiculo ORDER BY motor ASC";
            Statement stMotor = cn.createStatement();
            ResultSet rsMotor = stMotor.executeQuery(sqlMotor);
            while (rsMotor.next()) {
                cboMotorItemKit.addItem(rsMotor.getString("motor"));
            }

            String sqlAnoModelo = "SELECT DISTINCT anoModelo FROM veiculo ORDER BY anoModelo ASC";
            Statement stAnoModelo = cn.createStatement();
            ResultSet rsAnoModelo = stAnoModelo.executeQuery(sqlAnoModelo);
            while (rsAnoModelo.next()) {
                cboAnoModItemKit.addItem(rsAnoModelo.getString("anoModelo"));
            }

            String sqlAnoFabricacao = "SELECT DISTINCT anoFabricacao FROM veiculo ORDER BY anoFabricacao ASC";
            Statement stAnoFabricacao = cn.createStatement();
            ResultSet rsAnoFabricacao = stAnoFabricacao.executeQuery(sqlAnoFabricacao);
            while (rsAnoFabricacao.next()) {
                cboAnoFabriItemKit.addItem(rsAnoFabricacao.getString("anoFabricacao"));
            }

            Integer[] kmManutencao = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
            for (Integer km : kmManutencao) {
                cboKmManutItemKit.addItem(km.toString());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(telaConsultaKitManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaConsultaKitManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaConsultaKitManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaConsultaKitManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaConsultaKitManutencao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarItem;
    private javax.swing.JButton btnConsultarKit;
    private javax.swing.JButton btnLimparItem;
    private javax.swing.JButton btnLimparKit;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cboAnoFabriItemKit;
    private javax.swing.JComboBox<String> cboAnoFabriKitVei;
    private javax.swing.JComboBox<String> cboAnoModItemKit;
    private javax.swing.JComboBox<String> cboAnoModKitVei;
    private javax.swing.JComboBox<String> cboKmManutItemKit;
    private javax.swing.JComboBox<String> cboMarcaKitVei;
    private javax.swing.JComboBox<String> cboModeloItemKit;
    private javax.swing.JComboBox<String> cboModeloKitVei;
    private javax.swing.JComboBox<String> cboMotorItemKit;
    private javax.swing.JComboBox<String> cboMotorKitVei;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblKitporTipoVeiculo;
    private javax.swing.JTable tblKitporTipoVeiculo1;
    private javax.swing.JLabel telaConsultaKitManutencao;
    // End of variables declaration//GEN-END:variables
}