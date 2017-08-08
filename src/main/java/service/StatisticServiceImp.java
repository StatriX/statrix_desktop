package service;

import repository.StatisticRepository;
import repository.mock.InMemoryStatisticRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class StatisticServiceImp implements StatisticService {
    private StatisticRepository statisticRepository = new InMemoryStatisticRepository();

    @Override
    public Map<String, Map<String, Integer>> commonStatistic(List<String> site, List<String> person) {
        return statisticRepository.generalStatistic(site, person);
    }

    @Override
    public Map<LocalDate, Map<String, Integer>> statisticByPeriod(String siteName, List<LocalDate> dates, List<String> person) {
        return statisticRepository.statisticByPeriod(siteName, dates, person);
    }
}
