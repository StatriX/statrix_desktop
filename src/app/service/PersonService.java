package app.service;

import app.model.Person;
import javafx.collections.ObservableList;

public interface PersonService {
    void save(Person person);

    void delete(int id);

    ObservableList<Person> getAll();
}
