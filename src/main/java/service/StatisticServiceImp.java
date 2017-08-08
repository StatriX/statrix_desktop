package service;

import model.GeneralStatistic;
import model.PeriodicalStatistic;
import repository.StatisticRepository;
import repository.mock.InMemoryStatisticRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class StatisticServiceImp implements StatisticService {
    private StatisticRepository statisticRepository = new InMemoryStatisticRepository();

    @Override
    public Map<GeneralStatistic, Integer> generalStatistic(List<String> site, List<String> person) {
        return statisticRepository.generalStatistic(site, person);
    }

    @Override
    public Map<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<String> person) {
        return statisticRepository.statisticByPeriod(siteName, beginDate, endDate, person);
    }
}
