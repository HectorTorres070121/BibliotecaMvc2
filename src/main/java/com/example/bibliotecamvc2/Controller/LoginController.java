package com.example.bibliotecamvc2.Controller;

import com.example.bibliotecamvc2.Model.UserModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private UserModel userModel =new UserModel();
    @FXML
    protected TextField txtUsuario;
    @FXML
    protected TextField txtPassword;
    @FXML
    protected Label lbl;

    @FXML
    public void validarUsuario() {

        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();

        if (usuario.isEmpty() || password.isEmpty()) {
            lbl.setText("Llena todos los campos");
            return;
        }

        boolean valido = userModel.validarUsuario(usuario, password);

        if (valido) {
            lbl.setText("Bienvenido " + usuario);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("segundaVista.fxml"));
            try {
                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setTitle("segunda vista");
                stage.setScene(new Scene(root));
                stage.show();
            }catch (IOException e){
                e.printStackTrace();
            }


        } else {
            lbl.setText("Datos incorrectos");
        }
    }
}
