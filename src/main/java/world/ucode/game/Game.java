package world.ucode.game;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import world.ucode.window.GameWindow;

public class Game {
    protected Pane root = new Pane();
    protected Stage primaryStage;

    /**
     * @param primaryStage
     */
    Game(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void start() {
        primaryStage.setScene(new GameWindow(this.root).create());
        new Sun(root);
        new Cloud(root);
        new Score(root);
        new Ground(root);
        new Dino(root);
        primaryStage.centerOnScreen();
        root.setStyle("-fx-background-color: linear-gradient(to bottom, #C0C0C0, #ffffff);");
    }

}
