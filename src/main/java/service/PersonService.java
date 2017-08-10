package main.java.service;

import main.java.model.Person;

import java.util.List;

public interface PersonService {
    void save(Person person);

    void delete(int id);

    List<Person> getAll();
}
