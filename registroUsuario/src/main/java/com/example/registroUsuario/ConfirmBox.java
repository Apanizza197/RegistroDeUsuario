package com.example.registroUsuario;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.stage.*;

public class ConfirmBox {
    static boolean answer;

    public static boolean display(String titulo, String mensaje){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        //bloqueamos la interaccion del usuario con otras ventanas hasta que resuelva esta
        window.setTitle(titulo);
        window.setMinWidth(250); //ancho min

        Label label1 = new Label();
        label1.setText(mensaje);

        //creo 2 botones
        Button botonSi = new Button("Si");
        Button botonNo = new Button("No");

        botonSi.setOnAction(e -> {
            answer = true;
            window.close(); // cierro la pop-up window
        });
        botonNo.setOnAction(e -> {
            answer = false;
            window.close(); // cierro la pop-up window
        });


        VBox layout = new VBox(20);
        layout.getChildren().addAll(label1,botonNo,botonSi);
        layout.setAlignment(Pos.CENTER); // alinea todo al centro

        Scene scene = new Scene(layout,200,200);
        window.setScene(scene);
        window.showAndWait(); // muestra la ventana y espera a que alguien la cierre, sino no vuelve

        return answer; // el método me retorna la info con la que interactue en la ventana que aparecio
    }
}
