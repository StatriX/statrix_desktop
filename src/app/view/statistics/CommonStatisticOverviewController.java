package app.view.statistics;

import app.model.GeneralStatistic;
import app.model.Person;
import app.service.SiteService;
import app.service.SiteServiceImpl;
import app.service.StatisticService;
import app.service.StatisticServiceImp;
import app.view.confirmation.ManageConfirmation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.util.List;

public class CommonStatisticOverviewController implements ManageConfirmation {

    private Stage dialogStage;
    private Overview overview;
    private StatisticService statisticService = new StatisticServiceImp();
    private SiteService siteService = new SiteServiceImpl();

    @FXML
    private TableView<GeneralStatistic> commonStatistics;
    @FXML
    private TableColumn<GeneralStatistic, String> personsName;
    @FXML
    private TableColumn<GeneralStatistic, Number> ratingPerson;
    @FXML
    private TableColumn<GeneralStatistic, String> sitesName;
    @FXML
    private Button closeButton;

    void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    void setOverview(Overview overview) {
        this.overview = overview;
    }

    void setPersonsList(List<Person> personsList) {
        commonStatistics.setItems(statisticService.generalStatistic(siteService.getAll(), personsList));
    }

    @FXML
    private void initialize() {
        personsName.setCellValueFactory(cellData -> cellData.getValue().personNameProperty());
        ratingPerson.setCellValueFactory(cellData -> cellData.getValue().valueProperty());
        sitesName.setCellValueFactory(cellData -> cellData.getValue().siteNameProperty());
    }

    @FXML
    public void closeModalWindow() {
        onExitButtonFromWindow(closeButton);
    }
}
