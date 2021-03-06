package org.sla;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FilmsGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        primaryStage.setTitle("Company Data");
        primaryStage.setScene(new Scene(root, 865, 703));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}