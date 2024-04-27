package com.example.virtualpiano;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Piano");
            stage.setScene(scene);
            stage.show();
            MainController.load();
        }
        catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}