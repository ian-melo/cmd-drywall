/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela_cadastro_materiais;

import DAO.MaterialDAO;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.persistence.Id;

/**
 * FXML Controller class
 *
 * @author fe_mm
 */
public class MaterialFXMLController implements Initializable {
   
    @FXML
    private TextField txt_nome;
    @FXML
    private TextField txt_qtd;
    @FXML
    private TextField txt_preco;
    @FXML
    private TableView<MaterialTable> tb_precas;
    @FXML
    private Button bt_cadastrar;
    @FXML
    private Button bt_alterar;
    @FXML
    private Button bt_deletar;
    @FXML
    private Button bt_sair;
    @FXML
    private TableColumn<MaterialTable, String> tc_produto;
    @FXML
    private TableColumn<MaterialTable, Integer> tc_quantidade;
    @FXML
    private TableColumn<MaterialTable, Float> tc_preco;
    @FXML
    private TableColumn<MaterialTable, Integer> tc_id;
    private MaterialDAO dao = new MaterialDAO();
    private List<Materiais> listmatt;
    private ObservableList<MaterialTable> mattab = FXCollections.observableArrayList();
    int id;
    String nome;
    int qtd;
    float preço;
    @FXML
    private Button bt_atualizar;

    /**
     * Initializes the controller class.
     *
     */
    public void listarmateriais() 
    {
        //System.out.println("DADOS-----");
        listmatt = dao.Listmateriais();
        mattab.clear();
        for (Materiais materiais : listmatt) 
        {
            MaterialTable t = new MaterialTable(materiais.getId(), materiais.getNome(), materiais.getQuantidade(), materiais.getPreço());
            mattab.add(t);
            //TESTE
            //System.out.println(materiais.getId() + " " + materiais.getNome());
        }
        tc_id.setCellValueFactory(new PropertyValueFactory<MaterialTable, Integer>("Id"));
        tc_produto.setCellValueFactory(new PropertyValueFactory<MaterialTable, String>("Nome"));
        tc_quantidade.setCellValueFactory(new PropertyValueFactory<MaterialTable, Integer>("Quantidade"));
        tc_preco.setCellValueFactory(new PropertyValueFactory<MaterialTable, Float>("Preço"));
        tb_precas.setItems(mattab);
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        listarmateriais();
    }

    @FXML
    private void ActionCadastrar(ActionEvent event) 
    {
        Materiais m = new Materiais();
        MaterialDAO dao = new MaterialDAO();
        String nome = txt_nome.getText();
        int qtd = Integer.parseInt(txt_qtd.getText());
        float preço = Float.parseFloat(txt_preco.getText());
        m.setNome(nome);
        m.setQuantidade(qtd);
        m.setPreço(preço);
        dao.Create(m);
        txt_nome.setText("");
        txt_preco.setText("");
        txt_qtd.setText("");
        listarmateriais();
    }
   


    @FXML
    private void ActionAlterar(ActionEvent event) {
        Materiais m = new Materiais();
        MaterialDAO dao = new MaterialDAO();
        
        m.setId(tb_precas.getSelectionModel().getSelectedItem().getId());
        m.setNome(txt_nome.getText());
        m.setQuantidade(Integer.parseInt(txt_qtd.getText()));
        m.setPreço(Float.parseFloat(txt_preco.getText()));
        dao.Update(m);
        txt_nome.setText("");
        txt_preco.setText("");
        txt_qtd.setText("");
        listarmateriais();
    }

    @FXML
    private void ActionDeletar(ActionEvent event) {

    }

    @FXML
    private void ActionAtualizar(ActionEvent event) {
       
    }

    @FXML
    private void ActionSair(ActionEvent event) throws IOException {
        Parent cliente = FXMLLoader.load(getClass().getResource("/FXMLs/PrincipalFXML.fxml"));
        Scene scene = new Scene(cliente);
        Stage tela = (Stage) ((Node) event.getSource()).getScene().getWindow();
        tela.setScene(scene);
        tela.show();
        
    }

    @FXML
    private void Transferir(MouseEvent event) {
        if(event.getClickCount() == 1)
        {
            MaterialTable view = tb_precas.getSelectionModel().getSelectedItem();
            String nome = view.getNome();
            int quantidade = view.getQuantidade();
            float preço = view.getPreço();
            txt_nome.setText(nome);
            txt_qtd.setText(Integer.toString(quantidade));
            txt_preco.setText(Float.toString(preço));
        }
    }

}
