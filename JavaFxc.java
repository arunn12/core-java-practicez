package javafxc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class JavaFxc extends Application {

    @Override
    public void start(Stage p) throws Exception {
        p.setTitle("ImageView");
        FileInputStream input = new FileInputStream("G:\\nila.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        HBox hbox = new HBox(imageView);
        Scene scene = new Scene(hbox, 100, 100);
        p.setScene(scene);
        p.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
