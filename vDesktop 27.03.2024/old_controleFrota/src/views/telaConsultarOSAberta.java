package views;

import config.Conectar;
import config.OrdemServico;
import config.OrdemServicoDao;
import config.VeiculosDao;
import java.sql.Connection;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class telaConsultarOSAberta extends javax.swing.JFrame {

    //Criando a conexão com o banco
    Conectar con = new Conectar();
    Connection cn = con.conexao();
    DateTimeFormatter formatoEntradaBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public telaConsultarOSAberta() {
        this.con = new Conectar();
        initComponents();
    }

    private void limparCampos() {
        txtPlacaOS.setText("");
        rbtOSCorret.setSelected(false);
        rbtOSPrevent.setSelected(false);
        lblConsultarOSAber.setText("");
        DefaultTableModel model = (DefaultTableModel) tblOSCorret.getModel();
        model.setRowCount(0);
        DefaultTableModel modelPreventiva = (DefaultTableModel) tblOSPrevent.getModel();
        modelPreventiva.setRowCount(0);

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
        txtPlacaOS = new app.bolivia.swing.JCTextField();
        rbtOSPrevent = new javax.swing.JRadioButton();
        rbtOSCorret = new javax.swing.JRadioButton();
        btnLimparOS = new javax.swing.JButton();
        btnConsultarOS = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAgenManut = new javax.swing.JButton();
        pnlConsultarOSAber = new javax.swing.JPanel();
        lblConsultarOSAber = new javax.swing.JLabel();
        scpnlOSPrevent = new javax.swing.JScrollPane();
        tblOSPrevent = new javax.swing.JTable();
        scpnlOSCorret = new javax.swing.JScrollPane();
        tblOSCorret = new javax.swing.JTable();
        telaConsultarOSAberta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPlacaOS.setBorder(null);
        txtPlacaOS.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPlacaOS.setOpaque(false);
        txtPlacaOS.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPlacaOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaOSKeyReleased(evt);
            }
        });
        jPanel1.add(txtPlacaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 140, 30));

        rbtOSPrevent.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        rbtOSPrevent.setForeground(java.awt.SystemColor.controlLtHighlight);
        rbtOSPrevent.setText("O. S. PREVENTIVA");
        jPanel1.add(rbtOSPrevent, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        rbtOSCorret.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        rbtOSCorret.setForeground(java.awt.SystemColor.controlLtHighlight);
        rbtOSCorret.setText("O. S. CORRETIVA");
        jPanel1.add(rbtOSCorret, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        btnLimparOS.setContentAreaFilled(false);
        btnLimparOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparOSActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimparOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 100, 40, 40));

        btnConsultarOS.setContentAreaFilled(false);
        btnConsultarOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarOSActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 30, 40));

        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 860, 130, 20));

        btnAgenManut.setContentAreaFilled(false);
        btnAgenManut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgenManut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgenManutActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgenManut, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 860, 250, 20));

        pnlConsultarOSAber.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblConsultarOSAber.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        javax.swing.GroupLayout pnlConsultarOSAberLayout = new javax.swing.GroupLayout(pnlConsultarOSAber);
        pnlConsultarOSAber.setLayout(pnlConsultarOSAberLayout);
        pnlConsultarOSAberLayout.setHorizontalGroup(
            pnlConsultarOSAberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarOSAberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultarOSAber, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConsultarOSAberLayout.setVerticalGroup(
            pnlConsultarOSAberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarOSAberLayout.createSequentialGroup()
                .addComponent(lblConsultarOSAber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(pnlConsultarOSAber, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 710, 40));

        tblOSPrevent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DATA", "CÓD. O. S. PREV.", "KM MANUTENÇÃO"
            }
        ));
        tblOSPrevent.setRowHeight(28);
        scpnlOSPrevent.setViewportView(tblOSPrevent);
        if (tblOSPrevent.getColumnModel().getColumnCount() > 0) {
            tblOSPrevent.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblOSPrevent.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel1.add(scpnlOSPrevent, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 520, 200));

        tblOSCorret.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DATA", "CÓD. O. S. CORRET.", "DESCRIÇÃO DOS PRODUTOS"
            }
        ));
        tblOSCorret.setRowHeight(28);
        scpnlOSCorret.setViewportView(tblOSCorret);
        if (tblOSCorret.getColumnModel().getColumnCount() > 0) {
            tblOSCorret.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblOSCorret.getColumnModel().getColumn(1).setPreferredWidth(30);
            tblOSCorret.getColumnModel().getColumn(2).setPreferredWidth(500);
        }

        jPanel1.add(scpnlOSCorret, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, 870, 200));

        telaConsultarOSAberta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TelaConsultarOSAberta.png"))); // NOI18N
        jPanel1.add(telaConsultarOSAberta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaOSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaOSKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaOSKeyReleased

    private void btnAgenManutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgenManutActionPerformed
        new telaAgendamento().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgenManutActionPerformed

    private void btnConsultarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarOSActionPerformed
        VeiculosDao veiculo = new VeiculosDao();
        OrdemServico servicoPreventivo = new OrdemServico();
        OrdemServico servicoCorretivo = new OrdemServico();
        OrdemServicoDao dao = new OrdemServicoDao();

        if (txtPlacaOS.getText().isEmpty()) {
            lblConsultarOSAber.setText("Placa não pode ser vazia.");
        } else if (dao.NoEqualsPlaca(txtPlacaOS.getText()) == 0) {
            lblConsultarOSAber.setText("Essa placa não está cadastrada em Veiculo.");
        } else if (!rbtOSCorret.isSelected() && !rbtOSPrevent.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) tblOSCorret.getModel();
            model.setRowCount(0);
            DefaultTableModel modelPreventiva = (DefaultTableModel) tblOSPrevent.getModel();
            modelPreventiva.setRowCount(0);

            lblConsultarOSAber.setText("Selecione pelo menos um tipo de Manutenção.");
        } else {
            String placa = txtPlacaOS.getText();

            if (rbtOSPrevent.isSelected()) {

                List<OrdemServico> ordemPreventiva = dao.consultarPreventiva(placa, "Preventiva", "Aberto");

                if (ordemPreventiva.isEmpty()) {
                    lblConsultarOSAber.setText("Nenhum cadastro encontrado com a descrição fornecida.");
                } else {
                    DefaultTableModel model = new DefaultTableModel();
                    model.addColumn("DATA");
                    model.addColumn("CÓD. O.S. PREV.");
                    model.addColumn("KM MANUTENÇÃO");

                    for (OrdemServico ordem : ordemPreventiva) {
                        model.addRow(new Object[]{
                            ordem.getDataCheck().format(formatoEntradaBrasileiro),
                            ordem.getId(),
                            ordem.getKmPreventiva()

                        });
                    }
                    lblConsultarOSAber.setText("");
                    tblOSPrevent.setModel(model);
                }

            }
            if (rbtOSCorret.isSelected()) {

                List<OrdemServico> ordemCorretiva = dao.consultarCorretiva(placa, "Corretiva", "Aberto");

                if (ordemCorretiva.isEmpty()) {
                    lblConsultarOSAber.setText("Nenhum cadastro encontrado com a descrição fornecida.");
                } else {
                    DefaultTableModel model = new DefaultTableModel();
                    model.addColumn("DATA");
                    model.addColumn("CÓD. O.S. CORRET.");
                    model.addColumn("DESCRIÇÃO DOS PRODUTOS");

                    for (OrdemServico ordem : ordemCorretiva) {
                        String produto = ordem.getProdutoCorretiva();
                        if (produto.endsWith(",")) {
                            produto = produto.substring(0, produto.length() - 1);
                        }
                        String[] produtos = produto.split(",");
                        int[] numberProduto = Arrays.stream(produtos).mapToInt(Integer::parseInt).toArray();

                        for (int idProduto : numberProduto) {
                            String descricao = dao.descricaoProduto(idProduto);
                            model.addRow(new Object[]{
                                ordem.getDataCheck().format(formatoEntradaBrasileiro),
                                ordem.getId(),
                                descricao
                            });
                        }
                        lblConsultarOSAber.setText("");
                        tblOSCorret.setModel(model);
                    }
                }

            }
        }


    }//GEN-LAST:event_btnConsultarOSActionPerformed

    private void btnLimparOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparOSActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparOSActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new telaInicial().setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(telaConsultarOSAberta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaConsultarOSAberta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaConsultarOSAberta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaConsultarOSAberta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaConsultarOSAberta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenManut;
    private javax.swing.JButton btnConsultarOS;
    private javax.swing.JButton btnLimparOS;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConsultarOSAber;
    private javax.swing.JPanel pnlConsultarOSAber;
    private javax.swing.JRadioButton rbtOSCorret;
    private javax.swing.JRadioButton rbtOSPrevent;
    private javax.swing.JScrollPane scpnlOSCorret;
    private javax.swing.JScrollPane scpnlOSPrevent;
    private javax.swing.JTable tblOSCorret;
    private javax.swing.JTable tblOSPrevent;
    private javax.swing.JLabel telaConsultarOSAberta;
    private app.bolivia.swing.JCTextField txtPlacaOS;
    // End of variables declaration//GEN-END:variables

}
