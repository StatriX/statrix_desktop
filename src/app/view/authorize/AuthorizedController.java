package app.view.authorize;

import app.Authorize;
import app.GeneralApp;
import app.RegistrationForm;
import app.model.User;
import app.service.UserService;
import app.service.UserServiceImpl;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AuthorizedController {

    private static Stage stage;
    private Authorize authorize;
    private UserService userService = new UserServiceImpl();

    @FXML
    private TextField userNameField;
    @FXML
    private PasswordField password;

    public void setAuthorize(Authorize authorize) {
        this.authorize = authorize;

        stage = authorize.getPrimaryStage();
    }

    public void startGeneralApp() {
        if (isInputValidLogin()) {
            GeneralApp generalApp = new GeneralApp();
            try {
                generalApp.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }

            stage.close();
        }
    }

    public void registrationForm() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        stage.close();
    }

    public void cancelAction() {
        stage.close();
    }

    public boolean isInputValidLogin() {
        String errorMessage = "";
        if (userNameField.getText() == null || userNameField.getText().length() == 0) {
            errorMessage += "Введите имя пользователя.\n";
        }

        if (password.getText() == null || password.getText().length() == 0) {
            errorMessage += "Введите пароль.\n";
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Внимание!");
            alert.setHeaderText(null);
            alert.setContentText(errorMessage);

            alert.showAndWait();
            return false;
        }

    }
}
