package online.shop.dao.workWithOrders;

import online.shop.entity.orders.Order;

import java.util.List;

public interface OrderDao {

    void createOrder(Order order);

    void createOrder(String nameOrder, double priceOrder);

    Order getOrderById(int id);

    List listOrder();

    void removeOrder(int id);

    void updateOrder(int idOrder, String nameOrder, double priceOrder);
}
