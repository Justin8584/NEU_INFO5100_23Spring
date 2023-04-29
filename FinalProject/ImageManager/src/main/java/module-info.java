module info5100.imagemanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires im4java;
    requires metadata.extractor;


    opens info5100.imagemanager to javafx.fxml;
    exports info5100.imagemanager;
}