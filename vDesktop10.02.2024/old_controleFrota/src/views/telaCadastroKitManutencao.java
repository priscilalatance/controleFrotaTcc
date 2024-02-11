/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import config.Conectar;
import config.ConexaoPadrao;
import config.PlanoItemManutencao;
import config.PlanoItemManutencaoDao;
import config.PlanoManutencao;
import config.PlanoManutencaoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class telaCadastroKitManutencao extends javax.swing.JFrame {

    //Criando a conexão com o banco
    Conectar con = new Conectar();
    Connection cn = con.conexao();

    public telaCadastroKitManutencao() {
        this.con = new Conectar();
        initComponents();
        popularJComboBoxCadastrarKit();
        popularJComboBoxCadastrarItemAoKit();
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
        cboMarcaKit = new javax.swing.JComboBox<>();
        cboModeloKit = new javax.swing.JComboBox<>();
        cboMotorKit = new javax.swing.JComboBox<>();
        cboKmManutKit = new javax.swing.JComboBox<>();
        cboAnoModKit = new javax.swing.JComboBox<>();
        cboAnoFabriKit = new javax.swing.JComboBox<>();
        txtCodItemPlano = new app.bolivia.swing.JCTextField();
        cboModeloPlano = new javax.swing.JComboBox<>();
        cboMotorPlano = new javax.swing.JComboBox<>();
        cboKmManutPlano = new javax.swing.JComboBox<>();
        cboAnoModPlano = new javax.swing.JComboBox<>();
        cboAnoFabriPlano = new javax.swing.JComboBox<>();
        btnIncluirKit = new javax.swing.JButton();
        btnAlterarKit = new javax.swing.JButton();
        btnIncluirPlano = new javax.swing.JButton();
        btnExcluirPlano = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        telaCadastroKitManutencao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abraão Lemos LTDA");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(cboMarcaKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 260, 30));

        jPanel1.add(cboModeloKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 240, 30));

        jPanel1.add(cboMotorKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 230, 30));

        jPanel1.add(cboKmManutKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, 210, 30));

        jPanel1.add(cboAnoModKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 260, 30));

        jPanel1.add(cboAnoFabriKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 240, 30));

        txtCodItemPlano.setBorder(null);
        txtCodItemPlano.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCodItemPlano.setOpaque(false);
        txtCodItemPlano.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCodItemPlano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodItemPlanoKeyReleased(evt);
            }
        });
        jPanel1.add(txtCodItemPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 210, 30));

        jPanel1.add(cboModeloPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 230, 30));

        jPanel1.add(cboMotorPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, 230, 30));

        jPanel1.add(cboKmManutPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, 180, 30));

        jPanel1.add(cboAnoModPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 570, 140, 30));

        jPanel1.add(cboAnoFabriPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 570, 150, 30));

        btnIncluirKit.setContentAreaFilled(false);
        btnIncluirKit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIncluirKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirKitActionPerformed(evt);
            }
        });
        jPanel1.add(btnIncluirKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 40, 40));

        btnAlterarKit.setContentAreaFilled(false);
        btnAlterarKit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarKitActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterarKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 260, 50, 40));

        btnIncluirPlano.setContentAreaFilled(false);
        btnIncluirPlano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIncluirPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirPlanoActionPerformed(evt);
            }
        });
        jPanel1.add(btnIncluirPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, 40, 40));

        btnExcluirPlano.setContentAreaFilled(false);
        btnExcluirPlano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPlanoActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluirPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 50, 40));

        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 820, 150, 40));

        telaCadastroKitManutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TelaCadastroKitManutencao.png"))); // NOI18N
        jPanel1.add(telaCadastroKitManutencao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodItemPlanoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodItemPlanoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodItemPlanoKeyReleased

    void limparCampos() {
        txtCodItemPlano.setText("");
    }
    private void btnIncluirKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirKitActionPerformed
        // TODO add your handling code here:
        PlanoManutencaoDao dao = new PlanoManutencaoDao();

        if (dao.NoEqualsVeiculo(cboMarcaKit.getSelectedItem().toString(), cboModeloKit.getSelectedItem().toString(),
                cboMotorKit.getSelectedItem().toString(), (Integer.parseInt(cboAnoModKit.getSelectedItem().toString())),
                (Integer.parseInt(cboAnoFabriKit.getSelectedItem().toString()))) == 0) {

            JOptionPane.showMessageDialog(null, "Não existe veiculo cadastrado, devido a isso não é possivel cadastrar um Kit associado.");

        } else if (dao.equalsKit(cboMarcaKit.getSelectedItem().toString(), cboModeloKit.getSelectedItem().toString(),
                cboMotorKit.getSelectedItem().toString(), (Integer.parseInt(cboKmManutKit.getSelectedItem().toString())),
                (Integer.parseInt(cboAnoModKit.getSelectedItem().toString())), (Integer.parseInt(cboAnoFabriKit.getSelectedItem().toString()))) == 1) {
            JOptionPane.showMessageDialog(null, "Já existe esse kit cadastrado.");
        } else {

            int resp;

            PlanoManutencao plano = new PlanoManutencao();
            plano.setMarca(cboMarcaKit.getSelectedItem().toString());
            plano.setModelo(cboModeloKit.getSelectedItem().toString());
            plano.setMotor(cboMotorKit.getSelectedItem().toString());
            plano.setKmManutencao(Integer.parseInt(cboKmManutKit.getSelectedItem().toString()));
            plano.setAnoModelo(Integer.parseInt(cboAnoModKit.getSelectedItem().toString()));
            plano.setAnoFabricacao(Integer.parseInt(cboAnoFabriKit.getSelectedItem().toString()));

            resp = dao.incluirKit(plano);
            if (resp == 1) {
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!!");
            } else if (resp == 1062) {
                JOptionPane.showMessageDialog(null, "Kit já cadastrado");

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar!!!");
            }
        }
    }//GEN-LAST:event_btnIncluirKitActionPerformed

    private void btnAlterarKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarKitActionPerformed

        PlanoManutencaoDao dao = new PlanoManutencaoDao();
        if (dao.NoEqualsVeiculo(cboMarcaKit.getSelectedItem().toString(), cboModeloKit.getSelectedItem().toString(),
                cboMotorKit.getSelectedItem().toString(), (Integer.parseInt(cboAnoModKit.getSelectedItem().toString())),
                (Integer.parseInt(cboAnoFabriKit.getSelectedItem().toString()))) == 0) {

            JOptionPane.showMessageDialog(null, "Não existe veiculo cadastrado para esse kit.");

        } else {

            PlanoManutencao plano = new PlanoManutencao();
            plano.setMarca(cboMarcaKit.getSelectedItem().toString());
            plano.setModelo(cboModeloKit.getSelectedItem().toString());
            plano.setMotor(cboMotorKit.getSelectedItem().toString());
            plano.setKmManutencao(Integer.parseInt(cboKmManutKit.getSelectedItem().toString()));
            plano.setAnoModelo(Integer.parseInt(cboAnoModKit.getSelectedItem().toString()));
            plano.setAnoFabricacao(Integer.parseInt(cboAnoFabriKit.getSelectedItem().toString()));

            boolean status = dao.alterar(plano);
            if (status) {
                JOptionPane.showMessageDialog(null, "Kit Alterado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Kit não foi alterado");
            }
        }
    }//GEN-LAST:event_btnAlterarKitActionPerformed

    private void btnIncluirPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirPlanoActionPerformed
        int resp;
        PlanoItemManutencaoDao dao = new PlanoItemManutencaoDao();

        if (txtCodItemPlano.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Está vazio o código do Item.");

        } else if (dao.NoEqualsVeiculoItem(cboModeloPlano.getSelectedItem().toString(), cboMotorPlano.getSelectedItem().toString(),
                (Integer.parseInt(cboKmManutPlano.getSelectedItem().toString())), (Integer.parseInt(cboAnoModPlano.getSelectedItem().toString())),
                (Integer.parseInt(cboAnoFabriPlano.getSelectedItem().toString()))) == 0) {

            JOptionPane.showMessageDialog(null, "Não existe veiculo cadastrado para esse kit.");

        } else if (dao.NoEqualsKitItem(cboModeloPlano.getSelectedItem().toString(), cboMotorPlano.getSelectedItem().toString(),
                (Integer.parseInt(cboKmManutPlano.getSelectedItem().toString())), (Integer.parseInt(cboAnoModPlano.getSelectedItem().toString())),
                (Integer.parseInt(cboAnoFabriPlano.getSelectedItem().toString()))) == 0) {
            JOptionPane.showMessageDialog(null, "Não existe esse kit cadastrado, então não é possivel incluir itens.");
        } else {

            PlanoItemManutencao plano = new PlanoItemManutencao();
            plano.setIdCodigo(Integer.parseInt(txtCodItemPlano.getText()));
            plano.setModelo(cboModeloPlano.getSelectedItem().toString());
            plano.setMotor(cboMotorPlano.getSelectedItem().toString());
            plano.setKmManutencao(Integer.parseInt(cboKmManutPlano.getSelectedItem().toString()));
            plano.setAnoModelo(Integer.parseInt(cboAnoModPlano.getSelectedItem().toString()));
            plano.setAnoFabricacao(Integer.parseInt(cboAnoFabriPlano.getSelectedItem().toString()));

            resp = dao.incluirItemAoKit(plano);
            if (resp == 1) {
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!!");
            } else if (resp == 1062) {
                JOptionPane.showMessageDialog(null, "Item já cadastrado");

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar!!!");
            }

        }
    }//GEN-LAST:event_btnIncluirPlanoActionPerformed

    private void btnExcluirPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPlanoActionPerformed
        PlanoItemManutencaoDao dao = new PlanoItemManutencaoDao();

        String modelo = cboModeloPlano.getSelectedItem().toString();
        String motor = cboMotorPlano.getSelectedItem().toString();
        Integer km = (Integer.parseInt(cboKmManutPlano.getSelectedItem().toString()));
        Integer anoModelo = (Integer.parseInt(cboAnoModPlano.getSelectedItem().toString()));
        Integer anoFabricacao = (Integer.parseInt(cboAnoFabriPlano.getSelectedItem().toString()));

        if (txtCodItemPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Código Item vazio.");
        } else {
            Integer idCodigo = (Integer.parseInt(txtCodItemPlano.getText()));
            Boolean status = dao.excluir(modelo, motor, km, anoModelo, anoFabricacao, idCodigo);
            limparCampos();
            if (status == true) {
                JOptionPane.showMessageDialog(null, "Item excluído com sucesso!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o Item");
            }

        }

    }//GEN-LAST:event_btnExcluirPlanoActionPerformed

    public void popularJComboBoxCadastrarKit() {
        try {

            String sqlMarca = "SELECT DISTINCT marca FROM veiculo ORDER BY marca ASC";
            Statement stMarca = cn.createStatement();
            ResultSet rsMarca = stMarca.executeQuery(sqlMarca);
            while (rsMarca.next()) {
                cboMarcaKit.addItem(rsMarca.getString("marca"));
            }

            String sqlModelo = "SELECT DISTINCT modelo FROM veiculo ORDER BY modelo ASC";
            Statement stModelo = cn.createStatement();
            ResultSet rsModelo = stModelo.executeQuery(sqlModelo);
            while (rsModelo.next()) {
                cboModeloKit.addItem(rsModelo.getString("modelo"));
            }

            String sqlMotor = "SELECT DISTINCT motor FROM veiculo ORDER BY motor ASC";
            Statement stMotor = cn.createStatement();
            ResultSet rsMotor = stMotor.executeQuery(sqlMotor);
            while (rsMotor.next()) {
                cboMotorKit.addItem(rsMotor.getString("motor"));
            }

            String sqlAnoModelo = "SELECT DISTINCT anoModelo FROM veiculo ORDER BY anoModelo ASC";
            Statement stAnoModelo = cn.createStatement();
            ResultSet rsAnoModelo = stAnoModelo.executeQuery(sqlAnoModelo);
            while (rsAnoModelo.next()) {
                cboAnoModKit.addItem(rsAnoModelo.getString("anoModelo"));
            }

            String sqlAnoFabricacao = "SELECT DISTINCT anoFabricacao FROM veiculo ORDER BY anoFabricacao ASC";
            Statement stAnoFabricacao = cn.createStatement();
            ResultSet rsAnoFabricacao = stAnoFabricacao.executeQuery(sqlAnoFabricacao);
            while (rsAnoFabricacao.next()) {
                cboAnoFabriKit.addItem(rsAnoFabricacao.getString("anoFabricacao"));
            }

            Integer[] kmManutencao = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
            for (Integer km : kmManutencao) {
                cboKmManutKit.addItem(km.toString());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void popularJComboBoxCadastrarItemAoKit() {
        try {

            String sqlModelo = "SELECT DISTINCT modelo FROM veiculo ORDER BY modelo ASC";
            Statement stModelo = cn.createStatement();
            ResultSet rsModelo = stModelo.executeQuery(sqlModelo);
            while (rsModelo.next()) {
                cboModeloPlano.addItem(rsModelo.getString("modelo"));
            }

            String sqlMotor = "SELECT DISTINCT motor FROM veiculo ORDER BY motor ASC";
            Statement stMotor = cn.createStatement();
            ResultSet rsMotor = stMotor.executeQuery(sqlMotor);
            while (rsMotor.next()) {
                cboMotorPlano.addItem(rsMotor.getString("motor"));
            }

            String sqlAnoModelo = "SELECT DISTINCT anoModelo FROM veiculo ORDER BY anoModelo ASC";
            Statement stAnoModelo = cn.createStatement();
            ResultSet rsAnoModelo = stAnoModelo.executeQuery(sqlAnoModelo);
            while (rsAnoModelo.next()) {
                cboAnoModPlano.addItem(rsAnoModelo.getString("anoModelo"));
            }

            String sqlAnoFabricacao = "SELECT DISTINCT anoFabricacao FROM veiculo ORDER BY anoFabricacao ASC";
            Statement stAnoFabricacao = cn.createStatement();
            ResultSet rsAnoFabricacao = stAnoFabricacao.executeQuery(sqlAnoFabricacao);
            while (rsAnoFabricacao.next()) {
                cboAnoFabriPlano.addItem(rsAnoFabricacao.getString("anoFabricacao"));
            }

            Integer[] kmManutencao = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
            for (Integer km : kmManutencao) {
                cboKmManutPlano.addItem(km.toString());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(telaCadastroKitManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastroKitManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastroKitManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastroKitManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastroKitManutencao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarKit;
    private javax.swing.JButton btnExcluirPlano;
    private javax.swing.JButton btnIncluirKit;
    private javax.swing.JButton btnIncluirPlano;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cboAnoFabriKit;
    private javax.swing.JComboBox<String> cboAnoFabriPlano;
    private javax.swing.JComboBox<String> cboAnoModKit;
    private javax.swing.JComboBox<String> cboAnoModPlano;
    private javax.swing.JComboBox<String> cboKmManutKit;
    private javax.swing.JComboBox<String> cboKmManutPlano;
    private javax.swing.JComboBox<String> cboMarcaKit;
    private javax.swing.JComboBox<String> cboModeloKit;
    private javax.swing.JComboBox<String> cboModeloPlano;
    private javax.swing.JComboBox<String> cboMotorKit;
    private javax.swing.JComboBox<String> cboMotorPlano;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel telaCadastroKitManutencao;
    private app.bolivia.swing.JCTextField txtCodItemPlano;
    // End of variables declaration//GEN-END:variables
}