package com.example.swing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JMain extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX FlowPane Example");
        Label labeltx = new Label("Enter your name"); 
        TextField tx = new TextField("");
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(labeltx, tx, button1, button2, button3);
        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
   
}
