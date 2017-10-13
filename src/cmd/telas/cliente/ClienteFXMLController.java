package cmd.telas.cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cmd.DAO.ClienteDAO;
import Entidade.ClienteTableView;
import Entidade.Entidadecliente;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author fe_mm
 */
public class ClienteFXMLController implements Initializable {

    private ClienteDAO dao = new ClienteDAO();
    private List<Entidadecliente> Listacli;
    private ObservableList<ClienteTableView> tableview = FXCollections.observableArrayList();
    @FXML
    private ComboBox<String> cmb_pessoa;
    @FXML
    private Label lb_dataInscricao;
    @FXML
    private Button bt_cadastrar;
    @FXML
    private Button bt_alterar;
    @FXML
    private Button bt_sair;
    @FXML
    private TableView<ClienteTableView> tb_fisica;
    @FXML
    private TableColumn<ClienteTableView, Integer> tc_id;
    @FXML
    private TableColumn<ClienteTableView, String> tc_nome;
    @FXML
    private TableColumn<ClienteTableView, String> tc_cpf;
    @FXML
    private TableColumn<ClienteTableView, String> tc_dataNasc;
    @FXML
    private TableColumn<ClienteTableView, String> tc_endereco;
    @FXML
    private TableColumn<ClienteTableView, String> tc_cep;
    @FXML
    private VBox vBox_fisica;
    @FXML
    private TextField txt_nome;
    @FXML
    private TextField txt_cpf;
    @FXML
    private TextField txt_dataNascimento;
    @FXML
    private VBox vBox_endereco;
    @FXML
    private TextField txt_cep;
    @FXML
    private TextField txt_logradouro;
    @FXML
    private TextField txt_numero;
    @FXML
    private TextField txt_bairro;
    @FXML
    private TextField txt_cidade;
    @FXML
    private TextField txt_uf;
    @FXML
    private VBox vBox_juridica;
    @FXML
    private TextField txt_razaoSocial;
    @FXML
    private TextField txt_cnpj;
    @FXML
    private TextField txt_ramo;
    @FXML
    private TextField txt_dataFundacao;
    @FXML
    private VBox vBox_telefone;
    @FXML
    private TableView<ClienteTableView> tb_juridica;
    @FXML
    private TableColumn<ClienteTableView, Integer> tc_id_juridica;
    @FXML
    private TableColumn<ClienteTableView, String> tc_razaoSocial;
    @FXML
    private TableColumn<ClienteTableView, String> tc_cnpj;
    @FXML
    private TableColumn<ClienteTableView, String> tc_dataFunda;
    @FXML
    private TableColumn<ClienteTableView, String> tc_endereco_Juridica;
    @FXML
    private TableColumn<ClienteTableView, String> tc_cep_Juridica;

