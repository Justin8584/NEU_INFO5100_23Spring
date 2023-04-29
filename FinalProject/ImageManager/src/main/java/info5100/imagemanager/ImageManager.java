package info5100.imagemanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*
* Here is the ImageManager, which serve as the Modal purpose in MVC Design Pattern.
* Generate the JavaFx Scene and launch the application
* */
public class ImageManager extends Application {
    // static variable of type `Scene`, which holds the JavaFX scene.
    public static Scene scene;

    // overridden start method which is called every time, runs image manager
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ImageManager.class.getResource("imagemanager-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 354, 398); // sets scene size, width and height
        stage.setTitle("INFO5100-Final Image Manager"); // JavaFX scene title
        stage.setScene(scene);
        stage.show();
    }

    // main method for launch the image manager
    public static void main(String[] args) {
        launch();
    }
}
