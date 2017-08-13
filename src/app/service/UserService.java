package app.service;

import app.model.User;
import javafx.collections.ObservableList;

public interface UserService {
    void save(User user);

    void delete(int id);

    ObservableList<User> getAll();
}
