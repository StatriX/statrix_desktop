package app.service;

import app.model.GeneralStatistic;
import app.model.PeriodicalStatistic;
import app.model.Person;
import app.model.Site;
import javafx.collections.ObservableMap;

import java.time.LocalDate;
import java.util.List;

public interface StatisticService {
    ObservableMap<GeneralStatistic, Integer> generalStatistic(List<Site> site, List<Person> person);

    ObservableMap<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<Person> person);
}
