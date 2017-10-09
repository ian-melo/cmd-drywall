/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.novaTela;

import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class TPrincipal extends javax.swing.JFrame {

    GerenteDeJanelas gerenteDeJanelas;

    /**
     * Creates new form PrincipalT
     */
    public TPrincipal() {
        initComponents();
        //getContentPane().setBackground(Color.WHITE);
        pnl_botoes.setBackground(new Color(153, 153, 255));

        this.gerenteDeJanelas = new GerenteDeJanelas(jDesktopPane1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_botoes = new javax.swing.JPanel();
        btn_cadMateriais = new javax.swing.JButton();
        btn_calForroGesso = new javax.swing.JButton();
        btn_calParedeGesso = new javax.swing.JButton();
        btn_cadClientes = new javax.swing.JButton();
        btn_calOrcamentoPrj = new javax.swing.JButton();
        btn_relatorios = new javax.swing.JButton();
        btn_cadFuncionarios = new javax.swing.JButton();
        btn_solicitacaoOrcamento = new javax.swing.JButton();
        btn_cadConstrucao = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/cmd/imagens/logo.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image, 0,0,getWidth(),getHeight(),this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        btn_cadMateriais.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadMateriais.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cadMateriais.setText("Cadastro de Materias");
        btn_cadMateriais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadMateriaisActionPerformed(evt);
            }
        });

        btn_calForroGesso.setBackground(new java.awt.Color(255, 255, 255));
        btn_calForroGesso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_calForroGesso.setText("Cálculo de Forro de Gesso");

        btn_calParedeGesso.setBackground(new java.awt.Color(255, 255, 255));
        btn_calParedeGesso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_calParedeGesso.setText("Cálculo da Parede de Gesso");
        btn_calParedeGesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calParedeGessoActionPerformed(evt);
            }
        });

        btn_cadClientes.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cadClientes.setText("Cadastro de Clientes");
        btn_cadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadClientesActionPerformed(evt);
            }
        });

        btn_calOrcamentoPrj.setBackground(new java.awt.Color(255, 255, 255));
        btn_calOrcamentoPrj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_calOrcamentoPrj.setText("Cálculo de Orçamento do Projeto");
        btn_calOrcamentoPrj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calOrcamentoPrjActionPerformed(evt);
            }
        });

        btn_relatorios.setBackground(new java.awt.Color(255, 255, 255));
        btn_relatorios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_relatorios.setText("Relatórios");
        btn_relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_relatoriosActionPerformed(evt);
            }
        });

        btn_cadFuncionarios.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadFuncionarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cadFuncionarios.setText("Cadastrar Funcionários");
        btn_cadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadFuncionariosActionPerformed(evt);
            }
        });

        btn_solicitacaoOrcamento.setBackground(new java.awt.Color(255, 255, 255));
        btn_solicitacaoOrcamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_solicitacaoOrcamento.setText("Solicitações de Orçamento");
        btn_solicitacaoOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solicitacaoOrcamentoActionPerformed(evt);
            }
        });

        btn_cadConstrucao.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadConstrucao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cadConstrucao.setText("Cadastro de Construção");
        btn_cadConstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadConstrucaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_botoesLayout = new javax.swing.GroupLayout(pnl_botoes);
        pnl_botoes.setLayout(pnl_botoesLayout);
        pnl_botoesLayout.setHorizontalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cadMateriais, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calForroGesso, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calParedeGesso, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calOrcamentoPrj, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_solicitacaoOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnl_botoesLayout.setVerticalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btn_cadMateriais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cadConstrucao)
                .addGap(42, 42, 42)
                .addComponent(btn_calParedeGesso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_calOrcamentoPrj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_calForroGesso)
                .addGap(27, 27, 27)
                .addComponent(btn_cadClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cadFuncionarios)
                .addGap(30, 30, 30)
                .addComponent(btn_solicitacaoOrcamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_relatorios)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1056, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadFuncionariosActionPerformed
