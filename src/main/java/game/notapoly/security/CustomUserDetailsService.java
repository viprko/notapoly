package game.notapoly.security;

import static org.springframework.security.core.userdetails.User.withUsername;

import game.notapoly.model.User;
import game.notapoly.service.UserService;
import java.util.Optional;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userService.findByUsername(username);
        if (user.isPresent()) {
            return withUsername(username)
                    .password(user.get().getPassword())
                    .roles(user.get().getRole().name())
                    .build();
        }
        throw new UsernameNotFoundException("User not found");
    }
}
