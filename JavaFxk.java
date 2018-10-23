package javafxk;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFxk extends Application {

    @Override
    public void start(Stage s) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 200);
        Rectangle r = new Rectangle(35, 35, 150, 150);
        r.setFill(Color.BLUE);
        root.getChildren().add(r);
        s.setTitle("JavaFX");
        s.setScene(scene);
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
