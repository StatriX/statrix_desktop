package app.view.confirmation;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ConfirmationController implements ManageConfirmation {

    @FXML
    private Button cancelButton;

    @FXML
    public void confirmAction() {
        Platform.exit();
    }

    public void closeModalWindow() {
        onExitButtonFromWindow(cancelButton);
    }
}
