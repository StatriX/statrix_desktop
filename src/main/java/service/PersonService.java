package service;

import model.Person;

import java.util.List;

public interface PersonService {
    boolean save(Person person);

    boolean delete(int id);

    List<Person> getAll();
}
