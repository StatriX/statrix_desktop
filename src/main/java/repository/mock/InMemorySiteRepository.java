package repository.mock;

import model.Person;
import model.Site;
import repository.SiteRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemorySiteRepository implements SiteRepository {
    private HashMap<Integer, Site> repository = new HashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        repository.put(counter.incrementAndGet(), new Site(counter.get(), "Site1", true));
        repository.put(counter.incrementAndGet(), new Site(counter.get(), "Site2", true));
        repository.put(counter.incrementAndGet(), new Site(counter.get(), "Site3", false));
    }

    @Override
    public void save(Site site) {
        if(site.getId() == null) {
            site.setId(counter.incrementAndGet());
        }

        repository.put(site.getId(), site);
    }

    @Override
    public void delete(int id) {
        repository.remove(id);
    }

    @Override
    public List<Site> getAll() {
        return new ArrayList<>(repository.values());
    }
}
