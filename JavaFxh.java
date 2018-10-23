package javafxh;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFxh extends Application {

    @Override
    public void start(Stage p) throws Exception {
        p.setTitle("JAVA FX");
        Button b1 = new Button("java");
        Button b2 = new Button("java fx");
        Button b3 = new Button("java se");
        FlowPane fp = new FlowPane();
        fp.getChildren().add(b1);
        fp.getChildren().add(b2);
        fp.getChildren().add(b3);
        Scene s = new Scene(fp, 200, 100);
        p.setScene(s);
        p.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
