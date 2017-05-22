/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.telas.funcionario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author fe_mm
 */
public class FuncionarioMain extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent Root = FXMLLoader.load(getClass().getResource("/cmd/fxml/FuncionarioFXML.fxml"));
        Scene  sc = new Scene(Root);
        primaryStage.setScene(sc);
        primaryStage.show();
        
    }
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
