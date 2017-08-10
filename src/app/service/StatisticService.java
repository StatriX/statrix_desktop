package app.service;

import app.model.GeneralStatistic;
import app.model.PeriodicalStatistic;
import javafx.collections.ObservableMap;

import java.time.LocalDate;
import java.util.List;

public interface StatisticService {
    ObservableMap<GeneralStatistic, Integer> generalStatistic(List<String> site, List<String> person);

    ObservableMap<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<String> person);
}
