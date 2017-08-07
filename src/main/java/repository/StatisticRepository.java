package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface StatisticRepository {
    Map<String, Map<String, Integer>> commonStatistic(List<String> site, List<String> person);
}
