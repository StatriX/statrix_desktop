package main.java.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;
import main.java.model.GeneralStatistic;
import main.java.model.PeriodicalStatistic;
import main.java.repository.StatisticRepository;
import main.java.repository.mock.InMemoryStatisticRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class StatisticServiceImp implements StatisticService {
    private StatisticRepository statisticRepository = new InMemoryStatisticRepository();

    @Override
    public ObservableMap<GeneralStatistic, Integer> generalStatistic(List<String> site, List<String> person) {
        return FXCollections.observableMap(statisticRepository.generalStatistic(site, person));
    }

    @Override
    public ObservableMap<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<String> person) {
        return FXCollections.observableMap(statisticRepository.statisticByPeriod(siteName, beginDate, endDate, person));
    }
}
