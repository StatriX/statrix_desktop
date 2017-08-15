package app.view.statistics;

import app.model.Person;
import app.model.Site;
import app.view.confirmation.ManageConfirmation;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.util.List;

public class CommonStatisticOverviewController implements ManageConfirmation {

    private Stage dialogStage;
    private Overview overview;
    private ObservableList<Person> selectedPersons;
    private List<Site> selectedSites;

    @FXML
    private TableView commonStatistics;
    @FXML
    private TableColumn<Person, String> personsName;
    @FXML
    private Button closeButton;

    void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    void setSelectedPersons(ObservableList<Person> selectedPersons) {
        this.selectedPersons = selectedPersons;
    }

    public void setSelectedSites(List<Site> selectedSites) {
        this.selectedSites = selectedSites;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;

        commonStatistics.setItems(selectedPersons);
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
