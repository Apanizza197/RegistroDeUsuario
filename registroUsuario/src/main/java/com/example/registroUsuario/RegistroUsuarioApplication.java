package com.example.registroUsuario;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.stage.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class RegistroUsuarioApplication extends Application {

	Stage window;
	Button botonGuardar;
	Button botonCancelar;
	Label etiquetaNombre;
	Label etDireccion;
	Label etTel;

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = SpringApplication.run(RegistroUsuarioApplication.class, args);
		UsuarioRepository usuarioRepository = (UsuarioRepository) applicationContext.getBean("usuarioRepository");
		Usuario usuario1 = new Usuario("juan","b.artigas","091216");
		usuarioRepository.save(usuario1);
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Registrar cliente");
		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		});

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(15,15,15,15));
		grid.setVgap(10);
		grid.setHgap(10);

		botonGuardar = new Button("Guardar");
		botonCancelar = new Button ("Cancelar");
		GridPane.setConstraints(botonGuardar,3,4);
		GridPane.setConstraints(botonCancelar,4,4);

		TextField nombreInput = new TextField();
		nombreInput.setPromptText("Pepe Díaz");
		TextField direcInput = new TextField();
		direcInput.setPromptText("Calle Este 1234");
		TextField telInput = new TextField();
		telInput.setPromptText("091234567");

		GridPane.setConstraints(nombreInput,2,1);
		GridPane.setConstraints(direcInput,2,2);
		GridPane.setConstraints(telInput,2,3);

		//boton1.setOnAction(e -> window.setScene(scene2)); // cambio de escena
		botonCancelar.setOnAction(e -> closeProgram());
		botonGuardar.setOnAction(e -> {
			isString(nombreInput);
			isInt(telInput);
			guardarDatos(nombreInput, direcInput, telInput);
		});

		etiquetaNombre = new Label("Nombre");
		etDireccion = new Label("Dirección");
		etTel = new Label("Teléfono");
		GridPane.setConstraints(etiquetaNombre,1,1);
		GridPane.setConstraints(etDireccion,1,2);
		GridPane.setConstraints(etTel,1,3);


		grid.getChildren().addAll(botonGuardar,botonCancelar,etiquetaNombre,etTel,etDireccion,nombreInput,direcInput,telInput);

		Scene scene = new Scene(grid,400,250 );
		window.setScene(scene);
		window.show();
	}

	private void closeProgram(){
		Boolean answer = ConfirmBox.display("Confirmación","¿Estas seguro que quieres cancelar y cerrar?");
		if(answer){
			window.close();
		}
	}
	private void guardarDatos(TextField nombreInput, TextField direcInput, TextField telInput){
		Boolean answer = ConfirmBox.display("Confirmación", "Confirme el guardado: ");
		if (answer){
			Usuario usuario1 = new Usuario(nombreInput.getText(), direcInput.getText(), telInput.getText());
			//UsuarioControllerImpl usuarioController1 = applicationContext.getBean("usuarioControllerImpl", UsuarioControllerImpl.class);

			//como llamo la clase que es una bean???
			//UsuarioControllerImpl usuarioController = applicationContext.getBean("usuarioControllerImpl", UsuarioControllerImpl.class);

			//aca llamaria metodo que haga Mery para q guarde en la base de datos al cliente
			//para referirme a los datos ingresados TextField.getText()
		}
	}
	private boolean isString(TextField input){
		//chequear que sea valido con java.util.regex
		return true;

	}
	private boolean isInt(TextField input){
		try{
			int tel = Integer.parseInt(input.getText());
			return true;

		}catch(NumberFormatException e){
			System.out.println("Error: "+input.getText()+ " no es un teléfono válido");
			return false;
		}
	}



}
