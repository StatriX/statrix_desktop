package app.repository;

import app.model.User;

import java.util.List;

public interface UserRepository {
    void save(User user);

    void delete(int id);

    List<User> getAll();

}
