package repository.mock;

import model.Person;
import repository.PersonRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryPersonRepository implements PersonRepository {
    private HashMap<Integer, Person> repository = new HashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        repository.put(counter.incrementAndGet(), new Person(counter.get(), "Person1", true));
        repository.put(counter.incrementAndGet(), new Person(counter.get(), "Person2", true));
        repository.put(counter.incrementAndGet(), new Person(counter.get(), "Person3", false));
    }

    @Override
    public void save(Person person) {
        if(person.getId() == null) {
            person.setId(counter.incrementAndGet());
        }

        repository.put(person.getId(), person);

    }

    @Override
    public void delete(int id) {
        repository.remove(id);
    }

    @Override
    public List<Person> getAll() {
        return new ArrayList<>(repository.values());
    }
}
