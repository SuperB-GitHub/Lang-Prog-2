module laba {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens laba to javafx.fxml;
    exports laba;
}
