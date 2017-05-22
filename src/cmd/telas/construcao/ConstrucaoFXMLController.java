/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.telas.construcao;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

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
    private TextField txt_montante;
    @FXML
    private TextField txt_alturaLim;
    @FXML
    private TextField txt_descricao;
    @FXML
    private TextArea txt_detalhes;
    @FXML
    private TextField txt_quantidade;
    @FXML
    private CheckBox chk_ru;
    @FXML
    private CheckBox chk_st;
    @FXML
    private CheckBox chk_rf;
    @FXML
    private ToggleGroup grp_construcao;
    @FXML
    private RadioButton op_parede;
    @FXML
    private RadioButton op_forro;
    
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
        txt_alturaLim.setText("");
        txt_descricao.setText("");
        txt_detalhes.setText("");
        txt_id.setText("");
        txt_montante.setText("");
        txt_quantidade.setText("");
        chk_rf.setSelected(false);
        chk_ru.setSelected(false);
        chk_st.setSelected(false);
        ((RadioButton) grp_construcao.getSelectedToggle()).setSelected(false);
        txt_alturaLim.setEditable(false);
        txt_montante.setEditable(false);
    }
    
    /**
     * Volta para a tela anterior principal
     * @param event Evento de ocorrência
     * @throws IOException Exceção de ocorrência
     */
    @FXML
    private void ActionVoltar(ActionEvent event) throws IOException {
       Parent pai = FXMLLoader.load(getClass().getResource("/cmd/fxml/PrincipalFXML.fxml"));
       Scene cena = new Scene(pai);
       Stage tela = (Stage) ((Node) event.getSource()).getScene().getWindow();
       tela.setScene(cena);
       tela.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Eventos
        grp_construcao.selectedToggleProperty().addListener(new ActionHabilitarParede());
    }    
    
    /**
     * Classe privada para evento de habilitação da opção parede
     */
    private class ActionHabilitarParede implements ChangeListener<Toggle> {

        @Override
        public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
            if (grp_construcao.getSelectedToggle() != null) {
                if(grp_construcao.getSelectedToggle().equals(op_parede)) {
                    txt_montante.setEditable(true);
                    txt_alturaLim.setEditable(true);
                } else {
                    txt_montante.setEditable(false);
                    txt_alturaLim.setEditable(false);
                }
            }
        }
    }
    
}
