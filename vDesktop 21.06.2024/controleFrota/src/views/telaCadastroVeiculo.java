/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import config.Veiculos;
import config.VeiculosDao;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/**
 *
 * @author mariana
 */
public class telaCadastroVeiculo extends javax.swing.JInternalFrame {

    DateTimeFormatter formatoEntradaBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatoSaidaAmericano = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public telaCadastroVeiculo() {
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
        txtPlaca = new app.bolivia.swing.JCTextField();
        txtCombustivel = new app.bolivia.swing.JCTextField();
        txtMotor = new app.bolivia.swing.JCTextField();
        txtChassi = new app.bolivia.swing.JCTextField();
        txtRenavam = new app.bolivia.swing.JCTextField();
        txtNumCRV = new app.bolivia.swing.JCTextField();
        txtVencGarantia = new app.bolivia.swing.JCTextField();
        txtDataCompra = new app.bolivia.swing.JCTextField();
        txtKmAtual = new app.bolivia.swing.JCTextField();
        txtAnoModelo = new app.bolivia.swing.JCTextField();
        txtAnoFabricacao = new app.bolivia.swing.JCTextField();
        txtTipoVeiculo = new app.bolivia.swing.JCTextField();
        txtPlacaCadastro = new app.bolivia.swing.JCTextField();
        txtCor = new app.bolivia.swing.JCTextField();
        txtModelo = new app.bolivia.swing.JCTextField();
        txtMarca = new app.bolivia.swing.JCTextField();
        btnConsultarCadastrarVeiculo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jCheckBoxInativarVeiculo = new javax.swing.JCheckBox();
        txtDataCadastro = new app.bolivia.swing.JCTextField();
        jPanel2 = new javax.swing.JPanel();
        lblGerenciarVeiculo = new javax.swing.JLabel();
        telaCadastroVeiculo = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(true);
        setTitle("Abraão Lemos LTDA");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPlaca.setBorder(null);
        txtPlaca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPlaca.setOpaque(false);
        txtPlaca.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaKeyReleased(evt);
            }
        });
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 200, 30));

        txtCombustivel.setBorder(null);
        txtCombustivel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCombustivel.setOpaque(false);
        txtCombustivel.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCombustivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCombustivelKeyReleased(evt);
            }
        });
        jPanel1.add(txtCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 580, 260, 30));

        txtMotor.setBorder(null);
        txtMotor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMotor.setOpaque(false);
        txtMotor.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMotor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMotorKeyReleased(evt);
            }
        });
        jPanel1.add(txtMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 490, 260, 40));

        txtChassi.setBorder(null);
        txtChassi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtChassi.setOpaque(false);
        txtChassi.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtChassi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChassiKeyReleased(evt);
            }
        });
        jPanel1.add(txtChassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 410, 260, 30));

        txtRenavam.setBorder(null);
        txtRenavam.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtRenavam.setOpaque(false);
        txtRenavam.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtRenavam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRenavamKeyReleased(evt);
            }
        });
        jPanel1.add(txtRenavam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 320, 260, 40));

        txtNumCRV.setBorder(null);
        txtNumCRV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNumCRV.setOpaque(false);
        txtNumCRV.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNumCRV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumCRVKeyReleased(evt);
            }
        });
        jPanel1.add(txtNumCRV, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 580, 200, 30));

        txtVencGarantia.setBorder(null);
        txtVencGarantia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtVencGarantia.setOpaque(false);
        txtVencGarantia.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtVencGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVencGarantiaKeyReleased(evt);
            }
        });
        jPanel1.add(txtVencGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, 200, 40));

        txtDataCompra.setBorder(null);
        txtDataCompra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtDataCompra.setOpaque(false);
        txtDataCompra.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDataCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataCompraActionPerformed(evt);
            }
        });
        txtDataCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataCompraKeyReleased(evt);
            }
        });
        jPanel1.add(txtDataCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 190, 30));

        txtKmAtual.setBorder(null);
        txtKmAtual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtKmAtual.setOpaque(false);
        txtKmAtual.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtKmAtual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKmAtualKeyReleased(evt);
            }
        });
        jPanel1.add(txtKmAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 200, 40));

        txtAnoModelo.setBorder(null);
        txtAnoModelo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAnoModelo.setOpaque(false);
        txtAnoModelo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtAnoModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnoModeloKeyReleased(evt);
            }
        });
        jPanel1.add(txtAnoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, 200, 30));

        txtAnoFabricacao.setBorder(null);
        txtAnoFabricacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAnoFabricacao.setOpaque(false);
        txtAnoFabricacao.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtAnoFabricacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 200, 40));

        txtTipoVeiculo.setBorder(null);
        txtTipoVeiculo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTipoVeiculo.setOpaque(false);
        txtTipoVeiculo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTipoVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTipoVeiculoKeyReleased(evt);
            }
        });
        jPanel1.add(txtTipoVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 200, 30));

        txtPlacaCadastro.setBorder(null);
        txtPlacaCadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPlacaCadastro.setOpaque(false);
        txtPlacaCadastro.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPlacaCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaCadastroKeyReleased(evt);
            }
        });
        jPanel1.add(txtPlacaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 200, 40));

        txtCor.setBorder(null);
        txtCor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCor.setOpaque(false);
        txtCor.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorKeyReleased(evt);
            }
        });
        jPanel1.add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 200, 30));

        txtModelo.setBorder(null);
        txtModelo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtModelo.setOpaque(false);
        txtModelo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 200, 40));

        txtMarca.setBorder(null);
        txtMarca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMarca.setOpaque(false);
        txtMarca.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
        });
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 200, 30));

        btnConsultarCadastrarVeiculo.setContentAreaFilled(false);
        btnConsultarCadastrarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCadastrarVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarCadastrarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 50, 50));

        btnLimpar.setContentAreaFilled(false);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 650, 50, 50));

        btnAlterar.setContentAreaFilled(false);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 650, 40, 40));

        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 650, 40, 50));

        jCheckBoxInativarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxInativarVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxInativarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 660, 20, 20));

        txtDataCadastro.setBorder(null);
        txtDataCadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtDataCadastro.setOpaque(false);
        txtDataCadastro.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDataCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataCadastroKeyReleased(evt);
            }
        });
        jPanel1.add(txtDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 200, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblGerenciarVeiculo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGerenciarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGerenciarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, 1060, 50));

        telaCadastroVeiculo.setForeground(new java.awt.Color(204, 204, 255));
        telaCadastroVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TelaCadastroVeiculo.png"))); // NOI18N
        telaCadastroVeiculo.setAutoscrolls(true);
        jPanel1.add(telaCadastroVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    void limparCampos() {
        txtAnoFabricacao.setText("");
        txtAnoModelo.setText("");
        txtChassi.setText("");
        txtCombustivel.setText("");
        txtCor.setText("");
        txtDataCadastro.setText("");
        txtKmAtual.setText("");
        txtDataCompra.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtMotor.setText("");
        txtNumCRV.setText("");
        txtPlaca.setText("");
        txtPlacaCadastro.setText("");
        txtRenavam.setText("");
        txtTipoVeiculo.setText("");
        txtVencGarantia.setText("");
        jCheckBoxInativarVeiculo.setSelected(false);

    }

    private void txtCorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorKeyReleased

    private void txtCombustivelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCombustivelKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCombustivelKeyReleased

    private void txtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaKeyReleased

    private void txtPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaKeyReleased

    private void txtTipoVeiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoVeiculoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoVeiculoKeyReleased

    private void txtAnoModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoModeloKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoModeloKeyReleased

    private void txtKmAtualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKmAtualKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKmAtualKeyReleased

    private void txtDataCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataCompraKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataCompraKeyReleased

    private void txtVencGarantiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVencGarantiaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVencGarantiaKeyReleased

    private void txtNumCRVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCRVKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCRVKeyReleased

    private void txtRenavamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRenavamKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRenavamKeyReleased

    private void txtChassiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChassiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChassiKeyReleased

    private void txtMotorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotorKeyReleased

    private void txtDataCadastroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataCadastroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataCadastroKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        VeiculosDao dao = new VeiculosDao();
        
        if (txtPlacaCadastro.getText().isEmpty() || txtAnoFabricacao.getText().isEmpty() || txtAnoModelo.getText().isEmpty() || txtChassi.getText().isEmpty()
                || txtCombustivel.getText().isEmpty() || txtCor.getText().isEmpty() || txtNumCRV.getText().isEmpty() || txtDataCadastro.getText().isEmpty()
                || txtDataCompra.getText().isEmpty() || txtVencGarantia.getText().isEmpty() || txtKmAtual.getText().isEmpty() || txtMarca.getText().isEmpty()
                || txtModelo.getText().isEmpty() || txtMotor.getText().isEmpty() || txtRenavam.getText().isEmpty() || txtTipoVeiculo.getText().isEmpty()) {
            
            lblGerenciarVeiculo.setText("Preencha todos os campos para o cadastro.");
            
        }else if(!dao.isDateValidate(txtDataCadastro.getText()) || !dao.isDateValidate(txtDataCompra.getText()) || !dao.isDateValidate(txtVencGarantia.getText())) {
        
            lblGerenciarVeiculo.setText("Todos os campos de data devem estar no formato dd/MM/yyyy.");
        
        }
        else {
            boolean status;
            int resp;
            Veiculos veiculos = new Veiculos();

            veiculos.setPlaca(txtPlacaCadastro.getText());
            veiculos.setAnoFabricacao(Integer.parseInt(txtAnoFabricacao.getText()));
            veiculos.setAnoModelo(Integer.parseInt(txtAnoModelo.getText()));
            veiculos.setChassi(txtChassi.getText());
            veiculos.setCombustivel(txtCombustivel.getText());
            veiculos.setCor(txtCor.getText());
            veiculos.setCrv(txtNumCRV.getText());
            veiculos.setDataCadastro(LocalDate.parse(txtDataCadastro.getText(), formatoEntradaBrasileiro));
            veiculos.setDataCompra(LocalDate.parse(txtDataCompra.getText(), formatoEntradaBrasileiro));
            veiculos.setVencimentoGarantia(LocalDate.parse(txtVencGarantia.getText(), formatoEntradaBrasileiro));
            veiculos.setKmAtual(Integer.parseInt(txtKmAtual.getText()));
            veiculos.setMarca(txtMarca.getText());
            veiculos.setModelo(txtModelo.getText());
            veiculos.setMotor(txtMotor.getText());
            veiculos.setRenavam(txtRenavam.getText());
            veiculos.setTipoVeiculo(txtTipoVeiculo.getText());
            veiculos.setInativarVeiculo(jCheckBoxInativarVeiculo.isSelected());

            status = dao.conectar();
            if (!status) {
                lblGerenciarVeiculo.setText("Erro na conexão com o Banco do Dados.");
            } else {
                resp = dao.salvar(veiculos);
                if (resp == 1) {
                    lblGerenciarVeiculo.setText("Dados inseridos com sucesso!!!");
                    limparCampos();
                    txtPlaca.requestFocus();
                } else if (resp == 1062) {
                    txtPlaca.requestFocus();
                    lblGerenciarVeiculo.setText("Número da placa já cadastrado.");

                } else {
                    lblGerenciarVeiculo.setText("Erro ao salvar!!!");

                }

                dao.desconectar();

            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnConsultarCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCadastrarVeiculoActionPerformed
        String placaConsulta;

        if (txtPlaca.getText().isEmpty()) {
            lblGerenciarVeiculo.setText("A placa deve ser digitada.");
        } else {
            placaConsulta = txtPlaca.getText();
            Veiculos veiculos = new Veiculos();
            VeiculosDao dao = new VeiculosDao();
            boolean status = dao.conectar();
            if (status == true) {
                veiculos = dao.consultar(placaConsulta);
                if (veiculos == null) {
                    lblGerenciarVeiculo.setText("Veículo não encontrado.");
                } else {
                    txtPlaca.setText("");
                    txtPlacaCadastro.setText(veiculos.getPlaca());
                    txtAnoFabricacao.setText(veiculos.getAnoFabricacao().toString());
                    txtAnoModelo.setText(veiculos.getAnoModelo().toString());
                    txtChassi.setText(veiculos.getChassi());
                    txtCombustivel.setText(veiculos.getCombustivel());
                    txtCor.setText(veiculos.getCor());
                    txtDataCadastro.setText(veiculos.getDataCadastro().format(formatoEntradaBrasileiro));
                    txtDataCompra.setText(veiculos.getDataCompra().format(formatoEntradaBrasileiro));
                    txtKmAtual.setText(veiculos.getKmAtual().toString());
                    txtMarca.setText(veiculos.getMarca());
                    txtModelo.setText(veiculos.getModelo());
                    txtMotor.setText(veiculos.getMotor());
                    txtNumCRV.setText(veiculos.getCrv());
                    txtRenavam.setText(veiculos.getRenavam());
                    txtTipoVeiculo.setText(veiculos.getTipoVeiculo());
                    txtVencGarantia.setText(veiculos.getVencimentoGarantia().format(formatoEntradaBrasileiro));
                    jCheckBoxInativarVeiculo.setSelected(veiculos.getInativarVeiculo());

                }
            } else {
                lblGerenciarVeiculo.setText("Erro na conexão com o Banco de Dados.");
            }

            dao.desconectar();
        }
    }//GEN-LAST:event_btnConsultarCadastrarVeiculoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        VeiculosDao dao = new VeiculosDao();
        boolean status = dao.conectar();                    
        if (txtPlacaCadastro.getText().isEmpty() || txtAnoFabricacao.getText().isEmpty() || txtAnoModelo.getText().isEmpty() || txtChassi.getText().isEmpty()
                || txtCombustivel.getText().isEmpty() || txtCor.getText().isEmpty() || txtNumCRV.getText().isEmpty() || txtDataCadastro.getText().isEmpty()
                || txtDataCompra.getText().isEmpty() || txtVencGarantia.getText().isEmpty() || txtKmAtual.getText().isEmpty() || txtMarca.getText().isEmpty()
                || txtModelo.getText().isEmpty() || txtMotor.getText().isEmpty() || txtRenavam.getText().isEmpty() || txtTipoVeiculo.getText().isEmpty()) {
            
            lblGerenciarVeiculo.setText("Preencha todos os campos.");
            
        } else if(dao.NoEqualsPlaca(txtPlacaCadastro.getText()) == 0){
            lblGerenciarVeiculo.setText("Não existe veículo cadastrado nessa placa, digite novamente.");            
        }else if(!dao.isDateValidate(txtDataCadastro.getText()) || !dao.isDateValidate(txtDataCompra.getText()) || !dao.isDateValidate(txtVencGarantia.getText())) {
        
            lblGerenciarVeiculo.setText("Todos os campos de data deve estar no formato dd/MM/yyyy.");
        
        }        
        else{    

            Veiculos veiculos = new Veiculos();

            veiculos.setPlaca(txtPlacaCadastro.getText());
            veiculos.setAnoFabricacao(Integer.parseInt(txtAnoFabricacao.getText()));
            veiculos.setAnoModelo(Integer.parseInt(txtAnoModelo.getText()));
            veiculos.setChassi(txtChassi.getText());
            veiculos.setCombustivel(txtCombustivel.getText());
            veiculos.setCor(txtCor.getText());
            veiculos.setCrv(txtNumCRV.getText());
            veiculos.setDataCadastro(LocalDate.parse(txtDataCadastro.getText(), formatoEntradaBrasileiro));
            veiculos.setDataCompra(LocalDate.parse(txtDataCompra.getText(), formatoEntradaBrasileiro));
            veiculos.setVencimentoGarantia(LocalDate.parse(txtVencGarantia.getText(), formatoEntradaBrasileiro));
            veiculos.setKmAtual(Integer.parseInt(txtKmAtual.getText()));
            veiculos.setMarca(txtMarca.getText());
            veiculos.setModelo(txtModelo.getText());
            veiculos.setMotor(txtMotor.getText());
            veiculos.setRenavam(txtRenavam.getText());
            veiculos.setTipoVeiculo(txtTipoVeiculo.getText());
            veiculos.setInativarVeiculo(jCheckBoxInativarVeiculo.isSelected());

            if (status) {
                status = dao.alterar(veiculos);
                if (status) {
                    lblGerenciarVeiculo.setText("Veículo alterado com sucesso.");
                    limparCampos();

                } else {
                    lblGerenciarVeiculo.setText("O veículo não foi alterado.");
                }
                dao.desconectar();
            } else {
                lblGerenciarVeiculo.setText("Erro na conexão com o Banco de Dados.");
            }

            dao.desconectar();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
        lblGerenciarVeiculo.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtDataCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataCompraActionPerformed

    private void txtPlacaCadastroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaCadastroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaCadastroKeyReleased

    private void jCheckBoxInativarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxInativarVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxInativarVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(telaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastroVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultarCadastrarVeiculo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox jCheckBoxInativarVeiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblGerenciarVeiculo;
    private javax.swing.JLabel telaCadastroVeiculo;
    private app.bolivia.swing.JCTextField txtAnoFabricacao;
    private app.bolivia.swing.JCTextField txtAnoModelo;
    private app.bolivia.swing.JCTextField txtChassi;
    private app.bolivia.swing.JCTextField txtCombustivel;
    private app.bolivia.swing.JCTextField txtCor;
    private app.bolivia.swing.JCTextField txtDataCadastro;
    private app.bolivia.swing.JCTextField txtDataCompra;
    private app.bolivia.swing.JCTextField txtKmAtual;
    private app.bolivia.swing.JCTextField txtMarca;
    private app.bolivia.swing.JCTextField txtModelo;
    private app.bolivia.swing.JCTextField txtMotor;
    private app.bolivia.swing.JCTextField txtNumCRV;
    private app.bolivia.swing.JCTextField txtPlaca;
    private app.bolivia.swing.JCTextField txtPlacaCadastro;
    private app.bolivia.swing.JCTextField txtRenavam;
    private app.bolivia.swing.JCTextField txtTipoVeiculo;
    private app.bolivia.swing.JCTextField txtVencGarantia;
    // End of variables declaration//GEN-END:variables
}
