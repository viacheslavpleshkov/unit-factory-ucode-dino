package world.ucode.game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Dino implements InterfaceDino {
    protected Pane root;
    protected Image dinoImgOne = new Image("Dino-stand.png");
    protected Image dinoImgTwo = new Image("Dino-stand.png");
    protected ImageView dinoViewOne = new ImageView(this.dinoImgOne);
    protected ImageView dinoViewTwo = new ImageView(this.dinoImgTwo);

    Dino(Pane pane){
        this.root = pane;
        dinoViewOne.setLayoutY(735);
        dinoViewOne.setLayoutX(10);
        root.getChildren().add(this.dinoViewOne);
    }
}
