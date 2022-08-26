package com.example.registroUsuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class RegistroUsuarioApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(com.example.registroUsuario.AppConfig.class);
		SpringApplication.run(RegistroUsuarioApplication.class, args);
		//launch(args);
	}

}
