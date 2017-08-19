package app.view.statistics;

import app.model.GeneralStatistic;
import app.model.Person;
import app.model.Site;
import app.service.StatisticService;
import app.service.StatisticServiceImp;
import app.view.confirmation.ManageConfirmation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.util.List;
import java.util.Map;

public class CommonStatisticOverviewController implements ManageConfirmation {

    private Stage dialogStage;
    private Overview overview;
    private List<Person> selectedPersons;
    private List<Site> selectedSites;
    private StatisticService statisticService = new StatisticServiceImp();

    @FXML
    private TableView<Person> commonStatistics;
    @FXML
    private TableColumn<Person, String> personsName;
    @FXML
    private Button closeButton;

    void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    void setSelectedPersons(List<Person> selectedPersons) {
        this.selectedPersons = selectedPersons;

    }

    public void setSelectedSites(List<Site> selectedSites) {
        this.selectedSites = selectedSites;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;

        commonStatistics.setItems(FXCollections.observableList(selectedPersons));
    }

    public ObservableMap<GeneralStatistic, Integer> getListMap() {
        return statisticService.generalStatistic(selectedSites, selectedPersons);
    }

    public void getTableView() {
        for (Map.Entry<GeneralStatistic, Integer> value : getListMap().entrySet()) {
            System.out.println(value.getKey().getSiteName() + " " + value.getKey().getPersonName() + " " + value.getValue());
        }
    }

    @FXML
    private void initialize() {

        /*for (Map.Entry<GeneralStatistic, Integer> value :
                getListMap().entrySet()) {
            System.out.println(value.getKey() + " " + value.getValue());
        }
        System.out.println(getListMap());*/
//        personsName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
    }

    @FXML
    public void closeModalWindow() {
        onExitButtonFromWindow(closeButton);
    }
}
