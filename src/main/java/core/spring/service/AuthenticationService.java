package core.spring.service;

import core.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
