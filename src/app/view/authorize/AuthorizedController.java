package app.view.authorize;

import app.Authorize;
import app.GeneralApp;
import app.RegistrationForm;
import javafx.stage.Stage;

public class AuthorizedController {

    private Authorize authorize;
    private static Stage stage;

    public void setAuthorize(Authorize authorize) {
        this.authorize = authorize;

        stage = authorize.getPrimaryStage();
    }

    public void startGeneralApp() {
        GeneralApp generalApp = new GeneralApp();
        try {
            generalApp.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        stage.close();
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
}
