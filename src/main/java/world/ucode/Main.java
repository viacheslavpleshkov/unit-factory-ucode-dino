package world.ucode;

import javafx.application.Application;
import world.ucode.game.Menu;
import world.ucode.window.MainWindow;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    /**
     * Start program
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        primaryStage.setScene(new MainWindow(pane).create());
        primaryStage.setTitle("unit-factory-ucode-dino");
        primaryStage.getIcons().add(new Image("Dino-stand.png"));
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
        new Menu(pane, primaryStage);
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
