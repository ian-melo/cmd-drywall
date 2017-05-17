/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcao;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author voce
 */
public class ConstrucaoFXMLController implements Initializable {
    @FXML
    private Button btn_salvar;
    @FXML
    private Button btn_excluir;
    @FXML
    private Button btn_voltar;
    @FXML
    private Button btn_limpar;
    @FXML
    private Button btn_procurar;
    @FXML
    private TextField txt_id;
    @FXML
    private CheckBox chk_ru;
    @FXML
    private CheckBox chk_st;
    @FXML
    private CheckBox chk_rf;
    @FXML
    private TextField txt_descricao;
    @FXML
    private TextArea txt_detalhes;
    @FXML
    private TextField txt_quantidade;
    @FXML
    private RadioButton op_parede;
    @FXML
    private RadioButton op_forro;
    @FXML
    private TextField txt_montante;
    @FXML
    private TextField txt_alturaLim;
    
    /**
     * Insere ou atualiza um registro de construção
     * @param event Evento de ocorrência
     * @throws IOException Exceção de ocorrência
     */
    @FXML
    private void ActionSalvar(ActionEvent event) throws IOException {
        // TODO
    }
    
    /**
     * Exclui um registro de construção
     * @param event Evento de ocorrência
     * @throws IOException Exceção de ocorrência
     */
    @FXML
    private void ActionExcluir(ActionEvent event) throws IOException {
        // TODO
    }
    
    /**
     * Procura por registro de construção à partir de ID informado
     * @param event
     * @throws IOException 
     */
    @FXML
    private void ActionProcurar(ActionEvent event) throws IOException {
        // TODO
    }
    
    /**
     * Limpa os campos do registro de construção
     * @param event Evento de ocorrência
     * @throws IOException Exceção de ocorrência
     */
    @FXML
    private void ActionLimpar(ActionEvent event) throws IOException {
        // TODO
    }
    
    /**
     * Volta para a tela anterior principal
     * @param event Evento de ocorrência
     * @throws IOException Exceção de ocorrência
     */
    @FXML
    private void ActionVoltar(ActionEvent event) throws IOException {
        // TODO
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
