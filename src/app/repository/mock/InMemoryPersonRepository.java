package app.repository.mock;

import app.model.Person;
import app.repository.PersonRepository;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryPersonRepository implements PersonRepository {
    private Map<Integer, Person> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        repository.put(counter.incrementAndGet(), new Person(counter.get(), "Person1", true));
        repository.put(counter.incrementAndGet(), new Person(counter.get(), "Person2", true));
        repository.put(counter.incrementAndGet(), new Person(counter.get(), "Person3", false));
        repository.put(counter.incrementAndGet(), new Person(counter.get(), "Person4", false));
    }

    @Override
    public void save(Person person) {
        if (person.getId() == null) {
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

    @Override
    public List<String> getPersonName() {
        ArrayList<String> personName = new ArrayList<>();

        getAll().forEach(name -> personName.add(name.getName()));

        return personName;
    }
}
