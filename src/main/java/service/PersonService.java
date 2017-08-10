package main.java.service;

import javafx.collections.ObservableList;
import main.java.model.Person;

public interface PersonService {
    void save(Person person);

    void delete(int id);

    ObservableList<Person> getAll();
}
