package com.example.bibliotecamvc2.Model;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserModel {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
