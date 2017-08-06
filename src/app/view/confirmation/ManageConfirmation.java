package app.view.confirmation;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public interface ManageConfirmation {

    default void onExitButtonFromWindow(Button button) {
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }
}
