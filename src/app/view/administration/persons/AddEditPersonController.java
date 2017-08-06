package app.view.administration.persons;

import app.view.confirmation.ManageConfirmation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AddEditPersonController implements ManageConfirmation {

    @FXML
    Button cancelButton;

    @FXML
    private void initialize() {
    }

    @FXML
    public void closeModalWindow() {
        onExitButtonFromWindow(cancelButton);
    }
}
