package app.service;

import app.model.Person;
import javafx.collections.ObservableList;

import java.util.List;

public interface PersonService {
    void save(Person person);

    void delete(int id);

    ObservableList<Person> getAll();

    ObservableList<String> getAllName();
}
