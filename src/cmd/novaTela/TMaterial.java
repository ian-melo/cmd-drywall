/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.novaTela;

import Entidade.Material;
import cmd.DAO.MaterialDAO;
import cmd.telas.material.MaterialTableView;
import java.awt.Color;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TMaterial extends javax.swing.JInternalFrame {

    private MaterialDAO dao = new MaterialDAO();
    private List<Material> Listamaterial;
    private ObservableList<MaterialTableView> tableview = FXCollections.observableArrayList();

    public static TMaterial materialT;

    public static TMaterial getInstancia() {
        if (materialT == null) {
            materialT = new TMaterial();
        }
        return materialT;
    }

    /**
     * Creates new form MaterialT
     */
    public TMaterial() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        pnl_botoes.setBackground(Color.WHITE);
        pnl_opcao.setBackground(Color.WHITE);
    }

    public void ListandoTableView() {
        Listamaterial = dao.ListaMaterial();
        tableview.clear();

        for (Material M : Listamaterial) {
            MaterialTableView view = new MaterialTableView(M.getId(), M.getNome(), M.getQuantidade(), M.getPreço(), M.getTipo(), M.getUnidade());
            tableview.add(view);
        }
//        tc_id.setCellValueFactory(new PropertyValueFactory<MaterialTableView, Integer>("Id"));
//        tc_nome.setCellValueFactory(new PropertyValueFactory<MaterialTableView, String>("Nome"));
//        tc_quantidade.setCellValueFactory(new PropertyValueFactory<MaterialTableView, Integer>("Quantidade"));
//        tb_materiais.setCellValueFactory(new PropertyValueFactory<MaterialTableView, Float>("Preço"));
//        tc_tipo.setCellValueFactory(new PropertyValueFactory<MaterialTableView, String>("Tipo"));
//        tc_unidade.setCellValueFactory(new PropertyValueFactory<MaterialTableView, String>("Unidade"));
//        tb_materiais.setItems(tableview);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nomeUnidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_constanteMetro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_precoUnitario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_materiais = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txt_qtdMinima = new javax.swing.JTextField();
        pnl_opcao = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        rd_sim = new javax.swing.JRadioButton();
        rd_nao = new javax.swing.JRadioButton();
        pnl_botoes = new javax.swing.JPanel();
        bt_cadastrar = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro Materiais");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Bem-Vindo a Área de Cadastro de Materiais");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome da Unidade:");

        txt_nomeUnidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Constante Metro:");

        txt_constanteMetro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Preço Unitario:");

        txt_precoUnitario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tipo:");

        txt_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Descrição");

        tb_materiais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_materiais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_materiais);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Quantidade Minima:");

        txt_qtdMinima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Opcional:");

        rd_sim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_sim.setText("SIM");

        rd_nao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_nao.setText("NÃO");

        javax.swing.GroupLayout pnl_opcaoLayout = new javax.swing.GroupLayout(pnl_opcao);
        pnl_opcao.setLayout(pnl_opcaoLayout);
        pnl_opcaoLayout.setHorizontalGroup(
            pnl_opcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_opcaoLayout.createSequentialGroup()
                .addGroup(pnl_opcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(rd_sim)
                    .addComponent(rd_nao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_opcaoLayout.setVerticalGroup(
            pnl_opcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_opcaoLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd_sim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd_nao))
        );

        bt_cadastrar.setBackground(new java.awt.Color(153, 153, 255));
        bt_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });

        bt_alterar.setBackground(new java.awt.Color(153, 153, 255));
        bt_alterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_alterar.setText("Alterar");
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        bt_sair.setBackground(new java.awt.Color(153, 153, 255));
        bt_sair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_sair.setText("Sair");

        javax.swing.GroupLayout pnl_botoesLayout = new javax.swing.GroupLayout(pnl_botoes);
        pnl_botoes.setLayout(pnl_botoesLayout);
        pnl_botoesLayout.setHorizontalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addGroup(pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_botoesLayout.setVerticalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addComponent(bt_cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_sair)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(txt_qtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txt_nomeUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_constanteMetro)
                                .addGap(73, 73, 73)))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnl_opcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(pnl_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_precoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nomeUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_constanteMetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_precoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnl_opcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_qtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        alterar();
    }//GEN-LAST:event_bt_alterarActionPerformed

