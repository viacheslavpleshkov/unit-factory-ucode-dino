package world.ucode;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Menu {
    public Stage primaryStage;

    /**
     *
     * @param primaryStage
     */
    Menu(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    /**
     *
     * @return
     */
    public Label label() {
        Label label = new Label();

        label.setText("Dino");
        label.setStyle("-fx-font: 45 arial;");
        label.setLayoutX(200);
        label.setLayoutY(50);

        return label;
    }

    /**
     *
     * @return
     */
    public Button startBtn() {
        Button startBtn = new Button();
        startBtn.setText("Start");
        startBtn.setLayoutX(200);
        startBtn.setLayoutY(200);
        startBtn.setStyle("-fx-background-color: #f0f0f0; -fx-min-width: 100; -fx-min-height: 25; -fx-font-size: 20");

        startBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                (new Game(primaryStage)).start();
            }
        });

        return startBtn;
    }

    /**
     *
     * @return
     */
    public Button resultsBtn() {
        Button ResultsBtn = new Button();

        ResultsBtn.setText("Results");
        ResultsBtn.setLayoutX(200);
        ResultsBtn.setLayoutY(250);
        ResultsBtn.setStyle("-fx-background-color: #f0f0f0; -fx-min-width: 100; -fx-min-height: 25; -fx-font-size: 20");

        ResultsBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Results");
            }
        });

        return ResultsBtn;
    }

    /**
     *
     * @return
     */
    public Button exitBtn() {
        Button exitBtn = new Button();
        exitBtn.setText("Exit");

        exitBtn.setLayoutX(200);
        exitBtn.setLayoutY(300);
        exitBtn.setStyle("-fx-background-color: #f0f0f0; -fx-min-width: 100; -fx-min-height: 25; -fx-font-size: 20");

        exitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        return exitBtn;
    }
}
