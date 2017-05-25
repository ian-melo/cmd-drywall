//TODO: Testar
package cmd.telas.construcao;

import cmd.controle.ConstrucaoControle;
import cmd.entidade.Construcao;
import cmd.entidade.Forro;
import cmd.entidade.Parede;
import java.io.IOException;
import java.math.BigDecimal;
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
import javafx.scene.control.Alert;
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
    private Button btn_alterar;
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
    private TextField txt_qualidade;
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
    
    private ConstrucaoControle controle;
    
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
    
    /**
     * Insere um registro de construção
     * @param event Evento de ocorrência
     * @throws IOException Exceção de ocorrência
     */
    @FXML
    private void ActionSalvar(ActionEvent event) throws IOException {
        boolean res; //Resultado da ação
        String info; //Texto informativo
        //Retorna, caso os campos estejam inválidos
        if(!validarCampos())
            return;
        //Criação dos objetos
        Construcao co;
        Forro fo;
        Parede pa;
        //Construção
        co = new Construcao();
        co.setDescricao(txt_descricao.getText());
        co.setDetalhes(txt_detalhes.getText());
        co.setQualidade(Integer.parseInt(txt_qualidade.getText()));
        co.setXdead(Boolean.FALSE);
        co.setItems(null);
        co.setMaterials(null);
        //Caso forro
        if(((RadioButton) grp_construcao.getSelectedToggle()) == op_forro) {
            fo = new Forro();
            fo.setEhRf(chk_rf.isSelected());
            fo.setEhRu(chk_ru.isSelected());
            fo.setEhSt(chk_st.isSelected());
            fo.setXdead(Boolean.FALSE);
            fo.setConstrucao(co);
            co.setForro(fo);
            co.setParede(null);
            //Inserção de forro
            res = controle.inserirForro(fo);
        //Caso parede
        } else {
            pa = new Parede();
            pa.setMontante(BigDecimal.valueOf(Double.parseDouble(txt_montante.getText())));
            pa.setAlturaLimite(BigDecimal.valueOf(Double.parseDouble(txt_alturaLim.getText())));
            pa.setEhRf(chk_rf.isSelected());
            pa.setEhRu(chk_ru.isSelected());
            pa.setEhSt(chk_st.isSelected());
            pa.setXdead(Boolean.FALSE);
            pa.setConstrucao(co);
            co.setParede(pa);
            co.setForro(null);
            //Inserção de parede
            res = controle.inserirParede(pa);
        }
        //Resultado
        if(res) info = "Construção salva com sucesso"; else info = "Não foi possível salvar construção";
        exibirAlerta(info);
    }
    
    /**
     * Alterar um registro de construção
     * @param event Evento de ocorrência
     * @throws IOException Exceção de ocorrência
     */
    @FXML
    private void ActionAlterar(ActionEvent event) throws IOException {
        boolean res; //Resultado da ação
        String info; //Texto informativo
        //Retorna, caso os campos estejam inválidos
        if(!validarCampos() || !validarCodigo())
            return;
        //Criação dos objetos
        Construcao co;
        Forro fo;
        Parede pa;
        //Construção
        co = new Construcao();
        co.setCodConstrucao(Integer.parseInt(txt_id.getText()));
        co.setDescricao(txt_descricao.getText());
        co.setDetalhes(txt_detalhes.getText());
        co.setQualidade(Integer.parseInt(txt_qualidade.getText()));
        co.setXdead(Boolean.FALSE);
        co.setItems(null);
        co.setMaterials(null);
        //Caso forro
        if(((RadioButton) grp_construcao.getSelectedToggle()) == op_forro) {
            fo = new Forro();
            fo.setCodConstrucao(Integer.parseInt(txt_id.getText()));
            fo.setEhRf(chk_rf.isSelected());
            fo.setEhRu(chk_ru.isSelected());
            fo.setEhSt(chk_st.isSelected());
            fo.setXdead(Boolean.FALSE);
            fo.setConstrucao(co);
            co.setForro(fo);
            co.setParede(null);
            //Alteração de forro
            res = controle.alterarForro(fo);
        //Caso parede
        } else {
            pa = new Parede();
            pa.setCodConstrucao(Integer.parseInt(txt_id.getText()));
            pa.setMontante(BigDecimal.valueOf(Double.parseDouble(txt_montante.getText())));
            pa.setAlturaLimite(BigDecimal.valueOf(Double.parseDouble(txt_alturaLim.getText())));
            pa.setEhRf(chk_rf.isSelected());
            pa.setEhRu(chk_ru.isSelected());
            pa.setEhSt(chk_st.isSelected());
            pa.setXdead(Boolean.FALSE);
            pa.setConstrucao(co);
            co.setParede(pa);
            co.setForro(null);
            //Alteração de parede
            res = controle.alterarParede(pa);
        }
        //Resultado
        if(res) info = "Construção alterada com sucesso"; else info = "Não foi possível alterar construção";
        exibirAlerta(info);
    }
    
    /**
     * Exclui um registro de construção
     * @param event Evento de ocorrência
     * @throws IOException Exceção de ocorrência
     */
    @FXML
    private void ActionExcluir(ActionEvent event) throws IOException {
        boolean res; //Resultado da ação
        String info; //Texto informativo
        //Retorna, caso os campos estejam inválidos
        if(!validarCampos() || !validarCodigo())
            return;
        //Criação dos objetos
        Construcao co;
        Forro fo;
        Parede pa;
        //Construção
        co = new Construcao();
        co.setCodConstrucao(Integer.parseInt(txt_id.getText()));
        co.setDescricao(txt_descricao.getText());
        co.setDetalhes(txt_detalhes.getText());
        co.setQualidade(Integer.parseInt(txt_qualidade.getText()));
        co.setXdead(Boolean.FALSE);
        co.setItems(null);
        co.setMaterials(null);
        //Caso forro
        if(((RadioButton) grp_construcao.getSelectedToggle()) == op_forro) {
            fo = new Forro();
            fo.setCodConstrucao(Integer.parseInt(txt_id.getText()));
            fo.setEhRf(chk_rf.isSelected());
            fo.setEhRu(chk_ru.isSelected());
            fo.setEhSt(chk_st.isSelected());
            fo.setXdead(Boolean.FALSE);
            fo.setConstrucao(co);
            co.setForro(fo);
            co.setParede(null);
            //Exclusão de forro
            res = controle.excluirForro(fo);
        //Caso parede
        } else {
            pa = new Parede();
            pa.setCodConstrucao(Integer.parseInt(txt_id.getText()));
            pa.setMontante(BigDecimal.valueOf(Double.parseDouble(txt_montante.getText())));
            pa.setAlturaLimite(BigDecimal.valueOf(Double.parseDouble(txt_alturaLim.getText())));
            pa.setEhRf(chk_rf.isSelected());
            pa.setEhRu(chk_ru.isSelected());
            pa.setEhSt(chk_st.isSelected());
            pa.setXdead(Boolean.FALSE);
            pa.setConstrucao(co);
            co.setParede(pa);
            co.setForro(null);
            //Exclusão de parede
            res = controle.excluirParede(pa);
        }
        //Resultado
        if(res) info = "Construção excluída com sucesso"; else info = "Não foi possível excluir construção";
        exibirAlerta(info);
    }
    
    /**
     * Procura por registro de construção à partir de ID informado
     * @param event
     * @throws IOException 
     */
    @FXML
    private void ActionProcurar(ActionEvent event) throws IOException {
        //Retorna, caso o campo esteja inválido
        if(!validarCodigo())
            return;
        //Criação dos objetos
        Construcao co = null;
        Forro fo;
        Parede pa;
        //Busca da construção
        fo = controle.buscarForro(txt_id.getText());
        pa = controle.buscarParede(txt_id.getText());
        //Caso forro
        if(fo != null) {
            chk_rf.setSelected(fo.getEhRf());
            chk_ru.setSelected(fo.getEhRu());
            chk_st.setSelected(fo.getEhSt());
            co = fo.getConstrucao();
        //Caso parede
        } else if(pa != null) {
            txt_montante.setText(pa.getMontante().toString());
            txt_alturaLim.setText(pa.getAlturaLimite().toString());
            chk_rf.setSelected(pa.getEhRf());
            chk_ru.setSelected(pa.getEhRu());
            chk_st.setSelected(pa.getEhSt());
            co = pa.getConstrucao();
        }
        //Construção
        if(co != null) {
            co.setCodConstrucao(Integer.parseInt(txt_id.getText()));
            txt_descricao.setText(co.getDescricao());
            txt_detalhes.setText(co.getDetalhes());
            txt_qualidade.setText(co.getQualidade().toString());
        }
    }
    
    /**
     * Limpa os campos do registro de construção
     * @param event Evento de ocorrência
     * @throws IOException Exceção de ocorrência
     */
    @FXML
    private void ActionLimpar(ActionEvent event) throws IOException {
        limparCampos();
    }
    
    /**
     * Limpa os campos do registro de construção
     */
    private void limparCampos() {
        txt_alturaLim.setText("");
        txt_descricao.setText("");
        txt_detalhes.setText("");
        txt_id.setText("");
        txt_montante.setText("");
        txt_qualidade.setText("");
        chk_rf.setSelected(false);
        chk_ru.setSelected(false);
        chk_st.setSelected(false);
        if ((RadioButton) grp_construcao.getSelectedToggle() != null )
            ((RadioButton) grp_construcao.getSelectedToggle()).setSelected(false);
        txt_alturaLim.setEditable(false);
        txt_montante.setEditable(false);
    }
    
    /**
     * Valida campos de dados (exceto o código) da construção
     * @return true, caso seja válido<br/>false, caso não seja
     */
    private boolean validarCampos() {
        if(txt_descricao.getText().equals("")) {
            exibirAlerta("Preencha a descrição.");
            return false;
        }
        if(txt_detalhes.getText().equals("")) {
            exibirAlerta("Preencha os detalhes.");
            return false;
        }
        if(txt_qualidade.getText().equals("")) {
            exibirAlerta("Preencha a pontuação de qualidade.");
            return false;
        }
        try {
            Integer.parseInt(txt_qualidade.getText());
        } catch(NumberFormatException ex) {
            exibirAlerta("Preencha a qualidade limite corretamente.\nUse somente números.");
            return false;
        }
        if(!(chk_rf.isSelected() || chk_ru.isSelected() || chk_st.isSelected())) {
            exibirAlerta("Selecione ao menos um tipo de proteção.");
            return false;
        }
        if(((RadioButton) grp_construcao.getSelectedToggle()) == null) {
            exibirAlerta("Selecione o tipo de construção.");
            return false;
        }
        if(txt_montante.getText().equals("") && op_parede.isSelected()) {
            exibirAlerta("Preencha a montante limite.");
            return false;
        }
        try {
            if(op_parede.isSelected())
                Double.parseDouble(txt_montante.getText());
        } catch(NumberFormatException ex) {
            exibirAlerta("Preencha a montante corretamente.\nUtilize ponto como separador decimal.");
            return false;
        }
        if(txt_alturaLim.getText().equals("") && op_parede.isSelected()) {
            exibirAlerta("Preencha a altura limite.");
            return false;
        }
        try {
            if(op_parede.isSelected())
                Double.parseDouble(txt_alturaLim.getText());
        } catch(NumberFormatException ex) {
            exibirAlerta("Preencha a altura limite corretamente.\nUtilize ponto como separador decimal.");
            return false;
        }
        return true;
    }
    
    /**
     * Valida código de construção, vereficando também se já existe
     * @return 
     */
    private boolean validarCodigo() {
        Forro fo;
        Parede pa;
        if(txt_id.getText().equals("")) {
            exibirAlerta("Preencha o ID construção.");
            return false; 
        }
        try {
            Integer.parseInt(txt_id.getText());
        } catch(NumberFormatException ex) {
            exibirAlerta("Preencha o ID da construção corretamente.\nUse somente números.");
            return false;
        }
        fo = controle.buscarForro(txt_id.getText());
        pa = controle.buscarParede(txt_id.getText());
        if(fo == null && pa == null) {
            exibirAlerta("Construção não encontrada.\nID de busca: " + txt_id.getText());
            return false;
        }
        return true;
    }
    
    /**
     * Exibe uma mensagem de alerta
     * @param txt Texto do corpo a ser exibido no conteúdo
     */
    private void exibirAlerta(String txt) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("C.M.D");
            alerta.setHeaderText("C.M.D Informa!!!");
            alerta.setContentText(txt);
            alerta.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Eventos
        grp_construcao.selectedToggleProperty().addListener(new ActionHabilitarParede());
        //Controle
        controle = new ConstrucaoControle();
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
