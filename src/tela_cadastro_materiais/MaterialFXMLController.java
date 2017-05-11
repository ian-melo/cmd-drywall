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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private List<Materiais> listmatt = dao.Listmateriais();
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

        if (!mattab.isEmpty()) 
        {
            mattab.clear();
        }
        for (Materiais materiais : listmatt) 
        {
            MaterialTable t = new MaterialTable(materiais.getId(), materiais.getNome(), materiais.getQuantidade(), materiais.getPreço());
            mattab.add(t);
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
        

    }

    @FXML
    private void ActionDeletar(ActionEvent event) {

    }

    @FXML
    private void ActionAtualizar(ActionEvent event) {
        listarmateriais();
    }

    @FXML
    private void ActionSair(ActionEvent event) throws IOException {
        
        
    }

}
