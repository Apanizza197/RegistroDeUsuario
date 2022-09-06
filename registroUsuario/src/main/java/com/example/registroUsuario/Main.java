package com.example.registroUsuario;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        Main.context = SpringApplication.run(Main.class);
        Application.launch(JavaFXApplication.class, args);
    }

    public static ConfigurableApplicationContext getContext() {
        return context;
    }
// Esto es solo un comentario
}