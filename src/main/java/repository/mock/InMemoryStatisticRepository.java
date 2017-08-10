package main.java.repository.mock;

import main.java.model.GeneralStatistic;
import main.java.model.PeriodicalStatistic;
import main.java.repository.StatisticRepository;

import java.time.LocalDate;
import java.util.*;

public class InMemoryStatisticRepository implements StatisticRepository {
    private final Integer MIN = 10000;
    private final Integer MAX = 100000;


    @Override
    public Map<GeneralStatistic, Integer> generalStatistic(List<String> site, List<String> person) {
        Map<GeneralStatistic, Integer> generalStatisticMap = new TreeMap<>();
        for (String strSite : site) {
            for (String strPerson : person) {
                generalStatisticMap.put(new GeneralStatistic(strSite, strPerson), new Random().nextInt((MAX - MIN) + 1) + MIN);
            }
        }

        return generalStatisticMap;
    }

    @Override
    public Map<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<String> person) {
        Map<PeriodicalStatistic, Integer> statisticByPeriodMap = new TreeMap<>();
        for (; beginDate.isBefore(endDate); beginDate = beginDate.plusDays(1)) {
            for (String strPerson : person) {
                statisticByPeriodMap.put(new PeriodicalStatistic(beginDate, strPerson), new Random().nextInt((MAX - MIN) + 1) + MIN);
            }
        }

        return statisticByPeriodMap;
    }
}
