package views;

import static com.sun.glass.ui.Window.State.MAXIMIZED;
import java.text.DateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mariana
 */
public class telaInicial extends javax.swing.JFrame {

    /**
     * Creates new form telaInicial
     */
    public telaInicial() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menGerUsu = new javax.swing.JMenu();
        menGerUsuConCadUsu = new javax.swing.JMenuItem();
        menGerVei = new javax.swing.JMenu();
        menGerVeiConCadVei = new javax.swing.JMenuItem();
        menGerProd = new javax.swing.JMenu();
        menGerProdConCadProd = new javax.swing.JMenuItem();
        menGerPlMan = new javax.swing.JMenu();
        menGerPlManCadPlan = new javax.swing.JMenuItem();
        menGerPlManConPlan = new javax.swing.JMenuItem();
        menAgend = new javax.swing.JMenu();
        menAgendCriarAgend = new javax.swing.JMenuItem();
        menAgendAgendManut = new javax.swing.JMenuItem();
        menOrdSer = new javax.swing.JMenu();
        menOrdServGerOS = new javax.swing.JMenuItem();
        menOrdServHistManut = new javax.swing.JMenuItem();
        menOrdServHistManut1 = new javax.swing.JMenuItem();
        menOrdSer1 = new javax.swing.JMenu();
        menSairFechar = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 436, 170, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Abraão Lemos LTDA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktop.setToolTipText("");
        desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktop.setPreferredSize(new java.awt.Dimension(1440, 900));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Acesso:");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data");

        desktop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(lblData, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addContainerGap(1504, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData)
                    .addComponent(jLabel2))
                .addContainerGap(897, Short.MAX_VALUE))
        );

        menGerUsu.setBackground(new java.awt.Color(51, 51, 51));
        menGerUsu.setBorder(null);
        menGerUsu.setForeground(new java.awt.Color(0, 51, 255));
        menGerUsu.setText("  Gerenciar Usuário  ");
        menGerUsu.setBorderPainted(true);
        menGerUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menGerUsu.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        menGerUsuConCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menGerUsuConCadUsu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menGerUsuConCadUsu.setText("Consultar/Cadastrar Usuário");
        menGerUsuConCadUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menGerUsuConCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menGerUsuConCadUsuActionPerformed(evt);
            }
        });
        menGerUsu.add(menGerUsuConCadUsu);

        Menu.add(menGerUsu);

        menGerVei.setBackground(new java.awt.Color(51, 51, 51));
        menGerVei.setBorder(null);
        menGerVei.setForeground(new java.awt.Color(0, 51, 255));
        menGerVei.setText("  Gerenciar Veículo  ");
        menGerVei.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menGerVei.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        menGerVeiConCadVei.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        menGerVeiConCadVei.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menGerVeiConCadVei.setText("Consultar/Cadastrar Veículo");
        menGerVeiConCadVei.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menGerVeiConCadVei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menGerVeiConCadVeiActionPerformed(evt);
            }
        });
        menGerVei.add(menGerVeiConCadVei);

        Menu.add(menGerVei);

        menGerProd.setBackground(new java.awt.Color(51, 51, 51));
        menGerProd.setBorder(null);
        menGerProd.setForeground(new java.awt.Color(0, 51, 255));
        menGerProd.setText("  Gerenciar Produto  ");
        menGerProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menGerProd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        menGerProdConCadProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menGerProdConCadProd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menGerProdConCadProd.setText("Consultar/Cadastrar Produto");
        menGerProdConCadProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menGerProdConCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menGerProdConCadProdActionPerformed(evt);
            }
        });
        menGerProd.add(menGerProdConCadProd);

        Menu.add(menGerProd);

        menGerPlMan.setBackground(new java.awt.Color(51, 51, 51));
        menGerPlMan.setBorder(null);
        menGerPlMan.setForeground(new java.awt.Color(0, 51, 255));
        menGerPlMan.setText("  Gerenciar Plano Manutenção  ");
        menGerPlMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menGerPlMan.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        menGerPlManCadPlan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menGerPlManCadPlan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menGerPlManCadPlan.setText("Cadastrar Plano de Manutenção");
        menGerPlManCadPlan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menGerPlManCadPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menGerPlManCadPlanActionPerformed(evt);
            }
        });
        menGerPlMan.add(menGerPlManCadPlan);

        menGerPlManConPlan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menGerPlManConPlan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menGerPlManConPlan.setText("Consultar Plano de Manutenção");
        menGerPlManConPlan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menGerPlManConPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menGerPlManConPlanActionPerformed(evt);
            }
        });
        menGerPlMan.add(menGerPlManConPlan);

        Menu.add(menGerPlMan);

        menAgend.setBackground(new java.awt.Color(51, 51, 51));
        menAgend.setBorder(null);
        menAgend.setForeground(new java.awt.Color(0, 51, 255));
        menAgend.setText("  Agendamento  ");
        menAgend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menAgend.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        menAgendCriarAgend.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        menAgendCriarAgend.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menAgendCriarAgend.setText("Criar Agenda ");
        menAgendCriarAgend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menAgendCriarAgend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAgendCriarAgendActionPerformed(evt);
            }
        });
        menAgend.add(menAgendCriarAgend);

        menAgendAgendManut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        menAgendAgendManut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menAgendAgendManut.setText("Agendamento");
        menAgendAgendManut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menAgendAgendManut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAgendAgendManutActionPerformed(evt);
            }
        });
        menAgend.add(menAgendAgendManut);

        Menu.add(menAgend);

        menOrdSer.setBackground(new java.awt.Color(51, 51, 51));
        menOrdSer.setBorder(null);
        menOrdSer.setForeground(new java.awt.Color(0, 51, 255));
        menOrdSer.setText("  Ordem Serviço  ");
        menOrdSer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menOrdSer.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        menOrdServGerOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menOrdServGerOS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menOrdServGerOS.setText("Consultar OS Aberta");
        menOrdServGerOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menOrdServGerOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOrdServGerOSActionPerformed(evt);
            }
        });
        menOrdSer.add(menOrdServGerOS);

        menOrdServHistManut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        menOrdServHistManut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menOrdServHistManut.setText("Manutenção");
        menOrdServHistManut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menOrdServHistManut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOrdServHistManutActionPerformed(evt);
            }
        });
        menOrdSer.add(menOrdServHistManut);

        menOrdServHistManut1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        menOrdServHistManut1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menOrdServHistManut1.setText("Histórico Manutenção");
        menOrdServHistManut1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menOrdServHistManut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOrdServHistManut1ActionPerformed(evt);
            }
        });
        menOrdSer.add(menOrdServHistManut1);

        Menu.add(menOrdSer);

        menOrdSer1.setBackground(new java.awt.Color(51, 51, 51));
        menOrdSer1.setBorder(null);
        menOrdSer1.setForeground(new java.awt.Color(255, 51, 51));
        menOrdSer1.setText("  Sair  ");
        menOrdSer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menOrdSer1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        menSairFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menSairFechar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menSairFechar.setText("Fechar Aplicação");
        menSairFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menSairFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairFecharActionPerformed(evt);
            }
        });
        menOrdSer1.add(menSairFechar);

        Menu.add(menOrdSer1);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1670, 1003));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //as linhas abaixo substituem a label lblData pela data atual sistema ao iniciar o Form
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void menGerUsuConCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menGerUsuConCadUsuActionPerformed
        //new telaCadastroUsuario().setVisible(true);
        telaCadastroUsuario TelaCadastroUsuario = new telaCadastroUsuario(); 
        desktop.add(TelaCadastroUsuario); // Adiciona o JInternalFrame ao desktop
        TelaCadastroUsuario.setVisible(true);
     
    }//GEN-LAST:event_menGerUsuConCadUsuActionPerformed

    private void menGerVeiConCadVeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menGerVeiConCadVeiActionPerformed
        //new telaCadastroVeiculo().setVisible(true);
        telaCadastroVeiculo TelaCadastroVeiculo = new telaCadastroVeiculo(); 
        desktop.add(TelaCadastroVeiculo);
        TelaCadastroVeiculo.setVisible(true);
    }//GEN-LAST:event_menGerVeiConCadVeiActionPerformed

    private void menGerProdConCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menGerProdConCadProdActionPerformed
        //new telaCadastroItem().setVisible(true);
        telaCadastroItem TelaCadastroItem = new telaCadastroItem(); 
        desktop.add(TelaCadastroItem);
        TelaCadastroItem.setVisible(true);
    }//GEN-LAST:event_menGerProdConCadProdActionPerformed

    private void menGerPlManCadPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menGerPlManCadPlanActionPerformed
        //new telaCadastroKitManutencao().setVisible(true);
        telaCadastroKitManutencao TelaCadastroKitManutencao = new telaCadastroKitManutencao(); 
        desktop.add(TelaCadastroKitManutencao);
        TelaCadastroKitManutencao.setVisible(true);
    }//GEN-LAST:event_menGerPlManCadPlanActionPerformed

    private void menGerPlManConPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menGerPlManConPlanActionPerformed
        //new telaConsultaKitManutencao().setVisible(true);
        telaConsultaKitManutencao TelaConsultaKitManutencao = new telaConsultaKitManutencao(); 
        desktop.add(TelaConsultaKitManutencao); // Adiciona o JInternalFrame ao desktop
        TelaConsultaKitManutencao.setVisible(true);
    }//GEN-LAST:event_menGerPlManConPlanActionPerformed

    private void menAgendCriarAgendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAgendCriarAgendActionPerformed
        //new telaCriarAgenda().setVisible(true);
        telaCriarAgenda TelaCriarAgenda = new telaCriarAgenda(); 
        desktop.add(TelaCriarAgenda); // Adiciona o JInternalFrame ao desktop
        TelaCriarAgenda.setVisible(true);
    }//GEN-LAST:event_menAgendCriarAgendActionPerformed

    private void menAgendAgendManutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAgendAgendManutActionPerformed
        //new telaAgendamento().setVisible(true);
        telaAgendamento TelaAgendamento = new telaAgendamento(); // Cria uma nova instância de Teste_1
        desktop.add(TelaAgendamento); // Adiciona o JInternalFrame ao desktop
        TelaAgendamento.setVisible(true);
    }//GEN-LAST:event_menAgendAgendManutActionPerformed

    private void menSairFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSairFecharActionPerformed
        /*new telaAgendamento().dispose();
        new telaCadastroItem().dispose();
        new telaCadastroUsuario().dispose();
        new telaCadastroUsuario().dispose();
        new telaConfirmarSenha().dispose();
        new telaConsultaKitManutencao().dispose();
        new telaCriarAgenda().dispose();
        new telaConsultarOSAberta().dispose();
        new telaManutencao().dispose();
        new telaInicial().dispose();*/
        this.dispose();// ajuste para fechar o menu
    }//GEN-LAST:event_menSairFecharActionPerformed

    private void menOrdServGerOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOrdServGerOSActionPerformed
        //new telaConsultarOSAberta().setVisible(true);
        telaConsultarOSAberta TelaConsultarOSAberta = new telaConsultarOSAberta(); 
        desktop.add(TelaConsultarOSAberta); // Adiciona o JInternalFrame ao desktop
        TelaConsultarOSAberta.setVisible(true);
    }//GEN-LAST:event_menOrdServGerOSActionPerformed

    private void menOrdServHistManutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOrdServHistManutActionPerformed
        //new telaManutencao().setVisible(true);
        telaManutencao TelaManutencao = new telaManutencao(); 
        desktop.add(TelaManutencao); // Adiciona o JInternalFrame ao desktop
        TelaManutencao.setVisible(true);
    }//GEN-LAST:event_menOrdServHistManutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED);
    }//GEN-LAST:event_formWindowOpened

    private void menOrdServHistManut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOrdServHistManut1ActionPerformed
         //new telaHistoricoManutencao().setVisible(true);
        telaHistoricoManutencao TelaHistoricoManutencao = new telaHistoricoManutencao(); 
        desktop.add(TelaHistoricoManutencao); // Adiciona o JInternalFrame ao desktop
        TelaHistoricoManutencao.setVisible(true);
    }//GEN-LAST:event_menOrdServHistManut1ActionPerformed

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
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JMenu menAgend;
    private javax.swing.JMenuItem menAgendAgendManut;
    private javax.swing.JMenuItem menAgendCriarAgend;
    private javax.swing.JMenu menGerPlMan;
    private javax.swing.JMenuItem menGerPlManCadPlan;
    private javax.swing.JMenuItem menGerPlManConPlan;
    private javax.swing.JMenu menGerProd;
    private javax.swing.JMenuItem menGerProdConCadProd;
    private javax.swing.JMenu menGerUsu;
    private javax.swing.JMenuItem menGerUsuConCadUsu;
    private javax.swing.JMenu menGerVei;
    private javax.swing.JMenuItem menGerVeiConCadVei;
    private javax.swing.JMenu menOrdSer;
    private javax.swing.JMenu menOrdSer1;
    private javax.swing.JMenuItem menOrdServGerOS;
    private javax.swing.JMenuItem menOrdServHistManut;
    private javax.swing.JMenuItem menOrdServHistManut1;
    private javax.swing.JMenuItem menSairFechar;
    // End of variables declaration//GEN-END:variables
}
