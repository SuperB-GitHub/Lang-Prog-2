module laba {
    requires javafx.controls;
    requires javafx.fxml;

    opens laba to javafx.fxml;
    exports laba;
}
