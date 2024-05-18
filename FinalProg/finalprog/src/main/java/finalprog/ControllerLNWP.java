package finalprog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Window;

public class ControllerLNWP {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label AboutCity;

    @FXML
    private Label AboutFIO;

    @FXML
    private Button CloseLaunch;

    @FXML
    private Label LabelFIO;

    @FXML
    private Label LabelSpec;

    @FXML
    private Button Offers;

    @FXML
    private Button Profile;

    @FXML
    private Button Vacancies;

    @FXML
    void butOffers(ActionEvent event) throws IOException {
        App.setRoot("LNWO");
    }

    @FXML
    void butProfile(ActionEvent event) throws IOException {
        App.setRoot("LNWP");
    }

    @FXML
    void butVacancies(ActionEvent event) throws IOException {
        App.setRoot("LNWV");
    }

    @FXML
    void clslaunch(ActionEvent event) {
        Window window = CloseLaunch.getScene().getWindow();
        window.hide();
    }

    @FXML
    void initialize() {

    }

}
