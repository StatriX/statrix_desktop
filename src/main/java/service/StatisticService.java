package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface StatisticService {
    Map<String, Map<String, Integer>> commonStatistic(List<String> site, List<String> person);

    Map<LocalDate, Map<String, Integer>> statisticByPeriod(String siteName, List<LocalDate> dates, List<String> person);
}
