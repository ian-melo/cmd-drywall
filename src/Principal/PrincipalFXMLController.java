/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author fe_mm
 */
public class PrincipalFXMLController implements Initializable {

    @FXML
    private Button bt_materiais;
    @FXML
    private Button bt_gesso;
    @FXML
    private Button bt_parede;
    @FXML
    private Button bt_cleintes;
    @FXML
    private Button bt_orçamento;
    @FXML
    private Button bt_sair;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //
    }    

    @FXML
    private void ActionSair(ActionEvent event) throws IOException {
       Parent funcionario_parent = FXMLLoader.load(getClass().getResource("/FXMLs/LoginFXML.fxml"));
       Scene funcionario_scene = new Scene(funcionario_parent);
       Stage app_tela = (Stage) ((Node) event.getSource()).getScene().getWindow();
       app_tela.setScene(funcionario_scene);
       app_tela.show();
    }

    @FXML
    private void ActionMateriais(ActionEvent event) throws IOException {
       Parent funcionario_parent = FXMLLoader.load(getClass().getResource("/FXMLs/MateriaisFXML.fxml"));
       Scene funcionario_scene = new Scene(funcionario_parent);
       Stage app_tela = (Stage) ((Node) event.getSource()).getScene().getWindow();
       app_tela.setScene(funcionario_scene);
       app_tela.show();
    }
    
}
