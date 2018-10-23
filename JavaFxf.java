package javafxf;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFxf extends Application {

    @Override
    public void start(Stage p) throws Exception {
        p.setTitle("Java Fx");
        TextField textField = new TextField();
        HBox hbox = new HBox(textField);
        Scene scene = new Scene(hbox, 200, 100);
        p.setScene(scene);
        p.show();
    }
}
