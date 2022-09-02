package com.example.registroUsuario.controlador;

import com.example.registroUsuario.Usuario;
import com.example.registroUsuario.UsuarioRepository;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RegistroUsuarioApplication extends Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = SpringApplication.run(RegistroUsuarioApplication.class, args);
		/*UsuarioRepository usuarioRepository = (UsuarioRepository) applicationContext.getBean("usuarioRepository");
		Usuario usuario1 = new Usuario("juan","b.artigas","091216");
		usuarioRepository.save(usuario1);*/
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(RegistroUsuarioApplication.class.getResource("/vista/vista_archivo.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 400, 400);
		primaryStage.setTitle("Registro usuario");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

/*
	private void guardarDatos(TextField nombreInput, TextField direcInput, TextField telInput){

			Usuario usuario1 = new Usuario(nombreInput.getText(), direcInput.getText(), telInput.getText());
			//UsuarioControllerImpl usuarioController1 = applicationContext.getBean("usuarioControllerImpl", UsuarioControllerImpl.class);

			//como llamo la clase que es una bean???
			//UsuarioControllerImpl usuarioController = applicationContext.getBean("usuarioControllerImpl", UsuarioControllerImpl.class);

			//aca llamaria metodo que haga Mery para q guarde en la base de datos al cliente
			//para referirme a los datos ingresados TextField.getText()
	}
*/
}
