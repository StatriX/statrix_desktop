package app.service;

import app.model.Person;
import javafx.collections.ObservableList;

import java.util.List;

public interface PersonService {
    void save(Person person);

    void delete(int id);

    List<Person> getAll();
}
