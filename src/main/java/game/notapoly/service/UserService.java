package game.notapoly.service;

import game.notapoly.model.User;
import java.util.Optional;

public interface UserService {
    User save(User user);
    User findById(Long id);
    Optional<User> findByUsername(String username);
    User updateRole(Long id, User.Role role);
    void deleteById(Long id);

}
