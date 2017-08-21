package app.view.statistics;

import app.model.GeneralStatistic;
import app.model.Person;
import app.service.*;
import app.view.confirmation.ManageConfirmation;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.List;

public class CommonStatisticOverviewController implements ManageConfirmation {

    private StatisticService statisticService = new StatisticServiceImp();
    private SiteService siteService = new SiteServiceImpl();
    private PersonService personService = new PersonServiceImpl();

    @FXML
    private TableView<Person> personsTableList;
    @FXML
    private TableColumn<Person, String> personsList;
    @FXML
    private TableView<GeneralStatistic> commonStatistics;
    @FXML
    private TableColumn<GeneralStatistic, String> personsName;
    @FXML
    private TableColumn<GeneralStatistic, Number> ratingPerson;
    @FXML
    private TableColumn<GeneralStatistic, String> sitesName;

    @FXML
    private void initialize() {
        personsName.setCellValueFactory(cellData -> cellData.getValue().personNameProperty());
        ratingPerson.setCellValueFactory(cellData -> cellData.getValue().valueProperty());
        sitesName.setCellValueFactory(cellData -> cellData.getValue().siteNameProperty());

        personsList.setCellValueFactory(cellData -> cellData.getValue().nameProperty());

        personsTableList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        personsTableList.setItems(personService.getAll());
    }

    public void ConfirmSelectedPersons() {
        ObservableList<Person> selectedPersons = personsTableList.getSelectionModel().getSelectedItems();
        if (selectedPersons.size() != 0) {
            commonStatistics.setItems(statisticService.generalStatistic(siteService.getAll(), selectedPersons));
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Внимание!");
            alert.setHeaderText("Нет выбранных личностей!");
            alert.setContentText("Пожалуйста, выберите одну или несколько личностей.");

            alert.showAndWait();
        }
    }
}
