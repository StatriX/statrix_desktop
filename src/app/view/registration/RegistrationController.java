package app.view.registration;

import app.Authorize;
import app.RegistrationForm;
import javafx.stage.Stage;

public class RegistrationController {

    private static Stage stage;
    private RegistrationForm registrationForm;

    public void setRegistrationForm(RegistrationForm registrationForm) {
        this.registrationForm = registrationForm;

        stage = registrationForm.getPrimaryStage();
    }

    public void registrationButton() {
        cancelButton();
    }

    public void cancelButton() {
        Authorize authorize = new Authorize();
        try {
            authorize.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        stage.close();
    }
}
