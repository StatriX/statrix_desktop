package app.service;

import app.model.Person;
import app.repository.PersonRepository;
import app.repository.mock.InMemoryPersonRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