    /*public void ListandoTableview() {
     Listacli = dao.ListaClientes();
     tableview.clear();

     for (Entidadecliente cli : Listacli) {
     ClienteTableView t = new ClienteTableView(cli.getId(), cli.getNome(), cli.getCpf(), cli.getEndereço(), cli.getProjeto(), cli.getProtocolo(), cli.getTelefone(), cli.getEmail());
     tableview.add(t);
     }
     tc_id.setCellValueFactory(new PropertyValueFactory<ClienteTableView, Integer>("Id"));
     tc_nome.setCellValueFactory(new PropertyValueFactory<ClienteTableView, String>("Nome"));
     tc_cpf.setCellValueFactory(new PropertyValueFactory<ClienteTableView, String>("Cpf"));
     tc_endereco.setCellValueFactory(new PropertyValueFactory<ClienteTableView, String>("Endereço"));

     tc_telefone.setCellValueFactory(new PropertyValueFactory<ClienteTableView, String>("Telefone"));

     tb_clientes.setItems(tableview);
     }
     */
//    public void protocolo()
//    {
//        Random gerador = new Random();
//        int numero = gerador.nextInt(1000);
//        lbl_protocolo.setText(Integer.toString(numero));
//    }
//    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicia_ComboBox();
        //ListandoTableview();
    }

    private void inicia_ComboBox() {
        ObservableList<String> opcao = FXCollections.observableArrayList(
                "Pessoa Físíca",
                "Pessoa Jurídica"
        );

        cmb_pessoa.setItems(opcao);
    }

    @FXML
    private void Cadastrar(ActionEvent event) {
        //if (txt_nome.getText().isEmpty() || txt_cpf.getText().isEmpty()) {
        Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
        alerta1.setTitle("C.M.D");
        alerta1.setHeaderText("C.M.D Informa!!!");
        //alerta1.setContentText("preencha todos os campos para continuar");
        alerta1.setContentText("Dados cadastrados com sucesso");
        alerta1.showAndWait();
        //} else {
/*
         Entidadecliente cli = new Entidadecliente();
         ClienteDAO dao = new ClienteDAO();
         String nome = txt_nome.getText();
         //String endereço = txt_endereco.getText();
         String cpf = txt_cpf.getText();
         //String projeto = txt_projeto.getText();
         //int numero_protocolo = Integer.parseInt(lbl_protocolo.getText());
         //String telefone = txt_fone.getText();
         //String email = txt_mail.getText();
         cli.setNome(nome);
         cli.setCpf(cpf);
         //cli.setEndereço(endereço);
         //cli.setProjeto(projeto);
         //cli.setProtocolo(numero_protocolo);
         //cli.setTelefone(telefone);
         //cli.setEmail(email);

         //dao.Create(cli);
         txt_nome.setText("");

         txt_cpf.setText("");
            
            
         //ListandoTableview();//+++++++++++++
         */
        //}

    }

    @FXML
    private void Alterar(ActionEvent event) {
        if (txt_nome.getText().isEmpty() || txt_cpf.getText().isEmpty()) {
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("C.M.D");
            alerta1.setHeaderText("C.M.D Informa!!!");
            alerta1.setContentText("preencha todos os campos para continuar");
            alerta1.showAndWait();

        } else {
            /*
             Entidadecliente cli = new Entidadecliente();
             ClienteDAO dao = new ClienteDAO();
             cli.setId(tb_clientes.getSelectionModel().getSelectedItem().getId());
             cli.setNome(txt_nome.getText());
             cli.setCpf(txt_cpf.getText());
             //cli.setEndereço(txt_endereco.getText());
             //cli.setProjeto(txt_projeto.getText());
             //cli.setProtocolo(Integer.parseInt(lbl_protocolo.getText()));
             //cli.setTelefone(txt_fone.getText());
             //cli.setEmail(txt_mail.getText());
             dao.Update(cli);
             txt_nome.setText("");
             //txt_endereco.setText("");
             txt_cpf.setText("");
             //txt_projeto.setText("");
             //lbl_protocolo.setText("");
             //txt_fone.setText("");
             //txt_mail.setText("");
            
            
             //ListandoTableview();//++++++++++++++++++++++++
             */
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
        if (event.getClickCount() == 1) {
            //ClienteTableView view = tb_clientes.getSelectionModel().getSelectedItem();
            ClienteTableView view = tb_fisica.getSelectionModel().getSelectedItem();
            String nome = view.getNome();
            String endereço = view.getEndereço();
            String cpf = view.getCpf();
            String projeto = view.getProjeto();
            int protocolo = view.getProtocolo();
            String telefone = view.getTelefone();
            String email = view.getEmail();
            txt_nome.setText(nome);
            //txt_endereco.setText(endereço);
            txt_cpf.setText(cpf);
            //txt_projeto.setText(projeto);
            //lbl_protocolo.setText(Integer.toString(protocolo));
            //txt_fone.setText(telefone);
            //txt_mail.setText(email);
        }
    }

    @FXML
    private void cbm_click(ActionEvent event) {
        if (cmb_pessoa.getSelectionModel().getSelectedIndex() == 0) {
            vBox_fisica.setVisible(true);
            vBox_juridica.setVisible(false);

            tb_fisica.setVisible(true);
            tb_juridica.setVisible(false);

        } else if (cmb_pessoa.getSelectionModel().getSelectedIndex() == 1) {
            vBox_fisica.setVisible(false);
            vBox_juridica.setVisible(true);

            tb_fisica.setVisible(false);
            tb_juridica.setVisible(true);
        }

    }

}
