package org.example.test_javafx_git3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LapinApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lapin JavaFX");

        StackPane root = new StackPane();
        Canvas canvas = new Canvas(400, 400);
        root.getChildren().add(canvas);

        drawLapin(canvas.getGraphicsContext2D());

        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    private void drawLapin(GraphicsContext gc) {
        // Dessiner le corps du lapin
        gc.setFill(Color.GRAY);
        gc.fillRoundRect(100, 150, 200, 100, 20, 20);

        // Dessiner la tête du lapin
        gc.setFill(Color.GRAY);
        gc.fillOval(300, 100, 80, 80);

        // Dessiner les yeux
        gc.setFill(Color.BLACK);
        gc.fillOval(320, 130, 10, 10);
        gc.fillOval(350, 130, 10, 10);

        // Dessiner le nez
        gc.setFill(Color.PINK);
        gc.fillOval(340, 145, 5, 5);

        // Dessiner les oreilles
        gc.setFill(Color.GRAY);
        gc.fillPolygon(new double[]{290, 310, 330}, new double[]{90, 30, 90}, 3);
        gc.fillPolygon(new double[]{370, 390, 410}, new double[]{90, 30, 90}, 3);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
