package app.repository.mock;

import app.model.GeneralStatistic;
import app.model.PeriodicalStatistic;
import app.model.Person;
import app.model.Site;
import app.repository.StatisticRepository;

import java.time.LocalDate;
import java.util.*;

public class InMemoryStatisticRepository implements StatisticRepository {
    private final Integer MIN = 10000;
    private final Integer MAX = 100000;


    @Override
    public Map<GeneralStatistic, Integer> generalStatistic(List<Site> site, List<Person> person) {
        Map<GeneralStatistic, Integer> generalStatisticMap = new TreeMap<>();
        for (Site strSite : site) {
            for (Person strPerson : person) {
                generalStatisticMap.put(new GeneralStatistic(strSite.getName(), strPerson.getName()), new Random().nextInt((MAX - MIN) + 1) + MIN);
            }
        }

        return generalStatisticMap;
    }

    @Override
    public Map<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<Person> person) {
        Map<PeriodicalStatistic, Integer> statisticByPeriodMap = new TreeMap<>();
        for (; beginDate.isBefore(endDate); beginDate = beginDate.plusDays(1)) {
            for (Person strPerson : person) {
                statisticByPeriodMap.put(new PeriodicalStatistic(beginDate, strPerson.getName()), new Random().nextInt((MAX - MIN) + 1) + MIN);
            }
        }

        return statisticByPeriodMap;
    }
}
