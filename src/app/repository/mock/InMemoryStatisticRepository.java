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
    public List<GeneralStatistic> generalStatistic(List<Site> site, List<Person> person) {
        List<GeneralStatistic> generalStatisticList = new ArrayList<>();
        for (Site strSite : site) {
            for (Person strPerson : person) {
                generalStatisticList.add(new GeneralStatistic(strSite.getName(), strPerson.getName(), new Random().nextInt((MAX - MIN) + 1) + MIN));
            }
        }

        Collections.sort(generalStatisticList);

        return generalStatisticList;
    }

    @Override
    public List<PeriodicalStatistic> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<Person> person) {
        List<PeriodicalStatistic> statisticByPeriodList = new ArrayList<>();
        for (; beginDate.isBefore(endDate); beginDate = beginDate.plusDays(1)) {
            for (Person strPerson : person) {
                statisticByPeriodList.add(new PeriodicalStatistic(beginDate, strPerson.getName(), new Random().nextInt((MAX - MIN) + 1) + MIN));
            }
        }

        Collections.sort(statisticByPeriodList);

        return statisticByPeriodList;
    }
}
