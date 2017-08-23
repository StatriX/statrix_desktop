package app.view.statistics;

import app.model.PeriodicalStatistic;
import app.model.Person;
import app.model.Site;
import app.service.*;
import app.view.confirmation.ManageConfirmation;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EverydayStaisticOverviewController implements ManageConfirmation {

    private SiteService siteService = new SiteServiceImpl();
    private PersonService personService = new PersonServiceImpl();
    private StatisticService statisticService = new StatisticServiceImp();

    @FXML
    private DatePicker endDate;
    @FXML
    private DatePicker beginDate;
    @FXML
    private Button cancelButton;
    @FXML
    private TableView<PeriodicalStatistic> everydayStatisticTable;
    @FXML
    private TableColumn<PeriodicalStatistic, LocalDate> dailyDate;
    @FXML
    private TableColumn<PeriodicalStatistic, String> personName;
    @FXML
    private TableColumn<PeriodicalStatistic, Integer> rating;
    @FXML
    private ChoiceBox<String> sitesList;

    @FXML
    void initialize() {
        sitesList.setValue(siteService.getAllSitesName().get(0));
        sitesList.setItems(siteService.getAllSitesName());

        dailyDate.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getDate()));
        personName.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getPerson()));
        rating.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getValue()));
    }

    public void confirmSelection() {
        ObservableList<PeriodicalStatistic> statistic = statisticService.statisticByPeriod(sitesList.getValue(), beginDate.getValue(), endDate.getValue(), personService.getAll());
        everydayStatisticTable.setItems(statistic);
    }
}
