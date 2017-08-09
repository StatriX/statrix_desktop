package service;

import model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    void delete(int id);

    List<User> getAll();
}
