package core.spring.service;

import core.spring.model.MovieSession;
import core.spring.model.ShoppingCart;
import core.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
