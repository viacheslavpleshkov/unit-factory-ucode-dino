package world.ucode.window;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class MainWindow implements Window {
    private Pane pane;

    /**
     * Constructor
     *
     * @param pane
     */
    public MainWindow(Pane pane) {
        this.pane = pane;
    }

    @Override
    public Scene create() {
        return new Scene(this.pane, 500, 500);
    }
}
