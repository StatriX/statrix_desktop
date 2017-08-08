package service;

import model.GeneralStatistic;
import model.PeriodicalStatistic;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface StatisticService {
    Map<GeneralStatistic, Integer> generalStatistic(List<String> site, List<String> person);

    Map<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<String> person);
}
