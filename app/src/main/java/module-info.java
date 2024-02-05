module code {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens code to javafx.fxml;
    exports code;
}
