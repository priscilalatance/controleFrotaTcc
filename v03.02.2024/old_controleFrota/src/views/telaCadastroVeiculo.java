/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import config.UsuariosDao;
import config.Veiculos;
import config.VeiculosDao;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mariana
 */
public class telaCadastroVeiculo extends javax.swing.JFrame {

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
        txtPlaca = new app.bolivia.swing.JCTextField();
        txtModelo = new app.bolivia.swing.JCTextField();
        txtCor = new app.bolivia.swing.JCTextField();
        txtCombustivel = new app.bolivia.swing.JCTextField();
        txtMarca = new app.bolivia.swing.JCTextField();
        btnInspecao = new javax.swing.JButton();
        btnConsultarCadastrarVeiculo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jCheckBoxInativarVeiculo = new javax.swing.JCheckBox();
        txtDataCadastro = new app.bolivia.swing.JCTextField();
        telaCadastroVeiculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abraão Lemos LTDA");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMotor.setBackground(java.awt.SystemColor.controlHighlight);
        txtMotor.setBorder(null);
        txtMotor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMotor.setOpaque(false);
        txtMotor.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMotor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMotorKeyReleased(evt);
            }
        });
        jPanel1.add(txtMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 600, 260, 30));

        txtChassi.setBackground(java.awt.SystemColor.controlHighlight);
        txtChassi.setBorder(null);
        txtChassi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtChassi.setOpaque(false);
        txtChassi.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtChassi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChassiKeyReleased(evt);
            }
        });
        jPanel1.add(txtChassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 500, 260, 30));

        txtRenavam.setBackground(java.awt.SystemColor.controlHighlight);
        txtRenavam.setBorder(null);
        txtRenavam.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtRenavam.setOpaque(false);
        txtRenavam.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtRenavam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRenavamKeyReleased(evt);
            }
        });
        jPanel1.add(txtRenavam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 410, 260, 30));

        txtNumCRV.setBackground(java.awt.SystemColor.controlHighlight);
        txtNumCRV.setBorder(null);
        txtNumCRV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNumCRV.setOpaque(false);
        txtNumCRV.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNumCRV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumCRVKeyReleased(evt);
            }
        });
        jPanel1.add(txtNumCRV, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 700, 200, 30));

        txtVencGarantia.setBackground(java.awt.SystemColor.controlHighlight);
        txtVencGarantia.setBorder(null);
        txtVencGarantia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtVencGarantia.setOpaque(false);
        txtVencGarantia.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtVencGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVencGarantiaKeyReleased(evt);
            }
        });
        jPanel1.add(txtVencGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 200, 30));

        txtDataCompra.setBackground(java.awt.SystemColor.controlHighlight);
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
        jPanel1.add(txtDataCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 200, 30));

        txtKmAtual.setBackground(java.awt.SystemColor.controlHighlight);
        txtKmAtual.setBorder(null);
        txtKmAtual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtKmAtual.setOpaque(false);
        txtKmAtual.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtKmAtual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKmAtualKeyReleased(evt);
            }
        });
        jPanel1.add(txtKmAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 408, 200, -1));

        txtAnoModelo.setBackground(java.awt.SystemColor.controlHighlight);
        txtAnoModelo.setBorder(null);
        txtAnoModelo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAnoModelo.setOpaque(false);
        txtAnoModelo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtAnoModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnoModeloKeyReleased(evt);
            }
        });
        jPanel1.add(txtAnoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 700, 200, 30));

        txtAnoFabricacao.setBackground(java.awt.SystemColor.controlHighlight);
        txtAnoFabricacao.setBorder(null);
        txtAnoFabricacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAnoFabricacao.setOpaque(false);
        txtAnoFabricacao.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtAnoFabricacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 200, 40));

        txtTipoVeiculo.setBackground(java.awt.SystemColor.controlHighlight);
        txtTipoVeiculo.setBorder(null);
        txtTipoVeiculo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTipoVeiculo.setOpaque(false);
        txtTipoVeiculo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTipoVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTipoVeiculoKeyReleased(evt);
            }
        });
        jPanel1.add(txtTipoVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 200, 30));

        txtPlaca.setBorder(null);
        txtPlaca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPlaca.setOpaque(false);
        txtPlaca.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaKeyReleased(evt);
            }
        });
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 200, 30));

        txtModelo.setBackground(java.awt.SystemColor.controlHighlight);
        txtModelo.setBorder(null);
        txtModelo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtModelo.setOpaque(false);
        txtModelo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 200, 30));

        txtCor.setBackground(java.awt.SystemColor.controlHighlight);
        txtCor.setBorder(null);
        txtCor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCor.setOpaque(false);
        txtCor.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorKeyReleased(evt);
            }
        });
        jPanel1.add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, 200, 30));

        txtCombustivel.setBackground(java.awt.SystemColor.controlHighlight);
        txtCombustivel.setBorder(null);
        txtCombustivel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCombustivel.setOpaque(false);
        txtCombustivel.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCombustivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCombustivelKeyReleased(evt);
            }
        });
        jPanel1.add(txtCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 200, 30));

        txtMarca.setBackground(java.awt.SystemColor.controlHighlight);
        txtMarca.setBorder(null);
        txtMarca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMarca.setOpaque(false);
        txtMarca.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
        });
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 200, 30));

        btnInspecao.setContentAreaFilled(false);
        btnInspecao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnInspecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, 50));

        btnConsultarCadastrarVeiculo.setContentAreaFilled(false);
        btnConsultarCadastrarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCadastrarVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarCadastrarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 40, 40));

        btnLimpar.setContentAreaFilled(false);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 50, 40));

        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 810, 170, 50));

        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 810, 170, 50));

        btnAlterar.setContentAreaFilled(false);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 810, 170, 50));

        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 810, 170, 50));
        jPanel1.add(jCheckBoxInativarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 190, 20, 20));

        txtDataCadastro.setBackground(java.awt.SystemColor.controlHighlight);
        txtDataCadastro.setBorder(null);
        txtDataCadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtDataCadastro.setOpaque(false);
        txtDataCadastro.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDataCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataCadastroKeyReleased(evt);
            }
        });
        jPanel1.add(txtDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 200, 30));

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
        if (txtPlaca.getText().isEmpty() || txtAnoFabricacao.getText().isEmpty() || txtAnoModelo.getText().isEmpty() || txtChassi.getText().isEmpty()
                || txtCombustivel.getText().isEmpty() || txtCor.getText().isEmpty() || txtNumCRV.getText().isEmpty() || txtDataCadastro.getText().isEmpty()
                || txtDataCompra.getText().isEmpty() || txtVencGarantia.getText().isEmpty() || txtKmAtual.getText().isEmpty() || txtMarca.getText().isEmpty()
                || txtModelo.getText().isEmpty() || txtMotor.getText().isEmpty() || txtRenavam.getText().isEmpty() || txtTipoVeiculo.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos para o veículo ser cadastrado.");
            
        } else {

            VeiculosDao dao = new VeiculosDao();
            boolean status;
            int resp;
            Veiculos veiculos = new Veiculos();

            veiculos.setPlaca(txtPlaca.getText());
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
                JOptionPane.showMessageDialog(null, "Erro na conexão com Banco do Dados.");
            } else {
                resp = dao.salvar(veiculos);
                if (resp == 1) {
                    JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!!");
                    limparCampos();
                    txtPlaca.requestFocus();
                } else if (resp == 1062) {
                    txtPlaca.requestFocus();
                    JOptionPane.showMessageDialog(null, "Numero do placa já cadastrado");

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar!!!");

                }

                dao.desconectar();

            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        new telaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnConsultarCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCadastrarVeiculoActionPerformed
        String placaConsulta;

        if (txtPlaca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A placa deve ser digitada.");
        } else {
            placaConsulta = txtPlaca.getText();
            Veiculos veiculos = new Veiculos();
            VeiculosDao dao = new VeiculosDao();
            boolean status = dao.conectar();
            if (status == true) {
                veiculos = dao.consultar(placaConsulta);
                System.out.println(" " + placaConsulta);
                if (veiculos == null) {
                    JOptionPane.showMessageDialog(null, "Veiculo não encontrado.");
                } else {

                    txtAnoFabricacao.setText(veiculos.getAnoFabricacao().toString());
                    txtAnoModelo.setText(veiculos.getAnoModelo().toString());
                    txtChassi.setText(veiculos.getChassi());
                    txtCombustivel.setText(veiculos.getCombustivel());
                    txtCor.setText(veiculos.getCor());
                    txtDataCadastro.setText(veiculos.getDataCadastro().format(formatoEntradaBrasileiro));
                    txtDataCompra.setText(veiculos.getDataCompra().format(formatoEntradaBrasileiro));
                    txtKmAtual.setText(veiculos.getKmAtual().toString());
                    txtMarca.setText(veiculos.getMarca());
                    txtModelo.setText(veiculos.getMotor());
                    txtMotor.setText(veiculos.getMotor());
                    txtNumCRV.setText(veiculos.getCrv());
                    txtRenavam.setText(veiculos.getRenavam());
                    txtTipoVeiculo.setText(veiculos.getTipoVeiculo());
                    txtVencGarantia.setText(veiculos.getVencimentoGarantia().format(formatoEntradaBrasileiro));
                    jCheckBoxInativarVeiculo.setSelected(veiculos.getInativarVeiculo());

                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro na conexão do banco de Dados.");
            }

            dao.desconectar();
        }
    }//GEN-LAST:event_btnConsultarCadastrarVeiculoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        VeiculosDao dao = new VeiculosDao();
        boolean status = dao.conectar();                    
        if (txtPlaca.getText().isEmpty() || txtAnoFabricacao.getText().isEmpty() || txtAnoModelo.getText().isEmpty() || txtChassi.getText().isEmpty()
                || txtCombustivel.getText().isEmpty() || txtCor.getText().isEmpty() || txtNumCRV.getText().isEmpty() || txtDataCadastro.getText().isEmpty()
                || txtDataCompra.getText().isEmpty() || txtVencGarantia.getText().isEmpty() || txtKmAtual.getText().isEmpty() || txtMarca.getText().isEmpty()
                || txtModelo.getText().isEmpty() || txtMotor.getText().isEmpty() || txtRenavam.getText().isEmpty() || txtTipoVeiculo.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos para o veículo ser alterado.");
            
        } else if(dao.NoEqualsPlaca(txtPlaca.getText()) == 0){
            JOptionPane.showMessageDialog(null, "Não existe veiculo cadastrado com essa placa, digite novamente.");            
        }else{    

            Veiculos veiculos = new Veiculos();

            veiculos.setPlaca(txtPlaca.getText());
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
                    JOptionPane.showMessageDialog(null, "Veículo Alterado com sucesso.");
                    limparCampos();

                } else {
                    JOptionPane.showMessageDialog(null, "Veículo não foi alterado.");
                }
                dao.desconectar();
            } else {
                JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados.");
            }

            dao.desconectar();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (txtPlaca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A placa deve ser digitada.");
        } else {

            VeiculosDao dao = new VeiculosDao();
            Veiculos veiculos = new Veiculos();
            boolean status = dao.conectar();
            String placaConsulta;
            placaConsulta = txtPlaca.getText();
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados.");
            } else {
                if (status == true) {
                    status = dao.excluir(placaConsulta);
                    JOptionPane.showMessageDialog(null, "Veículo excluído com sucesso!");
                    limparCampos();
                    txtPlaca.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o veiculo.");
                }
            }
            dao.desconectar();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtDataCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataCompraActionPerformed

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
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInspecao;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox jCheckBoxInativarVeiculo;
    private javax.swing.JPanel jPanel1;
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
    private app.bolivia.swing.JCTextField txtRenavam;
    private app.bolivia.swing.JCTextField txtTipoVeiculo;
    private app.bolivia.swing.JCTextField txtVencGarantia;
    // End of variables declaration//GEN-END:variables
}