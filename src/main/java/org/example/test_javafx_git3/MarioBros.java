package org.example.test_javafx_git3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MarioBros extends Application {

    private static final int SCENE_WIDTH = 800;
    private static final int SCENE_HEIGHT = 600;
    private static final int MARIO_SIZE = 40;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mario Bros");

        Pane root = new Pane();
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);

        // Créer la tête de Mario (cercle rouge)
        Circle head = new Circle(MARIO_SIZE / 2, Color.RED);
        head.relocate(SCENE_WIDTH / 2 - MARIO_SIZE / 2, SCENE_HEIGHT / 2 - MARIO_SIZE * 2);

        // Créer le corps de Mario (rectangle bleu)
        Rectangle body = new Rectangle(MARIO_SIZE, MARIO_SIZE, Color.BLUE);
        body.relocate(SCENE_WIDTH / 2 - MARIO_SIZE / 2, SCENE_HEIGHT / 2 - MARIO_SIZE);

        root.getChildren().addAll(head, body);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
