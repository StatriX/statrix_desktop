package service;

import repository.StatisticRepository;
import repository.mock.InMemoryStatisticRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StatisticServiceImp implements StatisticService {
    private StatisticRepository statisticRepository = new InMemoryStatisticRepository();

    @Override
    public Map<String, Map<String, Integer>> commonStatistic(List<String> site, List<String> person) {
        return statisticRepository.commonStatistic(site, person);
    }
}
