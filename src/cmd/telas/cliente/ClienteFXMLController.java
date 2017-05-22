package cmd.telas.cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.ClienteDAO;
import Entidade.ClienteTableView;
import Entidade.Entidadecliente;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
import javafx.scene.control.Label;
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
public class ClienteFXMLController implements Initializable {

    @FXML
    private TextField txt_nome;
    @FXML
    private TextField txt_endereco;
    @FXML
    private TextField txt_cpf;
    @FXML
    private TextField txt_projeto;
    @FXML
    private Label lbl_protocolo;
    @FXML
    private TextField txt_fone;
    @FXML
    private TextField txt_mail;
    @FXML
    private Button bt_cadastrar;
    @FXML
    private Button bt_alterar;
    @FXML
    private Button bt_sair;
    @FXML
    private TableView<ClienteTableView> tb_clientes;
    @FXML
    private TableColumn<ClienteTableView, Integer> tc_id;
    @FXML
    private TableColumn<ClienteTableView, String> tc_nome;
    @FXML
    private TableColumn<ClienteTableView, String> tc_cpf;
    @FXML
    private TableColumn<ClienteTableView, String> tc_endereco;
    @FXML
    private TableColumn<ClienteTableView, String> tc_projeto;
    @FXML
    private TableColumn<ClienteTableView, Integer> tc_protocolo;
    @FXML
    private TableColumn<ClienteTableView, String> tc_telefone;
    @FXML
    private TableColumn<ClienteTableView, String> tc_email;
    
    private ClienteDAO dao = new ClienteDAO();
    private List<Entidadecliente> Listacli;
    private ObservableList<ClienteTableView> tableview = FXCollections.observableArrayList();
    
    public void ListandoTableview()
    {
        Listacli = dao.ListaClientes();
        tableview.clear();
        
        for(Entidadecliente cli : Listacli)
        {
            ClienteTableView t = new ClienteTableView(cli.getId(), cli.getNome(), cli.getCpf(), cli.getEndereço(), cli.getProjeto(), cli.getProtocolo(), cli.getTelefone(), cli.getEmail());
            tableview.add(t);
        }
        tc_id.setCellValueFactory(new PropertyValueFactory<ClienteTableView,Integer>("Id"));
        tc_nome.setCellValueFactory(new PropertyValueFactory<ClienteTableView,String>("Nome"));
        tc_cpf.setCellValueFactory(new PropertyValueFactory<ClienteTableView,String>("Cpf"));
        tc_endereco.setCellValueFactory(new PropertyValueFactory<ClienteTableView,String>("Endereço"));
        tc_projeto.setCellValueFactory(new PropertyValueFactory<ClienteTableView,String>("Projeto"));
        tc_protocolo.setCellValueFactory(new PropertyValueFactory<ClienteTableView,Integer>("Protocolo"));
        tc_telefone.setCellValueFactory(new PropertyValueFactory<ClienteTableView,String>("Telefone"));
        tc_email.setCellValueFactory(new PropertyValueFactory<ClienteTableView,String>("Email"));
        tb_clientes.setItems(tableview);
    }
    public void protocolo()
    {
        Random gerador = new Random();
        int numero = gerador.nextInt(1000);
        lbl_protocolo.setText(Integer.toString(numero));
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ListandoTableview();
        protocolo();
    }    

    @FXML
    private void Cadastrar(ActionEvent event) {
        if(txt_nome.getText().isEmpty() || txt_cpf.getText().isEmpty() || txt_endereco.getText().isEmpty() || txt_projeto.getText().isEmpty() || txt_fone.getText().isEmpty() || txt_mail.getText().isEmpty())
        {
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("C.M.D");
            alerta1.setHeaderText("C.M.D Informa!!!");
            alerta1.setContentText("preencha todos os campos para continuar");
            alerta1.showAndWait();
        }
        else
        {
            Entidadecliente cli = new Entidadecliente();
            ClienteDAO dao = new ClienteDAO();
            String nome = txt_nome.getText();
            String endereço = txt_endereco.getText();
            String cpf = txt_cpf.getText();
            String projeto = txt_projeto.getText();
            int numero_protocolo = Integer.parseInt(lbl_protocolo.getText());
            String telefone = txt_fone.getText();
            String email = txt_mail.getText();
            cli.setNome(nome);
            cli.setCpf(cpf);
            cli.setEndereço(endereço);
            cli.setProjeto(projeto);
            cli.setProtocolo(numero_protocolo);
            cli.setTelefone(telefone);
            cli.setEmail(email);
            
            //dao.Create(cli);
            
            txt_nome.setText("");
            txt_endereco.setText("");
            txt_cpf.setText("");
            txt_projeto.setText("");
            lbl_protocolo.setText("");
            txt_fone.setText("");
            txt_mail.setText("");
            ListandoTableview();
            
        }
        
    }

    @FXML
    private void Alterar(ActionEvent event) {
        if(txt_nome.getText().isEmpty() || txt_cpf.getText().isEmpty() || txt_endereco.getText().isEmpty() || txt_projeto.getText().isEmpty() || txt_fone.getText().isEmpty() || txt_mail.getText().isEmpty())
        {
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("C.M.D");
            alerta1.setHeaderText("C.M.D Informa!!!");
            alerta1.setContentText("preencha todos os campos para continuar");
            alerta1.showAndWait();
            
        }
        else
        {
            Entidadecliente cli = new Entidadecliente();
            ClienteDAO dao = new ClienteDAO();
            cli.setId(tb_clientes.getSelectionModel().getSelectedItem().getId());
            cli.setNome(txt_nome.getText());
            cli.setCpf(txt_cpf.getText());
            cli.setEndereço(txt_endereco.getText());
            cli.setProjeto(txt_projeto.getText());
            cli.setProtocolo(Integer.parseInt(lbl_protocolo.getText()));
            cli.setTelefone(txt_fone.getText());
            cli.setEmail(txt_mail.getText());
            dao.Update(cli);
            txt_nome.setText("");
            txt_endereco.setText("");
            txt_cpf.setText("");
            txt_projeto.setText("");
            lbl_protocolo.setText("");
            txt_fone.setText("");
            txt_mail.setText("");
            ListandoTableview();
            
        }
        
    }

    @FXML
    private void Sair(ActionEvent event) throws IOException {
        Parent cliente = FXMLLoader.load(getClass().getResource("/cmd/fxml/PrincipalFXML.fxml"));
        Scene scene = new Scene(cliente);
        Stage tela = (Stage) ((Node) event.getSource()).getScene().getWindow();
        tela.setScene(scene);
        tela.show();
    }

    @FXML
    private void Listar(MouseEvent event) {
        if(event.getClickCount() == 1)
        {
            ClienteTableView view = tb_clientes.getSelectionModel().getSelectedItem();
            String nome = view.getNome();
            String endereço = view.getEndereço();
            String cpf = view.getCpf();
            String projeto = view.getProjeto();
            int protocolo = view.getProtocolo();
            String telefone = view.getTelefone();
            String email = view.getEmail();
            txt_nome.setText(nome);
            txt_endereco.setText(endereço);
            txt_cpf.setText(cpf);
            txt_projeto.setText(projeto);
            lbl_protocolo.setText(Integer.toString(protocolo));
            txt_fone.setText(telefone);
            txt_mail.setText(email);
        }
    }
    
}
