package core.spring.service;

import core.spring.model.Role;
import java.util.Optional;

public interface RoleService {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}
