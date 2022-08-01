package core.spring.dao;

import core.spring.model.Order;
import core.spring.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
