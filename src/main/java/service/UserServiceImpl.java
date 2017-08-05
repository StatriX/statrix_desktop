package service;

import model.User;
import repository.UserRepository;
import repository.mock.InMemoryUserRepository;

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
    public List<User> getAll() {
        return userRepository.getAll();
    }
}
