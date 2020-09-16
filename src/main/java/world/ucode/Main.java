package world.ucode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;


    /**
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        this.primaryStage = primaryStage;
        root.setStyle("-fx-background-color: linear-gradient(to bottom, #ff7f50, #6a5acd);");

        Menu menu = new Menu(primaryStage);
        root.getChildren().add(menu.label());
        root.getChildren().add(menu.startBtn());
        root.getChildren().add(menu.resultsBtn());
        root.getChildren().add(menu.exitBtn());

        Scene scene = new Scene(root, 500, 500);
        this.primaryStage.setScene(scene);
        this.primaryStage.setTitle("unit-factory-ucode-dino");
        this.primaryStage.setResizable(false);
        this.primaryStage.centerOnScreen();
        this.primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}