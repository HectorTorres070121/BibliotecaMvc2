module com.example.bibliotecamvc2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bibliotecamvc2 to javafx.fxml;
    exports com.example.bibliotecamvc2;
    exports com.example.bibliotecamvc2.Model;
    opens com.example.bibliotecamvc2.Model to javafx.fxml;
}