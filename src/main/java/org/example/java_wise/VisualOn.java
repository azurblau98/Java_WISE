package org.example.java_wise;
import dynamicpresent.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class VisualOn extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        DynamicPresent Present = new DynamicPresent();
        BorderPane BPane = new BorderPane();
        BPane.setLeft(new Pane(Present.topLeft()));
        BPane.setRight(new Pane(Present.topRight()));
        //BPane.setCenter((Present.center()));
        BPane.setBottom(new Pane(Present.bottomLeft()));
        Scene scene = new Scene(BPane,600,400);


        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}