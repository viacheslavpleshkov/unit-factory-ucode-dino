package world.ucode.game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Score {
    protected Pane root;
    protected Text score = new Text(970, 30, "Score: 00000");
    private int counter = 0;

    public Score(Pane pane) {
        this.root = pane;
        this.score.setStyle("-fx-font-family: 'Press Start 2P'; -fx-font-size: 16; -fx-text-fill: #535353;");
        root.getChildren().add(this.score);
        this.time();
    }

    protected void time() {
        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent t) {
                        counter++;
                        score.setText("Score: " + String.format("%05d", counter));
                    }
                })
        );
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
    }

}
