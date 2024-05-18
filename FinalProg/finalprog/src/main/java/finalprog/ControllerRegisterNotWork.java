package finalprog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class ControllerRegisterNotWork {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButForCompany;

    @FXML
    private Button ButForNotWork;

    @FXML
    private RadioButton ButMan;

    @FXML
    private RadioButton ButWoman;

    @FXML
    private Button ButtonRegister;

    @FXML
    private TextField FieldCity;

    @FXML
    private DatePicker FieldDate;

    @FXML
    private TextField FieldFIO;

    @FXML
    private TextField FieldMail;

    @FXML
    private TextField FieldSpec;

    @FXML
    private TextField FieldTrain;

    @FXML
    private PasswordField Password;

    @FXML
    void butForComp(ActionEvent event) throws IOException {
        Window window = ButtonRegister.getScene().getWindow();
        window.hide();
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("RegisterForWork.fxml"));
            Scene scene = new Scene(loader.load(), 350, 675);  
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.err.println("Exception while loading stage Register");
        }
    }

    @FXML
    void butNotWork(ActionEvent event) throws IOException {
        App.setRoot("RegisterNotWork");Window window = ButtonRegister.getScene().getWindow();
        window.hide();
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("RegisterNotWork.fxml"));
            Scene scene = new Scene(loader.load(), 350, 675);  
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.err.println("Exception while loading stage Register");
        }
    }

    @FXML
    void butRegister(ActionEvent event) throws IOException {
        Window window = ButtonRegister.getScene().getWindow();
        window.hide();
        App.setRoot("LNWP");
    }

    @FXML
    void butWoman(ActionEvent event) {

    }

    @FXML
    void butMan(ActionEvent event) {

    }

    @FXML
    void fieldCity(ActionEvent event) {

    }

    @FXML
    void fieldDate(ActionEvent event) {

    }

    @FXML
    void fieldFIO(ActionEvent event) {

    }

    @FXML
    void fieldMail(ActionEvent event) {

    }

    @FXML
    void fieldSpec(ActionEvent event) {

    }

    @FXML
    void fieldTrain(ActionEvent event) {

    }

    @FXML
    void getPassword(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert ButForCompany != null : "fx:id=\"ButForCompany\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert ButForNotWork != null : "fx:id=\"ButForNotWork\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert ButMan != null : "fx:id=\"ButMan\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert ButWoman != null : "fx:id=\"ButWoman\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert ButtonRegister != null : "fx:id=\"ButtonRegister\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert FieldCity != null : "fx:id=\"FieldCity\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert FieldDate != null : "fx:id=\"FieldDate\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert FieldFIO != null : "fx:id=\"FieldFIO\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert FieldMail != null : "fx:id=\"FieldMail\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert FieldSpec != null : "fx:id=\"FieldSpec\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert FieldTrain != null : "fx:id=\"FieldTrain\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";
        assert Password != null : "fx:id=\"Password\" was not injected: check your FXML file 'RegisterNotWork.fxml'.";

    }

}
