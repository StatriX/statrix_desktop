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
    public Button cancelButton;
    @FXML
    public TableView everydayStatisticTable;
    @FXML
    private ChoiceBox<String> sitesList;

    @FXML
    void initialize() {
        sitesList.setValue(siteService.getAllSitesName().get(0));
        sitesList.setItems(siteService.getAllSitesName());
        showTableEverydayStatistic();
    }

    public void showTableEverydayStatistic() {

        ArrayList<Person> columnsName = new ArrayList<>(personService.getAll());
        TableColumn<PeriodicalStatistic, LocalDate> columnLocalDate = new TableColumn<>("Дата");
        columnLocalDate.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getDate()));
        everydayStatisticTable.getColumns().add(columnLocalDate);

        for (int i = 0; i < columnsName.size(); i++) {
            final int finalIdx = i;
            TableColumn<PeriodicalStatistic, Integer> column = new TableColumn<>(columnsName.get(i).getName());
            column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getValue()));
            everydayStatisticTable.getColumns().add(column);
        }
    }

    public void confirmSelection() {
        ObservableList<PeriodicalStatistic> statistic = statisticService.statisticByPeriod(sitesList.getValue(), beginDate.getValue(), endDate.getValue(), personService.getAll());
        everydayStatisticTable.setItems(statistic);
    }

    public void closeModalWindow() {
        onExitButtonFromWindow(cancelButton);
    }
}
