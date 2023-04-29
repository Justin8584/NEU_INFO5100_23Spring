package info5100.imagemanager;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

// extends the Initializable interface, preparing required methods for imageController
public interface ImageManagerInterface extends Initializable {

    // extend Initializable Interface, override the initialize function
    @Override
    default void initialize(URL location, ResourceBundle resources) {
    }

    // prepare method for opening image
    default void loadImage() {

    }

    // prepare method for convert image format
    default void convertImage() {

    }

    // prepare method for saving image
    default void saveImage() {

    }

}
