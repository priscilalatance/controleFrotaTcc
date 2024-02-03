package views;

import config.CadastroItem;
import config.CadastroItemDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 * @autor Francisco Mariano
 */
public class telaCadastroItem extends javax.swing.JFrame {

    CadastroItem cadItem = new CadastroItem();

    /**
     * Creates new form telaCadastroItem
     */
    public telaCadastroItem() {
        initComponents();
    }

    public void limparCampos() {

        txtMarca.setText("");
        txtCodItem.setText("");
        txtCadastroItem_DescricaoItem.setText("");
        txtDescricaoItemCons.setText("");
        txtModelo.setText("");
        txtAnoModelo.setText("");
        txtCor.setText("");
        txtAnoFabri.setText("");
        txtModelo.setText("");
        txtValorUnitario.setText("");
        jCheckBox1Universal.setSelected(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCadastroItem = new javax.swing.JTable();
        txtCodItem = new app.bolivia.swing.JCTextField();
        txtDescricaoItemCons = new app.bolivia.swing.JCTextField();
        txtMarca = new app.bolivia.swing.JCTextField();
        txtModelo = new app.bolivia.swing.JCTextField();
        txtCor = new app.bolivia.swing.JCTextField();
        txtAnoFabri = new app.bolivia.swing.JCTextField();
        jCheckBox1Universal = new javax.swing.JCheckBox();
        txtCadastroItem_DescricaoItem = new app.bolivia.swing.JCTextField();
        txtValorUnitario = new app.bolivia.swing.JCTextField();
        txtAnoModelo = new app.bolivia.swing.JCTextField();
        txtDescricaoItemConsul = new app.bolivia.swing.JCTextField();
        btnConsultarItem = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSalva_Cadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultarItemDescr = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abraão Lemos LTDA");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tblCadastroItem.setBorder(new javax.swing.border.MatteBorder(null));
        tblCadastroItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCadastroItem.setModel(new javax.swing.table.DefaultTableModel(
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
                "CÓD. ITEM", "DESCRIÇÃO ITEM", "MARCA", "MODELO", "COR", "ANO FABRIC.", "ANO MODELO", "VALOR UNIT."
            }
        ));
        tblCadastroItem.setNextFocusableComponent(txtDescricaoItemCons);
        tblCadastroItem.setRowHeight(35);
        tblCadastroItem.setRowMargin(10);
        tblCadastroItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCadastroItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCadastroItem);
        if (tblCadastroItem.getColumnModel().getColumnCount() > 0) {
            tblCadastroItem.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblCadastroItem.getColumnModel().getColumn(1).setPreferredWidth(280);
            tblCadastroItem.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblCadastroItem.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblCadastroItem.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblCadastroItem.getColumnModel().getColumn(5).setPreferredWidth(80);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 1070, 310));

        txtCodItem.setBorder(null);
        txtCodItem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCodItem.setOpaque(false);
        txtCodItem.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCodItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodItemActionPerformed(evt);
            }
        });
        txtCodItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodItemKeyReleased(evt);
            }
        });
        jPanel1.add(txtCodItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 170, 30));

        txtDescricaoItemCons.setBorder(null);
        txtDescricaoItemCons.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtDescricaoItemCons.setOpaque(false);
        txtDescricaoItemCons.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDescricaoItemCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoItemConsActionPerformed(evt);
            }
        });
        txtDescricaoItemCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescricaoItemConsKeyReleased(evt);
            }
        });
        jPanel1.add(txtDescricaoItemCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 590, 30));

        txtMarca.setBackground(java.awt.SystemColor.controlHighlight);
        txtMarca.setBorder(null);
        txtMarca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMarca.setOpaque(false);
        txtMarca.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
        });
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 190, 20));

        txtModelo.setBackground(java.awt.SystemColor.controlHighlight);
        txtModelo.setBorder(null);
        txtModelo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtModelo.setOpaque(false);
        txtModelo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloKeyReleased(evt);
            }
        });
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 200, 20));

        txtCor.setBackground(java.awt.SystemColor.controlHighlight);
        txtCor.setBorder(null);
        txtCor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCor.setOpaque(false);
        txtCor.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });
        txtCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorKeyReleased(evt);
            }
        });
        jPanel1.add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 180, 20));

        txtAnoFabri.setBackground(java.awt.SystemColor.controlHighlight);
        txtAnoFabri.setBorder(null);
        txtAnoFabri.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAnoFabri.setOpaque(false);
        txtAnoFabri.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtAnoFabri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoFabriActionPerformed(evt);
            }
        });
        txtAnoFabri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnoFabriKeyReleased(evt);
            }
        });
        jPanel1.add(txtAnoFabri, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 140, 20));

        jCheckBox1Universal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1UniversalActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1Universal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 250, 20, 20));

        txtCadastroItem_DescricaoItem.setBackground(java.awt.SystemColor.controlHighlight);
        txtCadastroItem_DescricaoItem.setBorder(null);
        txtCadastroItem_DescricaoItem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCadastroItem_DescricaoItem.setOpaque(false);
        txtCadastroItem_DescricaoItem.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCadastroItem_DescricaoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastroItem_DescricaoItemActionPerformed(evt);
            }
        });
        txtCadastroItem_DescricaoItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCadastroItem_DescricaoItemKeyReleased(evt);
            }
        });
        jPanel1.add(txtCadastroItem_DescricaoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 580, 30));

        txtValorUnitario.setBackground(java.awt.SystemColor.controlHighlight);
        txtValorUnitario.setBorder(null);
        txtValorUnitario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtValorUnitario.setOpaque(false);
        txtValorUnitario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitarioActionPerformed(evt);
            }
        });
        txtValorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorUnitarioKeyReleased(evt);
            }
        });
        jPanel1.add(txtValorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 140, 30));

        txtAnoModelo.setBackground(java.awt.SystemColor.controlHighlight);
        txtAnoModelo.setBorder(null);
        txtAnoModelo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAnoModelo.setOpaque(false);
        txtAnoModelo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtAnoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoModeloActionPerformed(evt);
            }
        });
        txtAnoModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnoModeloKeyReleased(evt);
            }
        });
        jPanel1.add(txtAnoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 320, 120, 20));

        txtDescricaoItemConsul.setBorder(null);
        txtDescricaoItemConsul.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtDescricaoItemConsul.setOpaque(false);
        txtDescricaoItemConsul.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDescricaoItemConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoItemConsulItemDescricao(evt);
            }
        });
        txtDescricaoItemConsul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescricaoItemConsulKeyReleased(evt);
            }
        });
        jPanel1.add(txtDescricaoItemConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 580, 20));

        btnConsultarItem.setContentAreaFilled(false);
        btnConsultarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarItemActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 100, 30, 40));

        btnLimpar.setContentAreaFilled(false);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 100, 40, 40));

        btnSalva_Cadastrar.setContentAreaFilled(false);
        btnSalva_Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalva_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalva_CadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalva_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 310, 40, 40));

        btnAlterar.setContentAreaFilled(false);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 310, 40, 40));

        btnConsultarItemDescr.setContentAreaFilled(false);
        btnConsultarItemDescr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarItemDescr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarItemDescrActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarItemDescr, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 460, 40, 40));

        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 860, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TelaCadastroItem.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, -1));

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

    private void tblCadastroItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCadastroItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCadastroItemMouseClicked

    private void txtDescricaoItemConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoItemConsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoItemConsActionPerformed

    private void txtValorUnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnitarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnitarioKeyReleased

    private void txtDescricaoItemConsulItemDescricao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoItemConsulItemDescricao
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoItemConsulItemDescricao

    private void txtAnoFabriKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoFabriKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoFabriKeyReleased

    private void btnSalva_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalva_CadastrarActionPerformed

        CadastroItemDao dao = new CadastroItemDao();
        CadastroItem cadItem = new CadastroItem();

        cadItem.setIdCodigo(Integer.parseInt(txtCodItem.getText()));
        cadItem.setMarca(jCheckBox1Universal.isSelected() ? "" : txtMarca.getText().toUpperCase());
        cadItem.setModelo(jCheckBox1Universal.isSelected() ? "" : txtModelo.getText().toUpperCase());
        cadItem.setCor(jCheckBox1Universal.isSelected() ? "" : txtCor.getText().toUpperCase());
        cadItem.setAnoFabricacao(jCheckBox1Universal.isSelected() ? 0 : Integer.parseInt(txtAnoFabri.getText()));
        cadItem.setAnoModelo(jCheckBox1Universal.isSelected() ? 0 : Integer.parseInt(txtAnoModelo.getText()));
        cadItem.setDescricaoItem(txtCadastroItem_DescricaoItem.getText().toUpperCase());
        cadItem.setValorUnitario(Double.parseDouble(txtValorUnitario.getText()));
        cadItem.setPecaUniversal(jCheckBox1Universal.isSelected());

        boolean status = dao.conectar();
        if (!status) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados");
            return;
        }

        int resp = dao.salvar(cadItem);
        if (resp == 1) {
            JOptionPane.showMessageDialog(null, "Item inserido com sucesso!!!");
            limparCampos();
            txtCodItem.requestFocus();
        } else if (resp == 1062) {
            JOptionPane.showMessageDialog(null, "Código do item já cadastrado!");
            txtCodItem.setText("");
            txtCodItem.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!!!");
        }

        dao.desconectar();

    }//GEN-LAST:event_btnSalva_CadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        CadastroItemDao dao = new CadastroItemDao();
        CadastroItem cadItem = new CadastroItem();

        cadItem.setIdCodigo(Integer.parseInt(txtCodItem.getText()));
        cadItem.setMarca(txtMarca.getText());
        cadItem.setModelo((txtModelo.getText()));
        cadItem.setCor(txtCor.getText());
        cadItem.setAnoFabricacao(Integer.parseInt(txtAnoFabri.getText()));
        cadItem.setAnoModelo(Integer.parseInt(txtAnoModelo.getText()));
        cadItem.setDescricaoItem(txtCadastroItem_DescricaoItem.getText());
        cadItem.setValorUnitario(Double.parseDouble(txtValorUnitario.getText().replace("R$", "")));
        cadItem.setPecaUniversal(jCheckBox1Universal.isSelected());

        boolean status = dao.conectar();
        if (status) {
            status = dao.alterar(cadItem);
            if (status) {
                JOptionPane.showMessageDialog(null, "Item alterado com sucesso");
                limparCampos();

            } else {
                JOptionPane.showMessageDialog(null, "Item não foi alterado");
            }
            dao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados");
        }

        dao.desconectar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtCadastroItem_DescricaoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastroItem_DescricaoItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastroItem_DescricaoItemActionPerformed

    private void txtCodItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodItemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodItemKeyReleased

    private void txtDescricaoItemConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoItemConsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoItemConsKeyReleased

    private void txtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaKeyReleased

    private void txtModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloKeyReleased

    private void txtCorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorKeyReleased

    private void txtCadastroItem_DescricaoItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadastroItem_DescricaoItemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastroItem_DescricaoItemKeyReleased

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorActionPerformed

    private void txtAnoFabriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoFabriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoFabriActionPerformed

    private void txtCodItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodItemActionPerformed

    private void btnConsultarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarItemActionPerformed

        CadastroItemDao dao = new CadastroItemDao();

        int idConsulta = 0;
        idConsulta = Integer.parseInt(txtCodItem.getText());
        System.out.println("Id do cadastro: " + idConsulta);
        boolean status = dao.conectar();
        if (status == true) {
            cadItem = dao.consultar(idConsulta);

            if (cadItem == null) {
                JOptionPane.showMessageDialog(null, "Dados não encontrados");
            } else {

                txtCodItem.setText(cadItem.getIdCodigo().toString());
                txtMarca.setText(cadItem.getMarca().toUpperCase());
                txtModelo.setText(cadItem.getModelo().toUpperCase());
                txtCor.setText(cadItem.getCor().toUpperCase());
                txtAnoFabri.setText(cadItem.getAnoFabricacao().toString());
                txtAnoModelo.setText(cadItem.getAnoModelo().toString());
                txtCadastroItem_DescricaoItem.setText(cadItem.getDescricaoItem().toUpperCase());
                txtValorUnitario.setText("R$" + cadItem.getValorUnitario());
                jCheckBox1Universal.setSelected(cadItem.getPecaUniversal());

            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro na conexão do banco de Dados");
        }
        dao.desconectar();

    }//GEN-LAST:event_btnConsultarItemActionPerformed


    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtAnoModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoModeloKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoModeloKeyReleased

    private void txtAnoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoModeloActionPerformed

    private void jCheckBox1UniversalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1UniversalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1UniversalActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnitarioActionPerformed

    private void btnConsultarItemDescrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarItemDescrActionPerformed

        CadastroItemDao dao = new CadastroItemDao();
        String descricaoConsulta = txtDescricaoItemConsul.getText();
        boolean status = dao.conectar();
        if (status) {
            List<CadastroItem> itensEncontrados = dao.consultarPorDescricao(descricaoConsulta);

            if (itensEncontrados.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado com a descrição fornecida.");
            } else {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Código");
                model.addColumn("Marca");
                model.addColumn("Modelo");
                model.addColumn("Cor");
                model.addColumn("Ano Fabricação");
                model.addColumn("Ano Modelo");
                model.addColumn("Descrição");
                model.addColumn("Valor Unitário");
                model.addColumn("Peca Universal");

                for (CadastroItem item : itensEncontrados) {
                    model.addRow(new Object[]{
                        item.getIdCodigo(),
                        item.getMarca().toUpperCase(),
                        item.getModelo().toUpperCase(),
                        item.getCor().toUpperCase(),
                        item.getAnoFabricacao(),
                        item.getAnoModelo(),
                        item.getDescricaoItem().toUpperCase(),
                        item.getValorUnitario(),
                        item.getPecaUniversal() ? "SIM" : "NÃO"
                    });
                }

                tblCadastroItem.setModel(model);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados");
        }

        dao.desconectar();
    }//GEN-LAST:event_btnConsultarItemDescrActionPerformed

    private void txtDescricaoItemConsulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoItemConsulKeyReleased
        if (txtCadastroItem_DescricaoItem.getText().equals("")) {
            // valida conforme  o video => https://www.youtube.com/watch?v=cBU372RfWDI
        } else {

        }
    }//GEN-LAST:event_txtDescricaoItemConsulKeyReleased

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
            java.util.logging.Logger.getLogger(telaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastroItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultarItem;
    private javax.swing.JButton btnConsultarItemDescr;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalva_Cadastrar;
    private javax.swing.JCheckBox jCheckBox1Universal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCadastroItem;
    private app.bolivia.swing.JCTextField txtAnoFabri;
    private app.bolivia.swing.JCTextField txtAnoModelo;
    private app.bolivia.swing.JCTextField txtCadastroItem_DescricaoItem;
    private app.bolivia.swing.JCTextField txtCodItem;
    private app.bolivia.swing.JCTextField txtCor;
    private app.bolivia.swing.JCTextField txtDescricaoItemCons;
    private app.bolivia.swing.JCTextField txtDescricaoItemConsul;
    private app.bolivia.swing.JCTextField txtMarca;
    private app.bolivia.swing.JCTextField txtModelo;
    private app.bolivia.swing.JCTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
