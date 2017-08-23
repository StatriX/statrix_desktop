package app.view.registration;

import app.Authorize;
import app.RegistrationForm;
import app.model.User;
import app.service.UserService;
import app.service.UserServiceImpl;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrationController {

    private static Stage stage;
    private static UserService userService;

    static {
        userService = new UserServiceImpl();
    }

    @FXML
    private TextField userNameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private PasswordField retryPasswordTextField;

    public void setRegistrationForm(RegistrationForm registrationForm) {
        stage = registrationForm.getPrimaryStage();
    }

    public void registrationButton() {
        if (isInputValid()) {
            User user =new User(userNameTextField.getText(), passwordTextField.getText(), emailTextField.getText(), true);
            userService.save(user);

            returnToAuthorize();
        }
    }

    public void cancelButton() {
        returnToAuthorize();
    }

    public boolean isInputValid() {
        String errorMessage = "";

        if (userNameTextField.getText() == null || userNameTextField.getText().length() == 0) {
            errorMessage += "Поле \"Имя пользователя\" не заполнено.\n";
        }

        if (emailTextField.getText() == null || emailTextField.getText().length() == 0) {
            errorMessage += "Поле \"e-mail\" не заполнено.\n";
        }

        if (passwordTextField.getText() == null || passwordTextField.getText().length() == 0) {
            errorMessage += "Поле \"Пароль\" не заполнено.\n";
        }

        if (retryPasswordTextField.getText() == null || retryPasswordTextField.getText().length() == 0 || !retryPasswordTextField.getText().equals(passwordTextField.getText())) {
            errorMessage += "Пароли не совпадают.\n";
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

    public void returnToAuthorize() {
        Authorize authorize = new Authorize();
        try {
            authorize.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        stage.close();
    }
}
