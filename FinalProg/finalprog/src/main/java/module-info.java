module finalprog {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens finalprog to javafx.fxml;
    exports finalprog;
}
