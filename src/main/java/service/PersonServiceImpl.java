package service;

import model.Person;
import repository.PersonRepository;
import repository.mock.InMemoryPersonRepository;

import java.util.List;

public class PersonServiceImpl implements PersonRepository {
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
