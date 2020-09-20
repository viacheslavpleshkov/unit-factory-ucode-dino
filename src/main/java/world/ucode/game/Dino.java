package world.ucode.game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Dino implements InterfaceDino {
    protected Pane root;
    protected Image dinoImg = new Image("Dino-left-up.png");
    protected ImageView dinoView = new ImageView(this.dinoImg);

    Dino(Pane pane) {
        this.root = pane;
        dinoView.setLayoutY(720);
        dinoView.setLayoutX(10);
        this.run();
        this.root.getChildren().add(dinoView);
    }

    public void run() {
        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(200), new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent t) {
                        dinoView.setImage(new Image("Dino-left-up.png"));
                    }
                }),
                new KeyFrame(Duration.millis(400), new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent t) {
                        dinoView.setImage(new Image("Dino-right-up.png"));
                    }
                })
        );
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
    }

    public void jump() {

    }
}
