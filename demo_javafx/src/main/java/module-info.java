module org.fai.example.demo_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.fai.example.demo_javafx to javafx.fxml;
    exports org.fai.example.demo_javafx;
}