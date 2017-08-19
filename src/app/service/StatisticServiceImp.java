package app.service;

import app.model.GeneralStatistic;
import app.model.PeriodicalStatistic;
import app.model.Person;
import app.model.Site;
import app.repository.StatisticRepository;
import app.repository.mock.InMemoryStatisticRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

import java.time.LocalDate;
import java.util.List;

public class StatisticServiceImp implements StatisticService {
    private StatisticRepository statisticRepository = new InMemoryStatisticRepository();

    @Override
    public ObservableList<GeneralStatistic> generalStatistic(List<Site> site, List<Person> person) {
        return FXCollections.observableList(statisticRepository.generalStatistic(site, person));
    }

    @Override
    public ObservableList<PeriodicalStatistic> statisticByPeriod(String siteName, LocalDate beginDate, LocalDate endDate, List<Person> person) {
        return FXCollections.observableList(statisticRepository.statisticByPeriod(siteName, beginDate, endDate, person));
    }
}
