package javafxg;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxg extends Application {

    @Override
    public void start(Stage p) throws Exception {
        p.setTitle("Java FX");
        Button b1 = new Button("java");
        Button b2 = new Button("java fx");
        VBox vbox = new VBox(b1, b2);
        Scene scene = new Scene(vbox, 300, 200);
        p.setScene(scene);
        p.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
