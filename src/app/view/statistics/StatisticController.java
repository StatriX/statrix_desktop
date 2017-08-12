package app.view.statistics;

import app.model.Person;
import app.service.PersonService;
import app.service.PersonServiceImpl;
import app.view.ModalWindows;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Predicate;

public class StatisticController implements ModalWindows, Initializable {

    private PersonService personService = new PersonServiceImpl();

    @FXML
    private ListView<Person> personsList;

    @FXML
    public Button showCommonStatistic;

    @FXML
    private Button showEverydayStatistic;

    public StatisticController() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        personsList.setItems(personService.getAll());
    }

    @FXML
    public void showWindowStatistic(ActionEvent actionEvent) {

        String fileName = null;

        if (showCommonStatistic.isFocused()) {
            fileName = "/statistics/CommonStatistic.fxml";
            onShowModalWindow(actionEvent,fileName, "Общая статистика");
        } else if (showEverydayStatistic.isFocused()) {
            fileName = "/statistics/EverydayStatistic.fxml";
            onShowModalWindow(actionEvent, fileName, "Ежедневная статистика");
        }
    }
}
