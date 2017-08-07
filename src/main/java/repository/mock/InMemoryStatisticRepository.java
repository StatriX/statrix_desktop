package repository.mock;

import repository.StatisticRepository;

import java.util.*;

public class InMemoryStatisticRepository implements StatisticRepository {
    private final Integer MIN = 10000;
    private final Integer MAX = 100000;


    @Override
    public Map<String, Map<String, Integer>> commonStatistic(List<String> site, List<String> person) {
        Map<String, Map<String, Integer>> mapMap = new HashMap<>();
        for(String strSite : site) {
            Map<String, Integer> tempMap = new HashMap<>();

            for(String strPerson : person) {

                tempMap.put(strPerson,  new Random().nextInt((MAX - MIN) + 1) + MIN);
            }
            mapMap.put(strSite, tempMap);
        }

        return mapMap;
    }


}
