package com.example.orderease;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class HelloController {
    @FXML
    private ImageView loginImage;



    @FXML
    private ImageView OrderEaseIcon;

    @FXML
    private Button loginButton;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordPasswordField;


    public void loginButtonAction(ActionEvent e){
      loginMessageLabel.setText("You tried to login");
      if(usernameTextField.getText().isBlank() == false && passwordPasswordField.getText().isBlank() == false){
          loginMessageLabel.setText("You tried to login");
      }else{
          loginMessageLabel.setText("Por favor ingresa todos los datos solicitados para iniciar sesión");
      }

    }

    public void exitButtonAction(ActionEvent e){
        Stage stage = (Stage)loginButton.getScene().getWindow();
        stage.close();
        //This is a button used to close the window

    }




}