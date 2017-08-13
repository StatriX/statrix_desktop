package app.view.administration.users;

import app.view.confirmation.ManageConfirmation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AddEditUserController implements ManageConfirmation {

    @FXML
    private Button cancelButton;

    @FXML
    public void cancelClick() {
        onExitButtonFromWindow(cancelButton);
    }
}
