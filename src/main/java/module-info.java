module ict.methodologies {
    requires javafx.controls;
    requires javafx.fxml;

    opens ict.methodologies to javafx.fxml;
    exports ict.methodologies;
    exports ict.methodologies.controllers;
    opens ict.methodologies.controllers to javafx.fxml;
}