module finalprog {
    requires javafx.controls;
    requires javafx.fxml;

    opens finalprog to javafx.fxml;
    exports finalprog;
}
