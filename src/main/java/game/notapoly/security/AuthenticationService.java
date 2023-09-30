package game.notapoly.security;

import game.notapoly.model.User;

public interface AuthenticationService {
    User register(String username, String password);
}
