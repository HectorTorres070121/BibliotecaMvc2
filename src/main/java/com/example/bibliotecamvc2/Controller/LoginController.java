package com.example.bibliotecamvc2.Controller;

import com.example.bibliotecamvc2.Model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private UserModel userModel =new UserModel();
    @FXML
    protected TextField txtUsuario;
    @FXML
    protected TextField txtPassword;

    @FXML
    public void onVerificar() {

        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();

        if (usuario.isEmpty() || password.isEmpty()) {
            lbMensaje.setText("Llena todos los campos");
            return;
        }

        boolean valido = userModel.validarUsuario(usuario, password);

        if (valido) {
            lbMensaje.setText("Bienvenido " + usuario);

        } else {
            lbMensaje.setText("Datos incorrectos");
        }
    }
}
