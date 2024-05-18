package finalprog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class ControllerAuth {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonAuth;

    @FXML
    private TextField FieldMail;

    @FXML
    private PasswordField GetPassword;

    @FXML
    void butAuth(ActionEvent event) throws IOException {
        Window window = ButtonAuth.getScene().getWindow();
        window.hide();
        App.setRoot("LNWP");
    }

    @FXML
    void fieldMail(ActionEvent event) {

    }

    @FXML
    void getPassword(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

}
