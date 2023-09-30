package game.notapoly.service;

import game.notapoly.model.User;
import game.notapoly.repository.UserRepository;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User "
                + "with id " + id + "doesn't exist in database"));
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public User updateRole(Long id, User.Role role) {
        User user = findById(id);
        user.setRole(role);
        return null;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
