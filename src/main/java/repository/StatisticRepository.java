package main.java.repository;

import main.java.model.GeneralStatistic;
import main.java.model.PeriodicalStatistic;

import java.time.LocalDate;
import java.util.*;

public interface StatisticRepository {
    Map<GeneralStatistic, Integer> generalStatistic(List<String> site, List<String> person);

    Map<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate startDate, LocalDate endDate, List<String> person);
}
