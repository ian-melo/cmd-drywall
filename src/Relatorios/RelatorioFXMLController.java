/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relatorios;

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
public class RelatorioFXMLController implements Initializable {

    @FXML
    private Button bt_rel1;
    @FXML
    private Button bt_rel2;
    @FXML
    private Button bt_rel3;
    @FXML
    private Button bt_rel4;
    @FXML
    private Button bt_rel5;
    @FXML
    private Button bt_sair;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Relatorio1(ActionEvent event) {
    }

    @FXML
    private void Relatorio2(ActionEvent event) {
    }

    @FXML
    private void Relatorio3(ActionEvent event) {
    }

    @FXML
    private void Relatorio4(ActionEvent event) {
    }

    @FXML
    private void Relatorio5(ActionEvent event) {
    }

    @FXML
    private void Sair(ActionEvent event) throws IOException {
       Parent funcionario_parent = FXMLLoader.load(getClass().getResource("/FXMLs/PrincipalFXML.fxml"));
       Scene funcionario_scene = new Scene(funcionario_parent);
       Stage app_tela = (Stage) ((Node) event.getSource()).getScene().getWindow();
       app_tela.setScene(funcionario_scene);
       app_tela.show();
    }
    
}
