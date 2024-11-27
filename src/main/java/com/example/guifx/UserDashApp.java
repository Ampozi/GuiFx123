package com.example.guifx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class UserDashApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UserDashApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1100, 600);
        stage.setTitle("User Dashboard!");
        stage.setScene(scene);
        stage.getIcons().add(new Image("C:/Users/assig/Downloads/Sunlablogbl.jpg"));
        stage.setResizable(false);
        stage.show();





    }

   // public void signOff(ActionEvent event) throws IOException {
   //    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sign_Out.fxml"));
   //     Scene scene2 = new Scene(fxmlLoader.load(), 320, 240);
   //     stage.setScene(scene2);
   //     stage.show();

   // }


    public static void main(String[] args) {
        launch();
    }
}