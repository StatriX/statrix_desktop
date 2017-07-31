package repository;

import model.User;

import java.util.List;

public interface UserRepository {
    User create(User user);

    boolean delete(int id);

    List<User> getAll();

    boolean update(User user);
    
}
