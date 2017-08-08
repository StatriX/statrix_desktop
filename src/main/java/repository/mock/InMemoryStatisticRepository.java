package repository.mock;

import repository.StatisticRepository;

import java.time.LocalDate;
import java.util.*;

public class InMemoryStatisticRepository implements StatisticRepository {
    private final Integer MIN = 10000;
    private final Integer MAX = 100000;


    @Override
    public Map<String, Map<String, Integer>> generalStatistic(List<String> site, List<String> person) {
        Map<String, Map<String, Integer>> generalStatisticMap = new HashMap<>();
        for(String strSite : site) {
            Map<String, Integer> tempMap = new HashMap<>();

            for(String strPerson : person) {

                tempMap.put(strPerson,  new Random().nextInt((MAX - MIN) + 1) + MIN);
            }
            generalStatisticMap.put(strSite, tempMap);
        }

        return generalStatisticMap;
    }

    @Override
    public Map<LocalDate, Map<String, Integer>> statisticByPeriod(String siteName, List<LocalDate> dates, List<String> person) {
        Map<LocalDate, Map<String, Integer>> mapMap = new HashMap<>();
        for(LocalDate datesTmp : dates) {
            Map<String, Integer> tempMap = new HashMap<>();

            for(String strPerson : person) {

                tempMap.put(strPerson,  new Random().nextInt((MAX - MIN) + 1) + MIN);
            }
            mapMap.put(datesTmp, tempMap);
        }

        return mapMap;
    }
}
