package app.view.confirmation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ConfirmationController implements ManageConfirmation {

    @FXML
    private Button cancelButton;

    @FXML
    public void confirmAction() {
        System.exit(0);
    }

    public void closeModalWindow() {
        onExitButtonFromWindow(cancelButton);
    }
}
