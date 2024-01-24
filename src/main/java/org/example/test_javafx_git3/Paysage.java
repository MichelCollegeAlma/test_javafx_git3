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
        primaryStage.setTitle("Paysage avec Dromadaire");

        Pane root = new Pane();
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);

        // Dessiner le ciel
        Rectangle ciel = new Rectangle(SCENE_WIDTH, SCENE_HEIGHT / 2, Color.SKYBLUE);
        ciel.relocate(0, 0);

        // Dessiner le sol
        Rectangle sol = new Rectangle(SCENE_WIDTH, SCENE_HEIGHT / 2, Color.GREEN);
        sol.relocate(0, SCENE_HEIGHT / 2);

        // Dessiner le soleil (cercle jaune)
        Circle soleil = new Circle(50, Color.YELLOW);
        soleil.relocate(100, 100);

        // Dessiner le dromadaire (rectangle marron pour le corps, cercle pour la tête)
        Rectangle corpsDromadaire = new Rectangle(80, 40, Color.BROWN);
        corpsDromadaire.relocate(400, SCENE_HEIGHT / 2 - 40);

        Circle teteDromadaire = new Circle(20, Color.BROWN);
        teteDromadaire.relocate(440, SCENE_HEIGHT / 2 - 60);

        root.getChildren().addAll(ciel, sol, soleil, corpsDromadaire, teteDromadaire);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
