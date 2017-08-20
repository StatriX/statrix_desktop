package app.view.statistics;

import app.model.Person;
import app.model.Site;
import app.service.PersonService;
import app.service.PersonServiceImpl;
import app.service.SiteService;
import app.service.SiteServiceImpl;
import app.view.ModalWindows;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class StatisticController implements ModalWindows, Initializable {

    private PersonService personService = new PersonServiceImpl();
    private SiteService siteService = new SiteServiceImpl();
    private Overview overview = new Overview();
    private String title;
    private String fxmlFile;

    @FXML
    private TableView<Person> personsTable;
    @FXML
    private TableColumn<Person, String> personsName;

    @FXML
    private TableView<Site> sitesTable;
    @FXML
    TableColumn<Site, String> sitesName;

    @FXML
    private Button showCommonStatistic;

    @FXML
    private Button showEverydayStatistic;

    public StatisticController() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        personsName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        sitesName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());

        personsTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        sitesTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        personsTable.setItems(personService.getAll());
        sitesTable.setItems(siteService.getAll());
    }

    private void selectedStatisticFile() {
        if (showCommonStatistic.isFocused()) {
            fxmlFile = "/statistics/CommonStatistic.fxml";
            title = "Общая статистика";
        }

        if (showEverydayStatistic.isFocused()) {
            fxmlFile = "/statistics/EverydayStatistic.fxml";
            title = "Ежедневная статистика";
        }
    }

    @FXML
    public void showWindowStatistic(ActionEvent actionEvent) {
        List<Person> selectedPersons = personsTable.getSelectionModel().getSelectedItems();
//        List<Site> selectedSites = sitesTable.getSelectionModel().getSelectedItems();
        selectedStatisticFile();
        if (selectedPersons.size() != 0) {
            overview.showStatistic(actionEvent, selectedPersons, title, fxmlFile);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Нет выбранных личностей или сайтов");
            alert.setContentText("Выберите личности и сайты");
            alert.showAndWait();
        }
    }
}
