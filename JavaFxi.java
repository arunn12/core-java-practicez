package javafxi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class JavaFxi extends Application {

    @Override
    public void start(Stage p) throws Exception {
        p.setTitle("Java FX");
        Button b1 = new Button("java");
        Button b2 = new Button("java se");
        Button b3 = new Button("java fx");
        Button b4 = new Button("java ee");
        Button b5 = new Button("java db");

        TilePane t = new TilePane();
        t.getChildren().add(b1);
        t.getChildren().add(b2);
        t.getChildren().add(b3);
        t.getChildren().add(b4);
        t.getChildren().add(b5);

        Scene s = new Scene(t, 300, 100);
        p.setScene(s);
        p.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
