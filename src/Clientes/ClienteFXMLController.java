/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import DAO.ClienteDAO;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputMethodEvent;

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
    private TextField txt_fone;
    @FXML
    private TextField txt_cpf_cnpj;
    @FXML
    private TextField txt_projeto;
    @FXML
    private Label lbl_random;
    @FXML
    private Button bt_cadastrar;
    @FXML
    private Button bt_alterar;
    @FXML
    private Button bt_sair;
    @FXML
    private TextField txt_email;
    @FXML
    private TableView<ClienteTable> tb_clientes;
    @FXML
    private TableColumn<ClienteTable, Integer> tc_id;
    @FXML
    private TableColumn<ClienteTable, String> tc_nome;
    @FXML
    private TableColumn<ClienteTable, String> tc_endereco;
    @FXML
    private TableColumn<ClienteTable, String> tc_cpf;
    @FXML
    private TableColumn<ClienteTable, String> tc_projeto;
    @FXML
    private TableColumn<ClienteTable, String> tc_fone;
    @FXML
    private TableColumn<ClienteTable, String> tc_email;
    @FXML
    private TableColumn<ClienteTable, Integer> tc_protocolo;
    
    private ClienteDAO dao = new ClienteDAO();
    private List<Clientes> lista_de_clientes = dao.ListClientes();
    private ObservableList<ClienteTable> cliente_table = FXCollections.observableArrayList();
    
    public void ListarMateriais()
    {
        if(!cliente_table.isEmpty())
        {
            cliente_table.clear();
        }
        for(Clientes clientes : lista_de_clientes)
        {
            ClienteTable table = new ClienteTable(clientes.getId(),clientes.getNome(),clientes.getEndereço(),clientes.getCpf_cnpj(),clientes.getNome_projeto(),clientes.getProtocolo(),clientes.getTelefone(),clientes.getEmail());
            cliente_table.add(table);
        }
        tc_id.setCellValueFactory(new PropertyValueFactory<ClienteTable, Integer>("Id"));
        tc_nome.setCellValueFactory(new PropertyValueFactory<ClienteTable, String>("Nome"));
        tc_endereco.setCellValueFactory(new PropertyValueFactory<ClienteTable, String>("Endereço"));
        tc_cpf.setCellValueFactory(new PropertyValueFactory<ClienteTable, String>("CPF/CNPJ"));
        tc_projeto.setCellValueFactory(new PropertyValueFactory<ClienteTable, String>("Projeto"));
        tc_protocolo.setCellValueFactory(new PropertyValueFactory<ClienteTable, Integer>("Protocolo"));
        tc_fone.setCellValueFactory(new PropertyValueFactory<ClienteTable, String>("Telefone"));
        tc_email.setCellValueFactory(new PropertyValueFactory<ClienteTable, String>("Email"));
        tb_clientes.setItems(cliente_table);
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ListarMateriais();
    }    


    @FXML
    private void ActionCadastrar(ActionEvent event) {
        Clientes cli = new Clientes();
        ClienteDAO dao = new ClienteDAO();
        String nome = txt_nome.getText();
        String endereço = txt_endereco.getText();
        String cpf_cnpj = txt_cpf_cnpj.getText();
        String nome_projeto = txt_projeto.getText();
        int numero_protocolo = Integer.parseInt(lbl_random.getText());
        String telefone = txt_fone.getText();
        String email = txt_email.getText();
        String projeto = txt_projeto.getText();
        cli.setNome(nome);
        cli.setEndereço(endereço);
        cli.setCpf_cnpj(cpf_cnpj);
        cli.setNome_projeto(nome_projeto);
        cli.setNumero_protocolo(numero_protocolo);
        cli.setTelefone(telefone);
        cli.setEmail(email);
        dao.Create(cli);
        txt_nome.setText("");
        txt_endereco.setText("");
        txt_email.setText("");
        txt_cpf_cnpj.setText("");
        txt_fone.setText("");
        txt_projeto.setText("");
        lbl_random.setText("");
    }
    
    public void random()
    {
        Random gerador = new Random();
        int numero = gerador.nextInt(100);
        lbl_random.setText(Integer.toString(numero));
    }
    
    

    @FXML
    private void ActionAlterar(ActionEvent event) {
    }

    @FXML
    private void ActionSair(ActionEvent event) {
    }

    @FXML
    private void ActionProtocolo(InputMethodEvent event) {
        random();
    }
    
}
