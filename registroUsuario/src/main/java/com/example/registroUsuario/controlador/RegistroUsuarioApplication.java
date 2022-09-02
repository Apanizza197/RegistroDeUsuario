package com.example.registroUsuario.controlador;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class RegistroUsuarioApplication extends Application {
	private ConfigurableApplicationContext applicationContext;


	public static void main(String[] args) throws Exception {
		//ApplicationContext applicationContext = SpringApplication.run(RegistroUsuarioApplication.class, args);

		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(com.example.registroUsuario.controlador.AppConfig.class);
		/*UsuarioRepository usuarioRepository = (UsuarioRepository) applicationContext.getBean("usuarioRepository");
		Usuario usuario1 = new Usuario("juan","b.artigas","091216");
		usuarioRepository.save(usuario1);*/
		launch(args);
	}

	@Override
	public void init() {
		String[] args = getParameters().getRaw().toArray(new String[0]);

		this.applicationContext = new SpringApplicationBuilder()
				.sources(RegistroUsuarioApplication.class)
				.run(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		FxWeaver fxWeaver = applicationContext.getBean(FxWeaver.class);
		Parent root = fxWeaver.loadView(ControllerJavaFX.class);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() {
		this.applicationContext.close();
		Platform.exit();
	}
/*
	@Override
	public void start(Stage primaryStage) throws Exception {
		applicationContext = SpringApplication.run(RegistroUsuarioApplication.class);
		FXMLLoader fxmlLoader = new FXMLLoader(RegistroUsuarioApplication.class.getResource("/vista/vista_archivo.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 400, 400);
		primaryStage.setTitle("Registro usuario");
		primaryStage.setScene(scene);
		primaryStage.show();
	}*/


}
