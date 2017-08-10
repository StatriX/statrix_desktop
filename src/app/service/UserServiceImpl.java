package app.service;

import app.model.User;
import app.repository.UserRepository;
import app.repository.mock.InMemoryUserRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
