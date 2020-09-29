package online.shop.service;

import online.shop.entity.Order;

import java.util.List;

public interface OrderService {

    void delete(int id, String tableName);

    void readyOrder(Order order);

    List<Order> getAll(String tableName);

}