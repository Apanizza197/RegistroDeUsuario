package com.example.registroUsuario.controlador;
import net.rgielen.fxweaver.core.FxmlView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
@FxmlView("vista_archivo.fxml")
public class ControllerJavaFX implements Initializable {
    @Autowired
    UsuarioRepository usuarioRepository;

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
        Usuario u = new Usuario(txtNombre.getText(), txtDirec.getText(), txtTel.getText());
        usuarioRepository.save(u);
    }
}
