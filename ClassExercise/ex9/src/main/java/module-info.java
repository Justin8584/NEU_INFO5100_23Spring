module com.example.ex9 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ex9 to javafx.fxml;
    exports com.example.ex9;
}