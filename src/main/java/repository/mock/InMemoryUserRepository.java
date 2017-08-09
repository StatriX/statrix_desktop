package repository.mock;

import model.User;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryUserRepository implements UserRepository {
    private Map<Integer, User> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        repository.put(counter.incrementAndGet(), new User(counter.get(), "admin", "123", "admin@statrix.ru", true));
        repository.put(counter.incrementAndGet(), new User(counter.get(), "user1", "123", "user1@statrix.ru", false));
        repository.put(counter.incrementAndGet(), new User(counter.get(), "user2", "123", "user2@statrix.ru", false));
    }


    @Override
    public void save(User user) {
        if(user.isNew()) {
            user.setId(counter.incrementAndGet());
        }

        repository.put(user.getId(), user);
    }

    @Override
    public void delete(int id) {
        repository.remove(id);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(repository.values());
    }
}
