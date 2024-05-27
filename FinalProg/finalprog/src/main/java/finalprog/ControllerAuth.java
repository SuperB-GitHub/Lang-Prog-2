package finalprog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Button ButtonExit;

    @FXML
    private TextField FieldMail;

    @FXML
    private Label LabelError;

    @FXML
    private PasswordField GetPassword;

    @FXML
    void butAuth(ActionEvent event) throws IOException {
        String login = FieldMail.getText().trim();
        String pass = GetPassword.getText().trim();
            if (!login.equals("") && !pass.equals("")){
                    Window window = ButtonAuth.getScene().getWindow();
                    window.hide();
                    App.setRoot("LNWP");
                }
            else {LabelError.setVisible(true);}
    }

    @FXML
    void fieldMail(ActionEvent event) {

    }

    @FXML
    void getPassword(ActionEvent event) {

    }

    @FXML
    void butExit(ActionEvent event) {
        Window window = ButtonAuth.getScene().getWindow();
        window.hide();
    }

    @FXML
    void initialize() {

    }

}
