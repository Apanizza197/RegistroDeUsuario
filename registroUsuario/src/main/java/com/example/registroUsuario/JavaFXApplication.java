package com.example.registroUsuario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class JavaFXApplication extends Application {

	private Parent root;

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setControllerFactory(Main.getContext()::getBean);
		root = fxmlLoader.load(JavaFXApplication.class.getResourceAsStream("vista_archivo.fxml"));
		primaryStage.setTitle("Registro usuario");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	@Override
	public void stop(){
		Main.getContext().close();
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
