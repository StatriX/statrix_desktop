package app.service;

import app.model.GeneralStatistic;
import app.model.PeriodicalStatistic;
import app.model.Person;
import app.model.Site;
import app.repository.StatisticRepository;
import app.repository.mock.InMemoryStatisticRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

import java.time.LocalDate;
import java.util.List;

public class StatisticServiceImp implements StatisticService {
    private StatisticRepository statisticRepository = new InMemoryStatisticRepository();

    @Override
    public ObservableMap<GeneralStatistic, Integer> generalStatistic(List<Site> site, List<Person> person) {
        return FXCollections.observableMap(statisticRepository.generalStatistic(site, person));
    }

    @Override
    public ObservableMap<PeriodicalStatistic, Integer> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<Person> person) {
        return FXCollections.observableMap(statisticRepository.statisticByPeriod(siteName, beginDate, endDate, person));
    }
}
