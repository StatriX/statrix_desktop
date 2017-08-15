package app.view.statistics;

import app.model.Person;
import app.model.Site;
import app.service.PersonService;
import app.service.PersonServiceImpl;
import app.service.SiteService;
import app.service.SiteServiceImpl;
import app.view.ModalWindows;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class StatisticController implements ModalWindows, Initializable {

    private PersonService personService = new PersonServiceImpl();
    private SiteService siteService = new SiteServiceImpl();
    private CommonStatisticOverview commonStatisticOverview = new CommonStatisticOverview();

    @FXML
    private TableView<Person> personsTable;
    @FXML
    private TableColumn<Person, String> personsName;

    @FXML
    private TableView<Site> sitesTable;
    @FXML
    TableColumn<Site, String> sitesName;

    @FXML
    public Button showCommonStatistic;

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

    @FXML
    public void showWindowStatistic(ActionEvent actionEvent) {
        ObservableList<Person> selectedPersons = personsTable.getSelectionModel().getSelectedItems();
        if (selectedPersons.size() != 0) {
            commonStatisticOverview.showCommonStatistic(actionEvent, selectedPersons);
        }

//        String fileName;
//
//        if (showCommonStatistic.isFocused()) {
//            fileName = "/statistics/CommonStatistic.fxml";
//            onShowModalWindow(actionEvent,fileName, "Общая статистика");
//        } else if (showEverydayStatistic.isFocused()) {
//            fileName = "/statistics/EverydayStatistic.fxml";
//            onShowModalWindow(actionEvent, fileName, "Ежедневная статистика");
//        }
    }
}
