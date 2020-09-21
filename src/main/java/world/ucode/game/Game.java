package world.ucode.game;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import world.ucode.window.GameWindow;

public class Game {
    protected Pane root = new Pane();
    protected Stage primaryStage;
    public Dino dino = new Dino(this.root);
    /**
     * @param primaryStage
     */
    Game(Stage primaryStage) {
        this.primaryStage = primaryStage;
        new Sun(root);
        new Cloud(root);
        new Score(root);
        new Ground(root);
        new Cactus(root);
        this.event();
    }
    public void start() {
        primaryStage.setScene(new GameWindow(this.root).create());
        event();
        primaryStage.centerOnScreen();
        root.setStyle("-fx-background-color: linear-gradient(to bottom, #C0C0C0, #ffffff);");
    }

    private void event() {
        primaryStage.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            public void handle(KeyEvent key) {
                if (key.getCode() == KeyCode.SPACE)
                    dino.animationTimer.start();
            }
        });
    }
}
