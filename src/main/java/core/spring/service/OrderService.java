package core.spring.service;

import core.spring.model.Order;
import core.spring.model.ShoppingCart;
import core.spring.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
