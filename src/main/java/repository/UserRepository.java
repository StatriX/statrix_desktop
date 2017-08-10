package main.java.repository;

import main.java.model.User;

import java.util.List;

public interface UserRepository {
    void save(User user);

    void delete(int id);

    List<User> getAll();

}
