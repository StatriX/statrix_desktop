package main.java.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import main.java.model.Person;
import main.java.repository.PersonRepository;
import main.java.repository.mock.InMemoryPersonRepository;

public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository = new InMemoryPersonRepository();

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public void delete(int id) {
        personRepository.delete(id);
    }

    @Override
    public ObservableList<Person> getAll() {
        return FXCollections.observableArrayList(personRepository.getAll());
    }
}
