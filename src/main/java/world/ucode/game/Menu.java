package world.ucode.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Menu implements InterfaceMenu {
    public Stage primaryStage;
    public Pane pane;

    /**
     * Menu constructor
     *
     * @param pane
     * @param primaryStage
     */
    public Menu(Pane pane, Stage primaryStage) {
        this.pane = pane;
        this.primaryStage = primaryStage;
        this.init();
    }

    /**
     * Label Dino
     *
     * @return Label
     */
    @Override
    public Label label() {
        Label label = new Label();

        label.setText("Dino");
        label.setStyle("-fx-font: 45 arial;");
        label.setLayoutX(200);
        label.setLayoutY(50);

        return label;
    }

    /**
     * Start button
     *
     * @return Button
     */
    @Override
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
     * Result button
     *
     * @return Button
     */
    @Override
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
     * Exit button
     *
     * @return Button
     */
    @Override
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

    /**
     * Installation
     */
    protected void init() {
        this.pane.setStyle("-fx-background-color: linear-gradient(to bottom, #ff7f50, #6a5acd);");
        this.pane.getChildren().add(this.label());
        this.pane.getChildren().add(this.startBtn());
        this.pane.getChildren().add(this.resultsBtn());
        this.pane.getChildren().add(this.exitBtn());
    }
}
