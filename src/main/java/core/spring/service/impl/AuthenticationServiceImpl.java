package core.spring.service.impl;

import core.spring.model.Role;
import core.spring.model.User;
import core.spring.service.AuthenticationService;
import core.spring.service.RoleService;
import core.spring.service.ShoppingCartService;
import core.spring.service.UserService;
import java.util.NoSuchElementException;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(Set.of(roleService.getByName(Role.RoleName.USER.toString())
                .orElseThrow(() -> new NoSuchElementException("Can`t register user. "
                        + "Role not present in DB " + Role.RoleName.USER))));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
