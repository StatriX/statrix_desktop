package main.java.repository.mock;

import main.java.model.Keyword;
import main.java.repository.KeywordRepository;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class InMemoryKeywordRepository implements KeywordRepository {
    private Map<Integer, Keyword> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        repository.put(counter.incrementAndGet(), new Keyword(counter.get(), 1, "keyword1Person1", true));
        repository.put(counter.incrementAndGet(), new Keyword(counter.get(), 1, "keyword2Person1", true));
        repository.put(counter.incrementAndGet(), new Keyword(counter.get(), 1, "keyword2Person1", false));
        repository.put(counter.incrementAndGet(), new Keyword(counter.get(), 2, "keyword1Person2", false));
        repository.put(counter.incrementAndGet(), new Keyword(counter.get(), 2, "keyword2Person2", true));
        repository.put(counter.incrementAndGet(), new Keyword(counter.get(), 2, "keyword2Person2", true));
        repository.put(counter.incrementAndGet(), new Keyword(counter.get(), 3, "keyword1Person3", true));
        repository.put(counter.incrementAndGet(), new Keyword(counter.get(), 3, "keyword2Person3", false));
        repository.put(counter.incrementAndGet(), new Keyword(counter.get(), 3, "keyword2Person3", true));
    }

    @Override
    public void save(Keyword keyword) {
        if (keyword.isNew()) {
            keyword.setId(counter.incrementAndGet());
        }

        repository.put(keyword.getId(), keyword);
    }

    @Override
    public void delete(int id) {
        repository.remove(id);
    }

    @Override
    public List<Keyword> getAllByPersonId(Integer id) {
        return new ArrayList<>(repository.values())
                .stream()
                .filter(k -> k.getPersonId().equals(id))
                .collect(Collectors.toList());
    }
}
