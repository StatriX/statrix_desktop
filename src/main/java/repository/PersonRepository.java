package repository;

import model.Person;

import java.util.List;

public interface PersonRepository {
    boolean save(Person person);

    boolean delete(int id);

    List<Person> getAll();
}
