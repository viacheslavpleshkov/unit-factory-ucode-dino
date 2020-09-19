package world.ucode.game;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public interface InterfaceMenu {
    /**
     * Label Dino
     */
    public Label label();

    /**
     * Start button
     */
    public Button startBtn();

    /**
     * Result button
     */
    public Button resultsBtn();

    /**
     * Exit button
     */
    public Button exitBtn();

//    /**
//     * Installation
//     */
//    public void init();
}
