package es.ieslosmontecillos.ejerciciomouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class EjercicioMouseEvent extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Mover texto con el ratón");

        Text texto = new Text();
        texto.setText("Programar es divertido");

        texto.setOnMouseDragged(event -> {
            moverTexto(event, texto);
        });

        StackPane sp = new StackPane();
        sp.getChildren().add(texto);

        Scene scene = new Scene(sp, 320, 240);
        stage.setTitle("MouseEvent");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }



    private void moverTexto(MouseEvent event, Text texto) {
        //texto.setTranslateX(event.getX());
        //texto.setTranslateY(event.getY());
        texto.setX(event.getX());
        texto.setY(event.getY());
    }


}