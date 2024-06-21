/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import config.Agenda;
import config.AgendaDao;
import config.Conectar;
import java.awt.Dialog;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class telaCriarAgenda extends javax.swing.JInternalFrame {

    DateTimeFormatter formatoEntradaBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public telaCriarAgenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jdcDataInicio = new com.toedter.calendar.JDateChooser();
        jdcDataFim = new com.toedter.calendar.JDateChooser();
        jdcDataAgendada = new com.toedter.calendar.JDateChooser();
        jdcConsultarDataFim = new com.toedter.calendar.JDateChooser();
        jdcConsultarDataInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtConsultar = new javax.swing.JTable();
        btnSalvarAgenda = new javax.swing.JButton();
        btnLimparAgenda = new javax.swing.JButton();
        btnCancelarAgenda = new javax.swing.JButton();
        btnLimparCancelar = new javax.swing.JButton();
        btnConsultarAgenda = new javax.swing.JButton();
        btnLimparConsulta = new javax.swing.JButton();
        lblRetornoCriarAgenda = new javax.swing.JLabel();
        pnlRetornoCriarAgenda = new javax.swing.JPanel();
        pnlConsultr = new javax.swing.JPanel();
        lblConsultar = new javax.swing.JLabel();
        lblCancelarAgenda = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        telaCriarAgenda = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(true);
        setTitle("Abraão Lemos LTDA");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdcDataInicio.setAutoscrolls(true);
        jdcDataInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jdcDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 200, 40));

        jdcDataFim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jdcDataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 200, 40));

        jdcDataAgendada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jdcDataAgendada, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 240, 40));

        jdcConsultarDataFim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jdcConsultarDataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 200, 40));

        jdcConsultarDataInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jdcConsultarDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 210, 40));

        tbtConsultar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbtConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DATA", "HORÁRIO", "STATUS", "BOX"
            }
        ));
        tbtConsultar.setRowHeight(28);
        jScrollPane1.setViewportView(tbtConsultar);
        if (tbtConsultar.getColumnModel().getColumnCount() > 0) {
            tbtConsultar.getColumnModel().getColumn(0).setPreferredWidth(150);
            tbtConsultar.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbtConsultar.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbtConsultar.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 760, 190));

        btnSalvarAgenda.setContentAreaFilled(false);
        btnSalvarAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAgendaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 40, 40));

        btnLimparAgenda.setContentAreaFilled(false);
        btnLimparAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparAgendaActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimparAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 40, 40));

        btnCancelarAgenda.setContentAreaFilled(false);
        btnCancelarAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAgendaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 150, 40, 40));

        btnLimparCancelar.setContentAreaFilled(false);
        btnLimparCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimparCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 150, -1, 40));

        btnConsultarAgenda.setContentAreaFilled(false);
        btnConsultarAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAgendaActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 40, 40));

        btnLimparConsulta.setContentAreaFilled(false);
        btnLimparConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimparConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, -1, 40));

        lblRetornoCriarAgenda.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblRetornoCriarAgenda.setToolTipText("");
        jPanel2.add(lblRetornoCriarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 420, 30));

        pnlRetornoCriarAgenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlRetornoCriarAgendaLayout = new javax.swing.GroupLayout(pnlRetornoCriarAgenda);
        pnlRetornoCriarAgenda.setLayout(pnlRetornoCriarAgendaLayout);
        pnlRetornoCriarAgendaLayout.setHorizontalGroup(
            pnlRetornoCriarAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        pnlRetornoCriarAgendaLayout.setVerticalGroup(
            pnlRetornoCriarAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel2.add(pnlRetornoCriarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 440, 40));

        pnlConsultr.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblConsultar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        javax.swing.GroupLayout pnlConsultrLayout = new javax.swing.GroupLayout(pnlConsultr);
        pnlConsultr.setLayout(pnlConsultrLayout);
        pnlConsultrLayout.setHorizontalGroup(
            pnlConsultrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlConsultrLayout.setVerticalGroup(
            pnlConsultrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultrLayout.createSequentialGroup()
                .addComponent(lblConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(pnlConsultr, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 760, 40));

        lblCancelarAgenda.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblCancelarAgenda.setToolTipText("");
        jPanel2.add(lblCancelarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 480, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 500, 50));

        telaCriarAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TelaCriarAgenda.png"))); // NOI18N
        jPanel2.add(telaCriarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparConsultaActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbtConsultar.getModel();
        model.setRowCount(0);
        jdcConsultarDataInicio.setDate(null);
        jdcConsultarDataFim.setDate(null);
        lblConsultar.setText("");

    }//GEN-LAST:event_btnLimparConsultaActionPerformed

    private void btnCancelarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgendaActionPerformed
        AgendaDao dao = new AgendaDao();
        if (jdcDataAgendada.getDate() == null) {

            lblCancelarAgenda.setText("Campo de Data não pode ser vazio.");

        } else if (dao.NoEqualsData(jdcDataAgendada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()) == 0) {
            lblCancelarAgenda.setText("Não existe essa data na agenda para ser cancelada.");
        } else {
            Agenda agenda = new Agenda();

            agenda.setData(jdcDataAgendada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            boolean status = dao.alterar(agenda);
            if (status) {
                lblCancelarAgenda.setText("Data cancelada com sucesso.");
            } else {
                lblCancelarAgenda.setText("Não foi cancelada a data da agenda.");
            }
        }
    }//GEN-LAST:event_btnCancelarAgendaActionPerformed

    private void btnConsultarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAgendaActionPerformed
        // TODO add your handling code here:
        AgendaDao dao = new AgendaDao();
        if (jdcConsultarDataInicio.getDate() == null || jdcConsultarDataFim.getDate() == null) {
            lblConsultar.setText("O campo data não pode ser vazio.");
        } else {
            LocalDate localDateInicio = jdcConsultarDataInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localDateFim = jdcConsultarDataFim.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            List<Agenda> agendaEncontrada = new ArrayList<>();
            int resp;
            LocalDate dataAtual = localDateInicio;
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("DATA");
            model.addColumn("HORÁRIO");
            model.addColumn("STATUS");
            model.addColumn("BOX");
            while (!dataAtual.isAfter(localDateFim)) {

                agendaEncontrada = dao.consultarPorAgenda(dataAtual);

                if (agendaEncontrada.isEmpty()) {

                } else {
                    for (Agenda agenda : agendaEncontrada) {
                        model.addRow(new Object[]{
                            agenda.getData().format(formatoEntradaBrasileiro),
                            agenda.getHorario(),
                            agenda.getStatus(),
                            agenda.getBox()
                        });
                    }

                }

                dataAtual = dataAtual.plusDays(1);
            }

            if (agendaEncontrada.isEmpty()) {
                lblConsultar.setText("Não existe agenda para ser consultada.");
            } else {
                tbtConsultar.setModel(model);
            }

        }
    }//GEN-LAST:event_btnConsultarAgendaActionPerformed

    private void btnLimparAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparAgendaActionPerformed
        jdcDataInicio.setDate(null);
        jdcDataFim.setDate(null);
        lblRetornoCriarAgenda.setText("");
    }//GEN-LAST:event_btnLimparAgendaActionPerformed

    private void btnLimparCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCancelarActionPerformed
        jdcDataAgendada.setDate(null);
        lblCancelarAgenda.setText("");
    }//GEN-LAST:event_btnLimparCancelarActionPerformed

    private void btnSalvarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAgendaActionPerformed
        //Criar uma nova agenda

        if (jdcDataInicio.getDate() == null || jdcDataFim.getDate() == null) {
            lblRetornoCriarAgenda.setText("O campo data não pode ser vazio.");
        } else {
            LocalDate localDateInicio = jdcDataInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localDateFim = jdcDataFim.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            List<Agenda> agenda = new ArrayList<>();
            int resp;
            LocalDate dataAtual = localDateInicio;
            while (!dataAtual.isAfter(localDateFim)) {

                int number1 = 1;
                for (int i = 1; i < 6; i++) {
                    Agenda entrada = new Agenda();
                    entrada.setData(dataAtual);
                    entrada.setHorario("08:00");
                    entrada.setStatus("DISPONÍVEL");
                    entrada.setBox(number1++);
                    agenda.add(entrada);
                }
                int number2 = 1;
                for (int i = 1; i < 6; i++) {
                    Agenda entrada = new Agenda();
                    entrada.setData(dataAtual);
                    entrada.setHorario("11:00");
                    entrada.setStatus("DISPONÍVEL");
                    entrada.setBox(number2++);
                    agenda.add(entrada);
                }
                int number3 = 1;
                for (int i = 1; i < 6; i++) {
                    Agenda entrada = new Agenda();
                    entrada.setData(dataAtual);
                    entrada.setHorario("14:00");
                    entrada.setStatus("DISPONÍVEL");
                    entrada.setBox(number3++);
                    agenda.add(entrada);
                }

                dataAtual = dataAtual.plusDays(1);
            }
            AgendaDao dao = new AgendaDao();
            resp = dao.incluirAgenda(agenda);
            if (resp >= 1) {
                lblRetornoCriarAgenda.setText("Dados inseridos com sucesso!!!");

            } else {
                lblRetornoCriarAgenda.setText("Erro ao salvar");
            }

        }

    }//GEN-LAST:event_btnSalvarAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(telaCriarAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCriarAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCriarAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCriarAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCriarAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAgenda;
    private javax.swing.JButton btnConsultarAgenda;
    private javax.swing.JButton btnLimparAgenda;
    private javax.swing.JButton btnLimparCancelar;
    private javax.swing.JButton btnLimparConsulta;
    private javax.swing.JButton btnSalvarAgenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcConsultarDataFim;
    private com.toedter.calendar.JDateChooser jdcConsultarDataInicio;
    private com.toedter.calendar.JDateChooser jdcDataAgendada;
    private com.toedter.calendar.JDateChooser jdcDataFim;
    private com.toedter.calendar.JDateChooser jdcDataInicio;
    private javax.swing.JLabel lblCancelarAgenda;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblRetornoCriarAgenda;
    private javax.swing.JPanel pnlConsultr;
    private javax.swing.JPanel pnlRetornoCriarAgenda;
    private javax.swing.JTable tbtConsultar;
    private javax.swing.JLabel telaCriarAgenda;
    // End of variables declaration//GEN-END:variables
}
