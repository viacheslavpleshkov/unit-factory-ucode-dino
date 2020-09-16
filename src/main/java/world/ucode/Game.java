package world.ucode;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game {

    public Stage primaryStage;

    /**
     *
     * @param primaryStage
     */
    Game(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void start(){
        Pane root = new Pane();
        root.setStyle("-fx-background-color: linear-gradient(to bottom, #ff7f50, #6a5acd);");
        Scene scene = new Scene(root, 1500, 800);
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
    }

}
