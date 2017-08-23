package app.service;

import app.model.GeneralStatistic;
import app.model.PeriodicalStatistic;
import app.model.Person;
import app.model.Site;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

import java.time.LocalDate;
import java.util.List;

public interface StatisticService {
    ObservableList<GeneralStatistic> generalStatistic(List<Site> site, List<Person> person);

    ObservableList<PeriodicalStatistic> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<Person> person);
}
