package main.java.service;

import javafx.collections.ObservableMap;
import main.java.model.GeneralStatistic;
import main.java.model.PeriodicalStatistic;

import java.time.LocalDate;
import java.util.List;

public interface StatisticService {
    ObservableMap<GeneralStatistic, Integer> generalStatistic(List<String> site, List<String> person);

    ObservableMap<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<String> person);
}