//    private void Carregar(MouseEvent event) {
//        if (event.getClickCount() == 1) {
//            MaterialTableView view = tb_materiais.getSelectionModel().getSelectedItem();
//            String nome = view.getNome();
//            int quantidade = view.getQuantidade();
//            float preço = view.getPreço();
//            String tipo = view.getTipo();
//            String unidade = view.getUnidade();
//            txt_nomeUnidade.setText(nome);
//            txt_qtdMinima.setText(Integer.toString(quantidade));
//            txt_precoUnitario.setText(Float.toString(preço));
//            txt_tipo.setText(tipo);
//            txt_constanteMetro.setText(unidade);
//
//        }
//    }

    private void alterar() {
        if (txt_nomeUnidade.getText().isEmpty() || txt_qtdMinima.getText().isEmpty()
                || txt_precoUnitario.getText().isEmpty() || txt_tipo.getText().isEmpty() || txt_constanteMetro.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos para continuar");
            
            
        } else {
            MaterialDAO dao = new MaterialDAO();
            Material M = new Material();

//            M.setId(tb_materiais.getSelectionModel().getSelectedItem().getId());
//            M.setNome(txt_nomeUnidade.getText());
//            M.setQuantidade(Integer.parseInt(txt_qtdMinima.getText()));
//            M.setPreço(Float.parseFloat(txt_precoUnitario.getText()));
//            M.setTipo(txt_tipo.getText());
//            M.setUnidade(txt_constanteMetro.getText());
//            dao.Update(M);
//            txt_nomeUnidade.setText("");
//            txt_precoUnitario.setText("");
//            txt_qtdMinima.setText("");
//            txt_constanteMetro.setText("");
//            txt_tipo.setText("");
//            ListandoTableView();

        }
    }

    private void cadastrar() {
        //Random gerador = new Random();
        //int numero = gerador.nextInt(3);
        MaterialDAO dao = new MaterialDAO();
        Material M = new Material();
        sorteio();
        if (txt_nomeUnidade.getText().isEmpty() || txt_qtdMinima.getText().isEmpty()
                || txt_precoUnitario.getText().isEmpty() || txt_tipo.getText().isEmpty() || txt_constanteMetro.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos para continuar");

        } else {
            String nome = txt_nomeUnidade.getText();
            int quantidade = Integer.parseInt(txt_qtdMinima.getText());
            float preço = Float.parseFloat(txt_precoUnitario.getText());
            String tipo = txt_tipo.getText();
            String unidade = txt_constanteMetro.getText();
            M.setNome(nome);
            M.setQuantidade(quantidade);
            M.setPreço(preço);
            M.setTipo(tipo);
            M.setUnidade(unidade);
            M.setCod_construl(sorteia());
            dao.Create(M);
            txt_nomeUnidade.setText("");
            txt_precoUnitario.setText("");
            txt_qtdMinima.setText("");
            txt_constanteMetro.setText("");
            txt_tipo.setText("");
            ListandoTableView();
        }

    }

    public int sorteio() {
        Random r = new Random(); // gera o ramdomico
        final int H = 60; // intervalo mais alto
        final int L = 1; // intervalo mais baixo
        return r.nextInt(H + 1) + L;
    }
    Set<Integer> sorteados = new TreeSet<Integer>();

    public int sorteia() {
        Random r = new Random();
        final int H = 60;
        final int L = 1;
        int result;
        do {
            result = r.nextInt(H + 1) + L;
        } while (!sorteados.add(Integer.valueOf(result)));
        return result;
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
            java.util.logging.Logger.getLogger(TMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pnl_botoes;
    private javax.swing.JPanel pnl_opcao;
    private javax.swing.JRadioButton rd_nao;
    private javax.swing.JRadioButton rd_sim;
    private javax.swing.JTable tb_materiais;
    private javax.swing.JTextField txt_constanteMetro;
    private javax.swing.JTextField txt_nomeUnidade;
    private javax.swing.JTextField txt_precoUnitario;
    private javax.swing.JTextField txt_qtdMinima;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables
}
