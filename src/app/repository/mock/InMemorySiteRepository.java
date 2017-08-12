package app.repository.mock;

import app.model.Site;
import app.repository.SiteRepository;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemorySiteRepository implements SiteRepository {
    private Map<Integer, Site> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        repository.put(counter.incrementAndGet(), new Site(counter.get(), "Site1", true));
        repository.put(counter.incrementAndGet(), new Site(counter.get(), "Site2", true));
        repository.put(counter.incrementAndGet(), new Site(counter.get(), "Site3", false));
    }

    @Override
    public void save(Site site) {
        if (site.getId() == null) {
            System.out.println("new site add");
            site.setId(counter.incrementAndGet());
        }

        repository.put(site.getId(), site);
        System.out.println("кол-во элементов в мапе: " + repository.size());
    }

    @Override
    public void delete(int id) {
        System.out.println("remove id: " + id);
        repository.remove(id);
        System.out.println("кол-во элементов в мапе: " + repository.size());
    }

    @Override
    public List<Site> getAll() {
        return new ArrayList<>(repository.values());
    }
}
