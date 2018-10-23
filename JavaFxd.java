package javafxd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFxd extends Application {

    @Override
    public void start(Stage s) throws Exception {
        s.setTitle("Java Fx Button");
        Button button = new Button("My world");
        Scene scene;
        scene = new Scene(button, 100, 100);
        s.setScene(scene);
        s.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
