package javafxj;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFxj extends Application {

    @Override
    public void start(Stage p) throws Exception {
        p.setTitle("JAVA FX");
        Button b1 = new Button("CSE");
        Button b2 = new Button("IT");
        Button b3 = new Button("MECH");
        Button b4 = new Button("CIVIL");
        Button b5 = new Button("EEE");
        Button b6 = new Button("ECE");

        GridPane g = new GridPane();
        g.add(b1, 0, 0, 1, 1);
        g.add(b2, 1, 0, 1, 1);
        g.add(b3, 2, 0, 1, 1);
        g.add(b4, 0, 1, 1, 1);
        g.add(b5, 1, 1, 1, 1);
        g.add(b6, 2, 1, 1, 1);
        Scene scene = new Scene(g, 240, 100);
        p.setScene(scene);
        p.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
