package org.example.test_javafx_git3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Paysage extends Application {

    private static final int SCENE_WIDTH = 800;
    private static final int SCENE_HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Paysage JavaFX");

        Pane root = new Pane();
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);

        // Dessiner le ciel
        Rectangle ciel = new Rectangle(SCENE_WIDTH, SCENE_HEIGHT / 2, Color.SKYBLUE);
        ciel.relocate(0, 0);

        // Dessiner le sol
        Rectangle sol = new Rectangle(SCENE_WIDTH, SCENE_HEIGHT / 2, Color.GREEN);
        sol.relocate(0, SCENE_HEIGHT / 2);

        // Dessiner le soleil
        Circle soleil = new Circle(50, Color.YELLOW);
        soleil.relocate(100, 100);

        root.getChildren().addAll(ciel, sol, soleil);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
