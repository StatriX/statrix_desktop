package main.java.service;

import javafx.collections.ObservableList;
import main.java.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    void delete(int id);

    ObservableList<User> getAll();
}
