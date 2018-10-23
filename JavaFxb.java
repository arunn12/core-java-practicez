package javafxb;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JavaFxb extends Application {

    @Override
    public void start(Stage s) {
        Label label = new Label("Hello world,java fx");
        Scene scene = new Scene(label, 300, 100);
        s.setTitle("JavaFX Scene");
        s.setScene(scene);
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
