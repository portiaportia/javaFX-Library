module library {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;
    requires junit;
    requires jlayer;
    requires software.amazon.awssdk.core;
    requires software.amazon.awssdk.services.polly;
    requires software.amazon.awssdk.regions;
    requires software.amazon.awssdk.utils;

    opens library to javafx.fxml;

    exports library;

    opens controllers to javafx.fxml;

    exports controllers;

    opens model to javafx.fxml;

    exports model;

    exports narriarator to javafx.fxml;

    opens narriarator;
}
