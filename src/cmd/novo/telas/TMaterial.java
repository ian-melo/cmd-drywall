/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.novo.telas;

import cmd.entidade.Material;
import cmd.DAO.MaterialDAO;
import cmd.novo.GerenteDeJanelas;
import static cmd.novo.telas.TPrincipal.jDesktopPane1;
import cmd.novo.MaterialTableView;
import cmd.util.HibernateUtil;
import java.awt.Color;
//import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Usuario
 */
public class TMaterial extends javax.swing.JInternalFrame {

    GerenteDeJanelas gerenteDeJanelas;

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

        this.gerenteDeJanelas = new GerenteDeJanelas(jDesktopPane1);

        cmb_qualidade.removeAll();
        for (int i = 0; i <= 100; i++) {
            cmb_qualidade.addItem(i);
        }
    }

    private static String QUERY_BASED_ON_TUDO_MATERIAIS = "from Material";

//    public void ListandoTableView() {
//        Listamaterial = dao.ListaMaterial();
//        tableview.clear();
//
//        for (Material M : Listamaterial) {
//            MaterialTableView view = new MaterialTableView(M.getId(), M.getNome(), M.getQuantidade(), M.getPreço(), M.getTipo(), M.getUnidade());
//            tableview.add(view);
//        }
////        tc_id.setCellValueFactory(new PropertyValueFactory<MaterialTableView, Integer>("Id"));
////        tc_nome.setCellValueFactory(new PropertyValueFactory<MaterialTableView, String>("Nome"));
////        tc_quantidade.setCellValueFactory(new PropertyValueFactory<MaterialTableView, Integer>("Quantidade"));
////        tb_materiais.setCellValueFactory(new PropertyValueFactory<MaterialTableView, Float>("Preço"));
////        tc_tipo.setCellValueFactory(new PropertyValueFactory<MaterialTableView, String>("Tipo"));
////        tc_unidade.setCellValueFactory(new PropertyValueFactory<MaterialTableView, String>("Unidade"));
////        tb_materiais.setItems(tableview);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupRadioOpc = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_constanteMetro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_precoUnitario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descricao = new javax.swing.JTextArea();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmb_nomeUnidade = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmb_qualidade = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_materiais = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastro Materiais");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Bem-Vindo a Área de Cadastro de Materiais");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome da Unidade:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Constante Metro:*");

        txt_constanteMetro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Preço Unitario:*");

        txt_precoUnitario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tipo:*");

        txt_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Descrição:*");

        txt_descricao.setColumns(20);
        txt_descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_descricao.setRows(5);
        jScrollPane2.setViewportView(txt_descricao);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Quantidade Minima:*");

        txt_qtdMinima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Opcional:");

        grupRadioOpc.add(rd_sim);
        rd_sim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_sim.setText("SIM");

        grupRadioOpc.add(rd_nao);
        rd_nao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_nao.setSelected(true);
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
        bt_alterar.setEnabled(false);
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        bt_sair.setBackground(new java.awt.Color(153, 153, 255));
        bt_sair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

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

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("...");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setName(""); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("...");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setName(""); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("...");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setName(""); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        cmb_nomeUnidade.setBackground(new java.awt.Color(153, 153, 255));
        cmb_nomeUnidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_nomeUnidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CH", "PÇ", "RL", "CX", "BD" }));

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("...");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setName(""); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Qualidade:");

        cmb_qualidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_qualidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jScrollPane1.setToolTipText("");

        tb_materiais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_materiais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N. Material", "N. Unidade", "Const. M.", "Preço Uni.", "Qtd Minima", "Descrição", "Tipo", "Opcional"
            }
        ));
        jScrollPane1.setViewportView(tb_materiais);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 138, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        jLabel15.setBackground(new java.awt.Color(255, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("...");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setName(""); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_qtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_constanteMetro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmb_nomeUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(121, 121, 121)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(pnl_opcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel14)
                                            .addComponent(cmb_qualidade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_precoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(pnl_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(pnl_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_nomeUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_constanteMetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_precoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)))
                                    .addComponent(pnl_opcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_qtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cmb_qualidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        if (naoPreenchido() == false) {
            return;
        }
        cadastrar();
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        alterar();
    }//GEN-LAST:event_bt_alterarActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        janelaAviso();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        this.disable();

//        Teste tt = new Teste();
//        tt.setVisible(true);
//        tt.setModal(true);
//        GeralAviso tt = new GeralAviso(null, "Ola1", "ola2", "o3");
//        tt.setVisible(true);
//        tt.setModal(true);
//        TAviso tt = new TAviso(null, true);
//        tt.setVisible(true);
//        tt.setModal(true);
    }//GEN-LAST:event_bt_sairActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        janelaAviso();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        janelaAviso();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        janelaAviso();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //runQueryBasedOnTudo();

        //ACIMA
        JOptionPane.showMessageDialog(null, "Preenchimento de JTable comentado ir em 'formInternalFrameOpened'");
    }//GEN-LAST:event_formInternalFrameOpened

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        janelaAviso();
    }//GEN-LAST:event_jLabel15MouseClicked

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
    private void janelaAviso() {

        TAviso tAvi = new TAviso(null, true);
        tAvi.setVisible(true);
    }

    private void alterar() {
        if (naoPreenchido() == false) {
            return;
        }
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

    private void cadastrar() {

        //Random gerador = new Random();
        //int numero = gerador.nextInt(3);
        MaterialDAO dao = new MaterialDAO();

        if (txt_qtdMinima.getText().isEmpty() || txt_precoUnitario.getText().isEmpty()
                || txt_tipo.getText().isEmpty() || txt_constanteMetro.getText().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos para continuar");

        } else {
            boolean val;
            if (rd_sim.isSelected()) {
                val = true;
            } else {
                val = false;
            }

            //null, title, title, BigDecimal.ZERO, BigDecimal.ZERO, iconable, WIDTH, title, SOMEBITS, isIcon, sorteados
//            String nome = cmb_nomeUnidade.getSelectedItem().toString();
//            int quantidade = Integer.parseInt(txt_qtdMinima.getText());
//            float preço = Float.parseFloat(txt_precoUnitario.getText());
//            String tipo = txt_tipo.getText();
//            String unidade = txt_constanteMetro.getText();
//            M.setNome(nome);
//            M.setQuantidade(quantidade);
//            M.setPreço(preço);
//            M.setTipo(tipo);
//            M.setUnidade(unidade);
//            M.setCod_construl(sorteia());
//            dao.Create(M);
//
//            txt_precoUnitario.setText("");
//            txt_qtdMinima.setText("");
//            txt_constanteMetro.setText("");
//            txt_tipo.setText("");
            //ListandoTableView();
        }

    }

    private boolean naoPreenchido() {
        if (txt_qtdMinima.getText().isEmpty() || txt_precoUnitario.getText().isEmpty()
                || txt_tipo.getText().isEmpty() || txt_constanteMetro.getText().isEmpty()
                || txt_descricao.getText().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos para continuar");
            return false;
        }

        return true;
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
    private javax.swing.JComboBox cmb_nomeUnidade;
    private javax.swing.JComboBox cmb_qualidade;
    private javax.swing.ButtonGroup grupRadioOpc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnl_botoes;
    private javax.swing.JPanel pnl_opcao;
    private javax.swing.JRadioButton rd_nao;
    private javax.swing.JRadioButton rd_sim;
    private javax.swing.JTable tb_materiais;
    private javax.swing.JTextField txt_constanteMetro;
    private javax.swing.JTextArea txt_descricao;
    private javax.swing.JTextField txt_precoUnitario;
    private javax.swing.JTextField txt_qtdMinima;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables

    private void runQueryBasedOnTudo() {
        executeHQLQuery(QUERY_BASED_ON_TUDO_MATERIAIS);
    }

    private void executeHQLQuery(String hql) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            displayResult(resultList);
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
    }

    private void displayResult(List resultList) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("CodMaterial");
        tableHeaders.add("ConstanteMetro");
        tableHeaders.add("Construcao");
        tableHeaders.add("Descricao");
        tableHeaders.add("Opcional");
        //tableHeaders.add("MaterialItems");
        tableHeaders.add("NomeUnidade");
        tableHeaders.add("PrecoUnitario");
        tableHeaders.add("Qualidade");
        tableHeaders.add("Tipo");

        for (Object o : resultList) {
            Material mat = (Material) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(mat.getCodMaterial());
            oneRow.add(mat.getConstanteMetro());
            oneRow.add(mat.getConstrucao().getCodConstrucao());
            oneRow.add(mat.getDescricao());
            oneRow.add(mat.getEhOpcional());
            //oneRow.add(mat.getMaterialItems());
            oneRow.add(mat.getNomeUnidade());
            oneRow.add(mat.getPrecoUnitario());
            oneRow.add(mat.getQualidade());
            oneRow.add(mat.getTipo());

            tableData.add(oneRow);
        }
        tb_materiais.setModel(new DefaultTableModel(tableData, tableHeaders));

    }

}
