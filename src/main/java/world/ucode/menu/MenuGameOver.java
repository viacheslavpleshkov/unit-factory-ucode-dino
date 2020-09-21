package world.ucode.menu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import world.ucode.game.Game;
import world.ucode.window.MainGameOverWindow;

public class MenuGameOver {
    public Stage primaryStage;
    public Pane pane =  new Pane();

    public MenuGameOver(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.init();
    }
    /**
     * Start
     */
    public void start() {
        primaryStage.setScene(new MainGameOverWindow(this.pane).create());
        primaryStage.centerOnScreen();
        pane.setStyle("-fx-background-color: linear-gradient(to bottom, #C0C0C0, #ffffff);");
    }
    /**
     * Game Over Dino
     *
     * @return Label
     */
    public Label label() {
        Label label = new Label();

        label.setText("Game Over");
        label.setStyle("-fx-font-family: 'Press Start 2P'; -fx-font-size: 25; -fx-text-fill: #535353;");
        label.setLayoutX(150);
        label.setLayoutY(50);

        return label;
    }
    /**
     * Start button
     *
     * @return Button
     */
    public Button startBtn() {
        ImageView restartIm = new ImageView(new Image("Game_restart.png"));
        Button startBtn = new Button("Retry", restartIm);
        startBtn.setLayoutY(200);
        startBtn.setLayoutX(140);
        startBtn.setStyle("-fx-font-family: 'Press Start 2P'; -fx-background-color: transparent; -fx-min-width: 170; -fx-min-height: 25; -fx-text-fill: #535353; -fx-font-size: 20;");
        startBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new Game(primaryStage).start();
            }
        });

        return startBtn;
    }
    /**
     * Installation
     */
    protected void init() {
        this.pane.setStyle("-fx-background-color: linear-gradient(to bottom, #C0C0C0, #ffffff);");
        pane.getStylesheets().add("https://fonts.googleapis.com/css2?family=Press+Start+2P&display=swap");
        this.pane.getChildren().add(this.label());
        this.pane.getChildren().add(this.startBtn());
    }
}
