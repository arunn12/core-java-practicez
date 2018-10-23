package javafxe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFxe extends Application {

    @Override
    public void start(Stage p) {
        p.setTitle("JAVA FX MENU");
        MenuItem m1 = new MenuItem("add");
        MenuItem m2 = new MenuItem("sub");
        MenuItem m3 = new MenuItem("div");
        MenuButton menuButton = new MenuButton("Options", null, m1, m2, m3);
        HBox hbox = new HBox(menuButton);
        Scene s = new Scene(hbox, 200, 100);
        p.setScene(s);
        p.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
