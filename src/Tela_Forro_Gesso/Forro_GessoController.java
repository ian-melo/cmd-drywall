/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela_Forro_Gesso;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class Forro_GessoController implements Initializable {

    @FXML
    private AnchorPane form_forro_gesso;
    @FXML
    private Label lv;
    @FXML
    private Label vv;
    @FXML
    private Label lb_can;
    @FXML
    private Label lb_p;
    @FXML
    private Label lb_ara;
    @FXML
    private Label lb_para;
    @FXML
    private Label lb_pa;
    @FXML
    private Label lb_m;
    @FXML
    private Label lb_f;
    @FXML
    private Label lb_parafuso;
    @FXML
    private Label lb_r;
    @FXML
    private Label lb_a;
    @FXML
    private Label lb;
    @FXML
    private Label lb_cons_11;
    @FXML
    private Label lb_cons_12;
    @FXML
    private Label lb_cons_09;
    @FXML
    private Label lb_cons_10;
    @FXML
    private Label lb_cons_07;
    @FXML
    private Label lb_cons_06;
    @FXML
    private Label lb_cons_05;
    @FXML
    private Label lb_cons_03;
    @FXML
    private Label lb_cons_08;
    @FXML
    private Label lb_cons_04;
    @FXML
    private Label lb_cons_02;
    @FXML
    private Label lb_cons_01;
    @FXML
    private Label lb_total_soma;
    @FXML
    private TextField txt_Area;
    @FXML
    private Label lb_total_m2;
    @FXML
    private Button btn_calcular;
    @FXML
    private Button btn_limpar;
    @FXML
    private Button btn_salvar;
    @FXML
    private Label lb_varia_combo;
    @FXML
    private ComboBox<String> cmb_modelo;
    @FXML
    private Label lb_especificacao;
    @FXML
    private Label lb_total_01;
    @FXML
    private Label lb_total_02;
    @FXML
    private Label lb_total_03;
    @FXML
    private Label lb_total_06;
    @FXML
    private Label lb_total_05;
    @FXML
    private Label lb_total_04;
    @FXML
    private Label lb_total_10;
    @FXML
    private Label lb_total_11;
    @FXML
    private Label lb_total_12;
    @FXML
    private Label lb_total_09;
    @FXML
    private Label lb_total_08;
    @FXML
    private Label lb_total_07;
    @FXML
    private Label lb_quant_04;
    @FXML
    private Label lb_quant_03;
    @FXML
    private Label lb_quant_02;
    @FXML
    private Label lb_quant_01;
    @FXML
    private Label lb_quant_07;
    @FXML
    private Label lb_quant_08;
    @FXML
    private Label lb_quant_05;
    @FXML
    private Label lb_quant_06;
    @FXML
    private Label lb_quant_09;
    @FXML
    private Label lb_quant_12;
    @FXML
    private Label lb_quant_11;
    @FXML
    private Label lb_quant_10;
    @FXML
    private TextField txt_preco_08;
    @FXML
    private TextField txt_preco_01;
    @FXML
    private TextField txt_preco_09;
    @FXML
    private TextField txt_preco_10;
    @FXML
    private TextField txt_preco_11;
    @FXML
    private TextField txt_preco_12;
    @FXML
    private TextField txt_preco_03;
    @FXML
    private TextField txt_preco_04;
    @FXML
    private TextField txt_preco_05;
    @FXML
    private TextField txt_preco_06;
    @FXML
    private TextField txt_preco_07;
    @FXML
    private TextField txt_preco_02;
    @FXML
    private Button bt_sair;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicia_ComboBox();

    }

    private void inicia_ComboBox() {
        ObservableList<String> opcao = FXCollections.observableArrayList(
                "FORRO DE GESSO - 1 CHAPA - 530/600 - ST12,5",//1
                "FORRO DE GESSO - 1 CHAPA - 530/400 - RU12,5",//2
                "FORRO DE GESSO - 1 CHAPA - 530/400 - ST12,5 + ST 12,5 ou RU12,5 + RU 12,5",//3
                "FORRO DE GESSO - 1 CHAPA - 530/600 - RF 15,0",//4
                "FORRO DE GESSO - 2 CHAPA - 530/400 - RF 15,0 + RF 15,0"//5
        );

        cmb_modelo.setItems(opcao);

    }

    @FXML
    private void Click_Calcular(MouseEvent event) throws NoSuchFieldException {
        //Falta validar
        Coloca_Zero();
        Calcula_Constante();
        Calcula_Preco_Unitario();

        Calcula_Soma();
        Calcula_Total_Area();

    }

    @FXML
    private void Click_Limpar(MouseEvent event) {
        /*for (int i = 0; i < getContentPane().getComponentCount(); i++) {
         //varre todos os componentes
         Component c = getContentPane().getComponent(i);
         if (c instanceof JTextField) {
         //apaga os valores
         JTextField field = (JTextField) c;
         field.setText("");
         System.out.println("apagando campo " + i);
         }
         }
         */
    }

    @FXML
    private void Click_Salvar(MouseEvent event) {

    }

    @FXML
    private void Click_On_Action(ActionEvent event) {
        muda_depende_cmb();
    }

    private void Coloca_Zero() throws NoSuchFieldException {

        txt_preco_01.setText(txt_preco_01.getText().trim());//retira espaço
        txt_preco_02.setText(txt_preco_02.getText().trim());
        txt_preco_03.setText(txt_preco_03.getText().trim());
        txt_preco_04.setText(txt_preco_04.getText().trim());
        txt_preco_05.setText(txt_preco_05.getText().trim());
        txt_preco_06.setText(txt_preco_06.getText().trim());
        txt_preco_07.setText(txt_preco_07.getText().trim());
        txt_preco_08.setText(txt_preco_08.getText().trim());
        txt_preco_09.setText(txt_preco_09.getText().trim());
        txt_preco_10.setText(txt_preco_10.getText().trim());
        txt_preco_11.setText(txt_preco_11.getText().trim());
        txt_preco_12.setText(txt_preco_12.getText().trim());

        if ("".equals(txt_preco_01.getText())) {
            txt_preco_01.setText("0");
        }
        if ("".equals(txt_preco_02.getText())) {
            txt_preco_02.setText("0");
        }
        if ("".equals(txt_preco_03.getText())) {
            txt_preco_03.setText("0");
        }
        if ("".equals(txt_preco_04.getText())) {
            txt_preco_04.setText("0");
        }
        if ("".equals(txt_preco_05.getText())) {
            txt_preco_05.setText("0");
        }
        if ("".equals(txt_preco_06.getText())) {
            txt_preco_06.setText("0");
        }
        if ("".equals(txt_preco_07.getText())) {
            txt_preco_07.setText("0");
        }
        if ("".equals(txt_preco_08.getText())) {
            txt_preco_08.setText("0");
        }
        if ("".equals(txt_preco_09.getText())) {
            txt_preco_09.setText("0");
        }
        if ("".equals(txt_preco_10.getText())) {
            txt_preco_10.setText("0");
        }
        if ("".equals(txt_preco_11.getText())) {
            txt_preco_11.setText("0");
        }
        if ("".equals(txt_preco_12.getText())) {
            txt_preco_12.setText("0");
        }

    }

    private void Calcula_Soma() {
        float[] valor;
        float valor_total = 0;

        valor = new float[12];

        valor[0] = Float.parseFloat(lb_total_01.getText().replace(",", "."));
        valor[1] = Float.parseFloat(lb_total_02.getText().replace(",", "."));
        valor[2] = Float.parseFloat(lb_total_03.getText().replace(",", "."));
        valor[3] = Float.parseFloat(lb_total_04.getText().replace(",", "."));
        valor[4] = Float.parseFloat(lb_total_05.getText().replace(",", "."));
        valor[5] = Float.parseFloat(lb_total_06.getText().replace(",", "."));
        valor[6] = Float.parseFloat(lb_total_07.getText().replace(",", "."));
        valor[7] = Float.parseFloat(lb_total_08.getText().replace(",", "."));
        valor[8] = Float.parseFloat(lb_total_09.getText().replace(",", "."));
        valor[9] = Float.parseFloat(lb_total_10.getText().replace(",", "."));
        valor[10] = Float.parseFloat(lb_total_11.getText().replace(",", "."));
        valor[11] = Float.parseFloat(lb_total_12.getText().replace(",", "."));

        for (int i = 0; i <= 11; i++) {
            valor_total = valor_total + valor[i];//soma tudo
        }

        lb_total_soma.setText(String.valueOf(valor_total).replace(".", ","));
    }

    private void Calcula_Total_Area() {
        lb_total_m2.setText(String.valueOf(Float.parseFloat(lb_total_soma.getText().replace(",", ".")) / Float.parseFloat(txt_Area.getText().replace(",", "."))).replace(".", ","));
    }

    private void Calcula_Preco_Unitario() {
        float val = 0;
        val = Float.parseFloat(lb_quant_01.getText().replace(",", ".")) * Float.parseFloat(txt_preco_01.getText().replace(",", "."));
        lb_total_01.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_02.getText().replace(",", ".")) * Float.parseFloat(txt_preco_02.getText().replace(",", "."));
        lb_total_02.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_03.getText().replace(",", ".")) * Float.parseFloat(txt_preco_03.getText().replace(",", "."));
        lb_total_03.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_04.getText().replace(",", ".")) * Float.parseFloat(txt_preco_04.getText().replace(",", "."));
        lb_total_04.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_05.getText().replace(",", ".")) * Float.parseFloat(txt_preco_05.getText().replace(",", "."));
        lb_total_05.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_06.getText().replace(",", ".")) * Float.parseFloat(txt_preco_06.getText().replace(",", "."));
        lb_total_06.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_07.getText().replace(",", ".")) * Float.parseFloat(txt_preco_07.getText().replace(",", "."));
        lb_total_07.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_08.getText().replace(",", ".")) * Float.parseFloat(txt_preco_08.getText().replace(",", "."));
        lb_total_08.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_09.getText().replace(",", ".")) * Float.parseFloat(txt_preco_09.getText().replace(",", "."));
        lb_total_09.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_10.getText().replace(",", ".")) * Float.parseFloat(txt_preco_10.getText().replace(",", "."));
        lb_total_10.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_11.getText().replace(",", ".")) * Float.parseFloat(txt_preco_11.getText().replace(",", "."));
        lb_total_11.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(lb_quant_12.getText().replace(",", ".")) * Float.parseFloat(txt_preco_12.getText().replace(",", "."));
        lb_total_12.setText(String.valueOf(val).replace(".", ","));

    }

    private void Calcula_Constante() {
        float val;
        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_01.getText().replace(",", "."));
        lb_quant_01.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_02.getText().replace(",", "."));
        lb_quant_02.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_03.getText().replace(",", "."));
        lb_quant_03.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_04.getText().replace(",", "."));
        lb_quant_04.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_05.getText().replace(",", "."));
        lb_quant_05.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_06.getText().replace(",", "."));
        lb_quant_06.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_07.getText().replace(",", "."));
        lb_quant_07.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_08.getText().replace(",", "."));
        lb_quant_08.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_09.getText().replace(",", "."));
        lb_quant_09.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_10.getText().replace(",", "."));
        lb_quant_10.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_11.getText().replace(",", "."));
        lb_quant_11.setText(String.valueOf(val).replace(".", ","));

        val = Float.parseFloat(txt_Area.getText().replace(",", ".")) * Float.parseFloat(lb_cons_12.getText().replace(",", "."));
        lb_quant_12.setText(String.valueOf(val).replace(".", ","));

    }

    private void muda_depende_cmb() {
        //Preenche determinado item apartir da escolha da comBox

        //System.out.println(cmb_modelo.valueProperty().get());// igual getValue();
        if (cmb_modelo.getSelectionModel().getSelectedIndex() == 0) {
            lb_varia_combo.setText("PLACA ST BR12,5 (1200 x 1800) mm");

            lb_especificacao.setText("APENAS PARA CHAPA ST");

            lb_cons_01.setText("0,49");
            lb_cons_02.setText("0,60");
            lb_cons_03.setText("0,30");
            lb_cons_04.setText("1,80");
            lb_cons_05.setText("0,02");
            lb_cons_06.setText("0,13");
            lb_cons_07.setText("0,02");
            lb_cons_08.setText("0,00");
            lb_cons_09.setText("0,01");
            lb_cons_10.setText("0,02");
            lb_cons_11.setText("0,05");
            lb_cons_12.setText("0,05");

            //} else if ("FORRO DE GESSO - 1 CHAPA - 530/400 - RU12,5".equals(cmb_modelo.getValue())) {
        } else if (cmb_modelo.getSelectionModel().getSelectedIndex() == 1) {
            lb_varia_combo.setText("PLACA RU BR12,5 (1200 x 1800) mm");

            lb_especificacao.setText("APENAS PARA CHAPA RU");

            lb_cons_01.setText("0,49");
            lb_cons_02.setText("0,90");
            lb_cons_03.setText("0,30");
            lb_cons_04.setText("2,43");
            lb_cons_05.setText("0,03");
            lb_cons_06.setText("0,13");
            lb_cons_07.setText("0,03");
            lb_cons_08.setText("0,00");
            lb_cons_09.setText("0,01");
            lb_cons_10.setText("0,02");
            lb_cons_11.setText("0,05");
            lb_cons_12.setText("0,05");

            //} else if ("FORRO DE GESSO - 1 CHAPA - 530/400 - ST12,5 + ST 12,5 ou RU12,5 + RU 12,5".equals(cmb_modelo.getValue())) {
        } else if (cmb_modelo.getSelectionModel().getSelectedIndex() == 2) {
            lb_varia_combo.setText("PLACA ST 12,5 ou RU 12,5 (1200 x 1800) mm");

            lb_especificacao.setText("PARA CHAPA ST OU RU");

            lb_cons_01.setText("0,97");
            lb_cons_02.setText("0,90");
            lb_cons_03.setText("0,30");
            lb_cons_04.setText("2,43");
            lb_cons_05.setText("0,03");
            lb_cons_06.setText("0,08");
            lb_cons_07.setText("0,03");
            lb_cons_08.setText("0,18");
            lb_cons_09.setText("0,02");
            lb_cons_10.setText("0,02");
            lb_cons_11.setText("0,05");
            lb_cons_12.setText("0,05");

            //} else if ("FORRO DE GESSO - 1 CHAPA - 530/600 - RF 15,0".equals(cmb_modelo.getValue())) {
        } else if (cmb_modelo.getSelectionModel().getSelectedIndex() == 3) {

            lb_varia_combo.setText("PLACA RF BR12,5 (1200 x 2400) mm");

            lb_especificacao.setText("APENAS PARA CHAPA RF");

            lb_cons_01.setText("0,36");
            lb_cons_02.setText("0,60");
            lb_cons_03.setText("0,30");
            lb_cons_04.setText("1,80");
            lb_cons_05.setText("0,02");
            lb_cons_06.setText("0,13");
            lb_cons_07.setText("0,02");
            lb_cons_08.setText("0,00");
            lb_cons_09.setText("0,01");
            lb_cons_10.setText("0,02");
            lb_cons_11.setText("0,05");
            lb_cons_12.setText("0,05");

            //} else if ("FORRO DE GESSO - 2 CHAPA - 530/400 - RF 15,0 + RF 15,0".equals(cmb_modelo.getValue())) {
        } else if (cmb_modelo.getSelectionModel().getSelectedIndex() == 4) {
            lb_varia_combo.setText("PLACA RF BR12,5 (1200 x 2400) mm");

            lb_especificacao.setText("APENAS PARA CHAPA RF");

            lb_cons_01.setText("0,73");
            lb_cons_02.setText("0,90");
            lb_cons_03.setText("0,30");
            lb_cons_04.setText("2,43");
            lb_cons_05.setText("0,03");
            lb_cons_06.setText("0,08");
            lb_cons_07.setText("0,03");
            lb_cons_08.setText("0,18");
            lb_cons_09.setText("0,02");
            lb_cons_10.setText("0,02");
            lb_cons_11.setText("0,05");
            lb_cons_12.setText("0,05");

        }

    }

    @FXML
    private void Sair(ActionEvent event) throws IOException {
        Parent cliente = FXMLLoader.load(getClass().getResource("/FXMLs/PrincipalFXML.fxml"));
        Scene scene = new Scene(cliente);
        Stage tela = (Stage) ((Node) event.getSource()).getScene().getWindow();
        tela.setScene(scene);
        tela.show();
    }

}
