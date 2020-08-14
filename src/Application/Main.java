/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author cami
 */
public class Main extends Application {

    private static Scene scene;
    
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
            ScrollPane scrollPane = loader.load();
            scene = new Scene(scrollPane);
            
            //completar tamanho da tela
            scrollPane.setFitToHeight(true);
            scrollPane.setFitToWidth(true);
            
            primaryStage.setScene(scene);
            primaryStage.setTitle("JavaFX Application");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static Scene getMainScene(){
        return scene;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
