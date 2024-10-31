module library {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;
    requires junit;

    opens library to javafx.fxml;

    exports library;

    opens controllers to javafx.fxml;

    exports controllers;

    opens model to javafx.fxml;

    exports model;
}
