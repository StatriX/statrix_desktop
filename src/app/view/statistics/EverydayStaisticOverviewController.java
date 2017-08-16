package app.view.statistics;

import app.model.Site;
import app.view.confirmation.ManageConfirmation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class EverydayStaisticOverviewController implements ManageConfirmation {

    @FXML
    public Button cancelButton;
    @FXML
    private ChoiceBox<Site> siteListChoiceBox;

    public void closeModalWindow(ActionEvent actionEvent) {
        onExitButtonFromWindow(cancelButton);
    }
}
