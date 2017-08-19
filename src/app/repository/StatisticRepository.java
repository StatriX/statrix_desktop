package app.repository;

import app.model.GeneralStatistic;
import app.model.PeriodicalStatistic;
import app.model.Person;
import app.model.Site;

import java.time.LocalDate;
import java.util.*;

public interface StatisticRepository {
    Map<GeneralStatistic, Integer> generalStatistic(List<Site> site, List<Person> person);

    Map<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate startDate, LocalDate endDate, List<Person> person);
}
