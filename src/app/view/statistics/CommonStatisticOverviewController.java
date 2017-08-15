package app.view.statistics;

import app.model.Person;
import app.view.confirmation.ManageConfirmation;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class CommonStatisticOverviewController implements ManageConfirmation {

    private Stage dialogStage;
    private ObservableList<Person> selectedPersons;
    private CommonStatisticOverview commonStatisticOverview;

    @FXML
    private TableView commonStatistics;
    @FXML
    private TableColumn<Person, String> personsName;
    @FXML
    private Button closeButton;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setSelectedPersons(ObservableList<Person> selectedPersons) {
        this.selectedPersons = selectedPersons;
    }

    public void setCommonStatisticOverview(CommonStatisticOverview commonStatisticOverview) {
        this.commonStatisticOverview = commonStatisticOverview;

        commonStatistics.setItems(selectedPersons);
        System.out.println(selectedPersons);
    }

    @FXML
    private void initialize() {
        personsName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
    }

    @FXML
    public void closeModalWindow() {
        onExitButtonFromWindow(closeButton);
    }
}
