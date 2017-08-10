package main.java.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import main.java.model.User;
import main.java.repository.UserRepository;
import main.java.repository.mock.InMemoryUserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new InMemoryUserRepository();

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public ObservableList<User> getAll() {
        return FXCollections.observableArrayList(userRepository.getAll());
    }
}
