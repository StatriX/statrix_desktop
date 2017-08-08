package repository;

import model.GeneralStatistic;
import model.PeriodicalStatistic;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface StatisticRepository {
    Map<GeneralStatistic, Integer> generalStatistic(List<String> site, List<String> person);

    Map<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate startDate, LocalDate endDate, List<String> person);
}