//       TFuncionario fT = new TFuncionario();
//        jDesktopPane1.add(fT);
//        fT.setVisible(true);

        try {
            gerenteDeJanelas.abrirJanelas(TFuncionario.getInstancia());
        } catch (IllegalArgumentException e) {
            gerenteDeJanelas.abrirJanelas(TFuncionario.getInstancia());
            //System.err.println(e);//ERRO ! - Erro - contornado.... retirar todo o try

        }
    }//GEN-LAST:event_btn_cadFuncionariosActionPerformed

    private void btn_solicitacaoOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solicitacaoOrcamentoActionPerformed

        try {
            gerenteDeJanelas.abrirJanelas(TSolicaoOrcamento.getInstancia());
        } catch (IllegalArgumentException e) {
            gerenteDeJanelas.abrirJanelas(TSolicaoOrcamento.getInstancia());
            //System.err.println(e);//ERRO ! - Erro - contornado.... retirar todo o try

        }
    }//GEN-LAST:event_btn_solicitacaoOrcamentoActionPerformed

    private void btn_cadMateriaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadMateriaisActionPerformed
        try {
            gerenteDeJanelas.abrirJanelas(TMaterial.getInstancia());
        } catch (IllegalArgumentException e) {
            gerenteDeJanelas.abrirJanelas(TMaterial.getInstancia());
            //System.err.println(e);//ERRO ! - Erro - contornado.... retirar todo o try

        }
    }//GEN-LAST:event_btn_cadMateriaisActionPerformed

    private void btn_calParedeGessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calParedeGessoActionPerformed
        try {
            gerenteDeJanelas.abrirJanelas(TCalculo.getInstancia());
        } catch (IllegalArgumentException e) {
            gerenteDeJanelas.abrirJanelas(TCalculo.getInstancia());
            //System.err.println(e);//ERRO ! - Erro - contornado.... retirar todo o try

        }
    }//GEN-LAST:event_btn_calParedeGessoActionPerformed

    private void btn_calOrcamentoPrjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calOrcamentoPrjActionPerformed

        try {
            gerenteDeJanelas.abrirJanelas(TCalculoOrcamento.getInstancia());
        } catch (IllegalArgumentException e) {
            gerenteDeJanelas.abrirJanelas(TCalculoOrcamento.getInstancia());
            //System.err.println(e);//ERRO ! - Erro - contornado.... retirar todo o try

        }
    }//GEN-LAST:event_btn_calOrcamentoPrjActionPerformed

    private void btn_cadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadClientesActionPerformed
        try {
            gerenteDeJanelas.abrirJanelas(TCliente.getInstancia());
        } catch (IllegalArgumentException e) {
            gerenteDeJanelas.abrirJanelas(TCliente.getInstancia());
            //System.err.println(e);//ERRO ! - Erro - contornado.... retirar todo o try

        }
    }//GEN-LAST:event_btn_cadClientesActionPerformed

    private void btn_relatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_relatoriosActionPerformed
        try {
            gerenteDeJanelas.abrirJanelas(TRelatorio.getInstancia());
        } catch (IllegalArgumentException e) {
            gerenteDeJanelas.abrirJanelas(TRelatorio.getInstancia());
            //System.err.println(e);//ERRO ! - Erro - contornado.... retirar todo o try

        }
    }//GEN-LAST:event_btn_relatoriosActionPerformed

    private void btn_cadConstrucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadConstrucaoActionPerformed
        try {
            gerenteDeJanelas.abrirJanelas(TConstrucao.getInstancia());
        } catch (IllegalArgumentException e) {
            gerenteDeJanelas.abrirJanelas(TConstrucao.getInstancia());
            //System.err.println(e);//ERRO ! - Erro - contornado.... retirar todo o try

        }
    }//GEN-LAST:event_btn_cadConstrucaoActionPerformed

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
            java.util.logging.Logger.getLogger(TPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadClientes;
    private javax.swing.JButton btn_cadConstrucao;
    private javax.swing.JButton btn_cadFuncionarios;
    private javax.swing.JButton btn_cadMateriais;
    private javax.swing.JButton btn_calForroGesso;
    private javax.swing.JButton btn_calOrcamentoPrj;
    private javax.swing.JButton btn_calParedeGesso;
    private javax.swing.JButton btn_relatorios;
    private javax.swing.JButton btn_solicitacaoOrcamento;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel pnl_botoes;
    // End of variables declaration//GEN-END:variables
}
