package repository.mock;

import model.Keyword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryKeyworRepository {
    private Map<Integer, Keyword> repository = new HashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        //repository.put(new Keyword(counter.incrementAndGet(), ""));
    }



}
