package finalprog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class ControllerRegisterForWork {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButForCompany;

    @FXML
    private Button ButForNotWork;

    @FXML
    private Button ButtonRegister;

    @FXML
    private Button ButtonExit;

    @FXML
    private Label LabelError;

    @FXML
    private TextField FieldCity;

    @FXML
    private TextField FieldFIO;

    @FXML
    private TextField FieldMailComp;

    @FXML
    private TextField FieldNameComp;

    @FXML
    private TextField FieldPersMail;

    @FXML
    private PasswordField Password;

    @FXML
    void butForComp(ActionEvent event) throws IOException {
        // Window window = ButtonRegister.getScene().getWindow();
        // window.hide();

        ControllerStartPage.setRoot("RegisterForWork");
        // try {
        //     FXMLLoader loader = new FXMLLoader(App.class.getResource("RegisterForWork.fxml"));
        //     Scene scene = new Scene(loader.load(), 350, 675);  
        //     Stage stage = new Stage();
        //     stage.initStyle(StageStyle.UNDECORATED);
        //     stage.setScene(scene);
        //     stage.show();
        // } catch (Exception e) {
        //     System.err.println("Exception while loading stage Register");
        // }
    }

    @FXML
    void butNotWork(ActionEvent event) throws IOException {
        ControllerStartPage.setRoot("RegisterNotWork");

        // Window window = ButtonRegister.getScene().getWindow();
        // window.hide();
        // try {
        //     FXMLLoader loader = new FXMLLoader(App.class.getResource("RegisterNotWork.fxml"));
        //     Scene scene = new Scene(loader.load(), 350, 675);  
        //     Stage stage = new Stage();
        //     stage.initStyle(StageStyle.UNDECORATED);
        //     stage.setScene(scene);
        //     stage.show();
        // } catch (Exception e) {
        //     System.err.println("Exception while loading stage Register");
        // }
    }

    @FXML
    void butRegister(ActionEvent event) {
        Window window = ButtonRegister.getScene().getWindow();
        window.hide();
    }

    @FXML
    void butExit(ActionEvent event) {
        Window window = ButtonExit.getScene().getWindow();
        window.hide();
    }

    @FXML
    void fieldCity(ActionEvent event) {

    }

    @FXML
    void fieldFIO(ActionEvent event) {

    }

    @FXML
    void fieldMailComp(ActionEvent event) {

    }

    @FXML
    void fieldNameComp(ActionEvent event) {

    }

    @FXML
    void fieldPersMail(ActionEvent event) {

    }

    @FXML
    void getPassword(ActionEvent event) {

    }

    @FXML
    void initialize() {
        
    }

}
