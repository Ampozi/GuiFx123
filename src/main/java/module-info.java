module com.example.guifx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens com.example.guifx to javafx.fxml;
    exports com.example.guifx;
}