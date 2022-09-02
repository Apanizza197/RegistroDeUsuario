package com.example.registroUsuario.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerJavaFX implements Initializable {

    @FXML
    public Button btnGuardar;
    public Button btnCancelar;
    public TextField txtNombre;
    public TextField txtDirec;
    public TextField txtTel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void guardarDatos(ActionEvent actionEvent) {

    }
}
