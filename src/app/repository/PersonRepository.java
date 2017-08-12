package app.repository;

import app.model.Person;

import java.util.List;

public interface PersonRepository {
    void save(Person person);

    void delete(int id);

    List<Person> getAll();

    List<String> getPersonName();
}
