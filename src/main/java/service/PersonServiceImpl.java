package main.java.service;

import main.java.model.Person;
import main.java.repository.PersonRepository;
import main.java.repository.mock.InMemoryPersonRepository;

import java.util.List;

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
    public List<Person> getAll() {
        return personRepository.getAll();
    }
}
