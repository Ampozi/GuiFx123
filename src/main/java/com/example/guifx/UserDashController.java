package com.example.guifx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class UserDashController {

   // @FXML
  //  Button btn = new Button();
   // btn.setOnAction(e -> primaryStage.setScene(scene2));


    @FXML
    private Label welcomeText;

    Connection con;
    PreparedStatement pst;
    int myIndex;
    int id;

    //public void Connect() throws SQLException {
        //
       // con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
    //}
       // catch (ClassNotFoundException ex){
    //}   catch (SQLException ex) {
    //ex.printStackTrace();
   // }

    public void initialize(URL url, ResourceBundle rb) {}
    @FXML
    private Button knopReset;

    @FXML
    private Button knopToevoegen;

   // @FXML
    //private Button knopVerwijderen(Stage stage);
    //    FXMLLoader fxmlLoader = new FXMLLoader(UserDashApp.class.getResource("Sign_Out.fxml"));
    //    Scene scene2 = new Scene(fxmlLoader.load(), 320, 240);
    //    stage.setScene(scene2);
    //    stage.show();

    @FXML
    private TableColumn<?, ?> tabelEnergieDag;

    @FXML
    private TableColumn<?, ?> tabelEnergieUur;

    @FXML
    private TableColumn<?, ?> tabelLichtDag;

    @FXML
    private TableColumn<?, ?> tabelPlaats;

    @FXML
    private TableColumn<?, ?> tabelReset;

    @FXML
    private TextField textBoxNaam;

    @FXML
    void Toevoegen(ActionEvent event) {

    }

    @FXML
    void reset(ActionEvent event) {

    }

    @FXML
    void verwijderen(ActionEvent event) {

    }

    @FXML
    protected void gotocontact() {

    }

    @FXML
    protected void signOff() {
        System.exit(0);
    }

    @FXML
    protected void signOut(ActionEvent event) throws IOException {
    try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Sign_out.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    catch(IOException e) {
        e.printStackTrace();
    }

 //       public void signOff(ActionEvent event) throws IOException {
  //          FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sign_Out.fxml"));
  //          Scene scene2 = new Scene(fxmlLoader.load(), 200, 160);
   //         stage.setScene(scene2);
  //          stage.show();

  //      }

    }

    @FXML
    protected void test() {
        welcomeText.setText("Welcome To JavaFX!!!");
    }

    @FXML
    protected void opendeveloperslink() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.google.com"));
    }

    @FXML
    protected void opensupportlink() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.google.com"));
    }

}