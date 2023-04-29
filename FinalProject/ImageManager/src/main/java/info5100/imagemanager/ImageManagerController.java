package info5100.imagemanager;

import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Tag;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;

import org.im4java.core.IMOperation;
import org.im4java.core.ConvertCmd;
import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Metadata;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/*
* In MVC Design Pattern, ImageManagerController serve as the Controller purpose,
* which control all the users' behavior, including open, convert, and save.
* Also, display the appropriate error message for some missing choices.
* */
public class ImageManagerController implements ImageManagerInterface {
    @FXML
    public Button load;
    public ImageView thumbnail;
    public ChoiceBox<String> choiceBox;
    public TextField textHeight;
    public TextField textWidth;
    public TextField textCamera;
    public TextField textLocation;
    private Image image;
    private IMOperation op;
    private ConvertCmd cmd;
    private File file;
    private String format;

    // overridden method `initialize`, that takes in two parameters: `location` and
    // `resources`.
    public void initialize(URL location, ResourceBundle resources) {

        // message displayed says a JavaFX `ChoiceBox`"Select the format you want to
        // convert" when hovering
        choiceBox.setTooltip(new Tooltip("Select the format you want to convert"));
    }

    @FXML
    private Image convertBufferedImage(BufferedImage bufferedImage) {
        WritableImage wr = null;
        if (bufferedImage != null) {
            wr = new WritableImage(bufferedImage.getWidth(), bufferedImage.getHeight());
            PixelWriter pw = wr.getPixelWriter();
            for (int x = 0; x < bufferedImage.getWidth(); x++) {
                for (int y = 0; y < bufferedImage.getHeight(); y++) {
                    pw.setArgb(x, y, bufferedImage.getRGB(x, y));
                }
            }
        }
        return new ImageView(wr).getImage();
    }

    // load image size with width and height
    private void loadImageSize() {
        textHeight.setText("" + image.getHeight()); // get height
        textWidth.setText("" + image.getWidth()); // get width
    }

    // load image camera and location (GPS Coordinates in Latitude and Longitude).
    private void loadImageLocationAndCamera() throws ImageProcessingException, IOException {
        Metadata metadata = ImageMetadataReader.readMetadata(file);
        String latitude = "";
        String longitude = "";
        for (Directory directory : metadata.getDirectories()) {
            for (Tag tag : directory.getTags()) {
                if (tag.getTagName().equals("Model")) { // get camera model
                    textCamera.setText(tag.getDescription());
                }
                if (tag.getTagName().equals("GPS Latitude")) { // get GPS Latitude
                    latitude = tag.getDescription();
                }
                if (tag.getTagName().equals("GPS Longitude")) { // get GPS Longitude
                    longitude = tag.getDescription();
                }
            }
        }
        // exception for missing camera and location info. Not Provided!
        if (longitude.isEmpty() || latitude.isEmpty()) {
            textLocation.setText("Not provided");
        } else {
            textLocation.setText(longitude + ", " + latitude);
        }
        if (textCamera.getText().trim().equals("")) {
            textCamera.setText("Not provided");
        }
    }

    // combine the image size, camera, and location methods for Image Info
    private void loadImageInfo() throws ImageProcessingException, IOException {
        loadImageSize();
        loadImageLocationAndCamera();
    }

    // first method implement interface, which for opening image, and load image
    // info.
    public void loadImage() {
        Scene scene = ImageManager.scene;
        FileChooser fileChooser = new FileChooser();

        // load image in all formats
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"));
        file = fileChooser.showOpenDialog(scene.getWindow());
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            // have some alert messages to user when they operate inappropriately
            if (bufferedImage == null || bufferedImage.getWidth() <= 0 || bufferedImage.getHeight() <= 0) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You should choose an image to proceed.");
                alert.showAndWait();
            } else {
                image = convertBufferedImage(bufferedImage);
                thumbnail.setImage(image);
                thumbnail.setPreserveRatio(false);
                thumbnail.setFitHeight(100); // follow requirement, set display image size to 100 in height
                thumbnail.setFitWidth(100); // follow requirement, set display image size to 100 in width
                loadImageInfo();
            }
        } catch (Exception e) {
            e.printStackTrace(); // catch and print exception in SerializationException
        }
    }

    // second method implement interface, which for converting image format
    public void convertImage() {
        format = (String) choiceBox.getValue();

        // error message for no import image, and also choose the image format would
        // like to convert
        if (file == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("You have to open an image first!");
            alert.showAndWait();
        } else if (format == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("You have to select a format to convert!");
            alert.showAndWait();
        }
        op = new IMOperation(); // create new instance of IMOperation
        cmd = new ConvertCmd();
        op.addImage(file.getAbsolutePath()); // follow the image path
        op.format(format); // convert to image chosen format
        System.out.println("Covert Successfully");
    }

    // third method implement interface, which for saving converted image in local
    // machine
    public void saveImage() {
        Scene scene = ImageManager.scene;
        FileChooser fileChooser = new FileChooser();

        // default saving path is the home directory, but can choose the desired
        // directory
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        File saveFile = fileChooser.showSaveDialog(scene.getWindow());
        String savePath = saveFile.getAbsolutePath();
        if (!savePath.endsWith(format)) {
            savePath += "." + format; // save the image with the chosen format
        }
        op.addImage(savePath);
        try {
            cmd.run(op); // run the method to save converted image
        } catch (Exception e) {
            e.printStackTrace(); // catch and print exception in SerializationException
        }
    }
}