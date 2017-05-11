/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela_calculo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author fe_mm
 */
public class CalculoFXMLController implements Initializable {

    @FXML
    private TextField txt_altura;
    @FXML
    private ComboBox<?> cb_gesso;
    @FXML
    private RadioButton rb_umido;
    @FXML
    private RadioButton rb_seco;
    @FXML
    private RadioButton rb_fogo;
    @FXML
    private TableView<?> tb_tipologias;
    @FXML
    private TableView<?> tb_qtd_materiais;
    @FXML
    private TableView<?> tb_preco_unitario_pecas;
    @FXML
    private RadioButton rb_com;
    @FXML
    private RadioButton rb_sem;
    @FXML
    private TextField txt_valor_mao_obra;
    @FXML
    private TextField txt_valor_toal_materias;
    @FXML
    private TextField txt_valor_toal_pecas;
    @FXML
    private TextField txt_valor_final_orcamento;
    @FXML
    private Button bt_calcular;
    @FXML
    private Button bt_alterar;
    @FXML
    private Button bt_deletar;
    @FXML
    private Button bt_sair;
    @FXML
    private TextField txt_forro;
    @FXML
    private ComboBox<?> cb_parede;
    @FXML
    private TextField txt_parede;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO as tabelas devem ser iniciadas aqui...
    }    
    
}
