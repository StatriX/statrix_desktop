package repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface StatisticRepository {
    Map<String, Map<String, Integer>> generalStatistic(List<String> site, List<String> person);

    Map<LocalDate, Map<String, Integer>> statisticByPeriod(String siteName, List<LocalDate> dates, List<String> person);
}
