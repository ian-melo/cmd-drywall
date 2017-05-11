/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastros;

import DAO.UsuárioDAO;
import Usuario.Usuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author fe_mm
 */
public class FuncionarioFXMLController implements Initializable {

    @FXML
    private TextField txt_nome_func;
    @FXML
    private TextField txt_senha_func;
    @FXML
    private Button bt_cadastro_func;
    @FXML
    private Button bt_sair_func;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Cadastrar_Funcionario(ActionEvent event) {
        Usuario u = new Usuario();
        UsuárioDAO dao = new UsuárioDAO();
        String nome = txt_nome_func.getText();
        String senha = txt_senha_func.getText();
        u.setNome(nome);
        u.setSenha(senha);
        dao.create(u);
        txt_nome_func.setText("");
        txt_senha_func.setText("");
        
    }

    @FXML
    private void Sair_Funcionario(ActionEvent event) throws IOException {
       Parent funcionario_parent = FXMLLoader.load(getClass().getResource("/FXMLs/FuncionarioFXML.fxml"));
       Scene funcionario_scene = new Scene(funcionario_parent);
       Stage app_tela = (Stage) ((Node) event.getSource()).getScene().getWindow();
       app_tela.setScene(funcionario_scene);
       app_tela.close();
       
    }
    
}
