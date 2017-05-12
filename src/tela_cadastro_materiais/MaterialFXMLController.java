/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela_cadastro_materiais;

import DAO.MaterialDAO;
import Entidade.ClienteTableView;
import Entidade.Entidadecliente;
import Entidade.Material;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author fe_mm
 */
public class MaterialFXMLController implements Initializable {

    @FXML
    private TextField txt_nome;
    @FXML
    private TextField txt_quantidade;
    @FXML
    private TextField txt_preco;
    @FXML
    private TextField txt_tipo;
    @FXML
    private TextField txt_unidade;
    @FXML
    private Button bt_cadastrar;
    @FXML
    private Button bt_alterar;
    @FXML
    private Button bt_sair;
    @FXML
    private TableColumn<MaterialTableView, Integer> tc_id;
    @FXML
    private TableColumn<MaterialTableView, String> tc_nome;
    @FXML
    private TableColumn<MaterialTableView, Integer> tc_quantidade;
    @FXML
    private TableColumn<MaterialTableView, String> tc_tipo;
    @FXML
    private TableColumn<MaterialTableView, String> tc_unidade;
    @FXML
    private TableColumn<MaterialTableView, Float> tc_preco;
    private MaterialDAO dao = new MaterialDAO();
    private List<Material> Listamaterial;
    private ObservableList<MaterialTableView> tableview = FXCollections.observableArrayList();
    @FXML
    private TableView<MaterialTableView> tb_materiais;
    /**
     * Initializes the controller class.
     */
    public void ListandoTableView()
    {
        Listamaterial = dao.ListaMaterial();
        tableview.clear();
        
        for(Material M : Listamaterial)
        {
            MaterialTableView view = new MaterialTableView(M.getId(), M.getNome(), M.getQuantidade(), M.getPreço(), M.getTipo(), M.getUnidade());
            tableview.add(view);
        }
        tc_id.setCellValueFactory(new PropertyValueFactory<MaterialTableView,Integer>("Id"));
        tc_nome.setCellValueFactory(new PropertyValueFactory<MaterialTableView,String>("Nome"));
        tc_quantidade.setCellValueFactory(new PropertyValueFactory<MaterialTableView,Integer>("Quantidade"));
        tc_preco.setCellValueFactory(new PropertyValueFactory<MaterialTableView,Float>("Preço"));
        tc_tipo.setCellValueFactory(new PropertyValueFactory<MaterialTableView,String>("Tipo"));
        tc_unidade.setCellValueFactory(new PropertyValueFactory<MaterialTableView,String>("Unidade"));
        tb_materiais.setItems(tableview);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ListandoTableView();
    }    

    @FXML
    private void Cadastrar(ActionEvent event) {
        MaterialDAO dao = new MaterialDAO();
        Material M = new Material();
        if(txt_nome.getText().isEmpty() || txt_quantidade.getText().isEmpty() ||
                txt_preco.getText().isEmpty() || txt_tipo.getText().isEmpty() || txt_unidade.getText().isEmpty())
        {
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("C.M.D");
            alerta1.setHeaderText("C.M.D Informa!!!");
            alerta1.setContentText("preencha todos os campos para continuar");
            alerta1.showAndWait();
        }
        else
        {
          String nome = txt_nome.getText();
          int quantidade = Integer.parseInt(txt_quantidade.getText()); 
          float preço = Float.parseFloat(txt_preco.getText());
          String tipo = txt_tipo.getText();
          String unidade = txt_unidade.getText();
          M.setNome(nome);
          M.setQuantidade(quantidade);
          M.setPreço(preço);
          M.setTipo(tipo);
          M.setUnidade(unidade);
          dao.Create(M);
          txt_nome.setText("");
          txt_preco.setText("");
          txt_quantidade.setText("");
          txt_unidade.setText("");
          txt_tipo.setText("");
          ListandoTableView();
        }
        
    }

    @FXML
    private void Alterar(ActionEvent event) {
        if(txt_nome.getText().isEmpty() || txt_quantidade.getText().isEmpty() ||
                txt_preco.getText().isEmpty() || txt_tipo.getText().isEmpty() || txt_unidade.getText().isEmpty())
        {
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("C.M.D");
            alerta1.setHeaderText("C.M.D Informa!!!");
            alerta1.setContentText("preencha todos os campos para continuar");
            alerta1.showAndWait();
        }
        else
        {
            MaterialDAO dao = new MaterialDAO();
            Material M = new Material();
            
            M.setId(tb_materiais.getSelectionModel().getSelectedItem().getId());
            M.setNome(txt_nome.getText());
            M.setQuantidade(Integer.parseInt(txt_quantidade.getText()));
            M.setPreço(Float.parseFloat(txt_preco.getText()));
            M.setTipo(txt_tipo.getText());
            M.setUnidade(txt_unidade.getText());
            dao.Update(M);
            txt_nome.setText("");
            txt_preco.setText("");
            txt_quantidade.setText("");
            txt_unidade.setText("");
            txt_tipo.setText("");
            ListandoTableView();
            
        }
    }

    @FXML
    private void Sair(ActionEvent event) throws IOException {
        Parent cliente = FXMLLoader.load(getClass().getResource("/FXMLs/PrincipalFXML.fxml"));
        Scene scene = new Scene(cliente);
        Stage tela = (Stage) ((Node) event.getSource()).getScene().getWindow();
        tela.setScene(scene);
        tela.show();
    }

    @FXML
    private void Carregar(MouseEvent event) {
        if(event.getClickCount() == 1)
        {
            MaterialTableView view = tb_materiais.getSelectionModel().getSelectedItem();
            String nome = view.getNome();
            int quantidade = view.getQuantidade();
            float preço = view.getPreço();
            String tipo = view.getTipo();
            String unidade = view.getUnidade();
            txt_nome.setText(nome);
            txt_quantidade.setText(Integer.toString(quantidade));
            txt_preco.setText(Float.toString(preço));
            txt_tipo.setText(tipo);
            txt_unidade.setText(unidade);
            
        }
    }
    
}
