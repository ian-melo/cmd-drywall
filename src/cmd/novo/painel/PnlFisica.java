/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.novo.painel;

import cmd.novo.Validacao;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PnlFisica extends javax.swing.JPanel {
    
    public String getTxt_nome_pnl() {//Fornece acesso a outras classes
        return txt_nome_pnl.getText();
    }
    public String getTxt_cpf_pnl() {//Fornece acesso a outras classes
        return txt_cpf_pnl.getText();
    }
    public Date getTxt_dataNasc_pnl() {//Fornece acesso a outras classes
        return txt_dataNasc_pnl.getDate();
    }
        
    
    

    /**
     * Creates new form pnl_fisica
     */
    public PnlFisica() {
        initComponents();

        pnl_pessoa.setBackground(Color.WHITE);
        
        txt_dataNasc_pnl.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_pessoa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nome_pnl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_cpf_pnl = new javax.swing.JFormattedTextField();
        txt_dataNasc_pnl = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:*");

        txt_nome_pnl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nome_pnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nome_pnlFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CPF:*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento:*");

        try {
            txt_cpf_pnl.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cpf_pnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cpf_pnlFocusLost(evt);
            }
        });

        txt_dataNasc_pnl.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_pessoaLayout = new javax.swing.GroupLayout(pnl_pessoa);
        pnl_pessoa.setLayout(pnl_pessoaLayout);
        pnl_pessoaLayout.setHorizontalGroup(
            pnl_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nome_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cpf_pnl)
                    .addComponent(txt_dataNasc_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_pessoaLayout.setVerticalGroup(
            pnl_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nome_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cpf_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_dataNasc_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        txt_nome_pnl.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_pessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_pessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cpf_pnlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cpf_pnlFocusLost
       Validacao vali = new Validacao();
       if( vali.validarCpf(txt_cpf_pnl.getText()) == false){
           JOptionPane.showMessageDialog(txt_nome_pnl, "Verificar o CPF");
       }
    }//GEN-LAST:event_txt_cpf_pnlFocusLost

    private void txt_nome_pnlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nome_pnlFocusLost
       Validacao vali = new Validacao();
       if( vali.validarVazio(txt_nome_pnl.getText()) == true){
           JOptionPane.showMessageDialog(txt_nome_pnl, "Verificar o nome");
       }
    }//GEN-LAST:event_txt_nome_pnlFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnl_pessoa;
    private javax.swing.JFormattedTextField txt_cpf_pnl;
    private com.toedter.calendar.JDateChooser txt_dataNasc_pnl;
    private javax.swing.JTextField txt_nome_pnl;
    // End of variables declaration//GEN-END:variables
}
