package online.shop.service;

import online.shop.entity.Order;
import online.shop.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl {
    Product product1 = new Product();
    Product product2 = new Product();
    Order order = new Order();
    List<Order> orders = new ArrayList<Order>();

    public void createOrder(Product product1) {
        order.setIdOrder((int) Math.random() * 1000);
        order.setNameOrder(product1.getNameProduct());
        order.setPriceOrder(product1.getPriceProduct());
        orders.add(order);
    }

    public void createOrder(Product product1, Product product2) {
        order.setIdOrder((int) Math.random() * 1000);
        order.setNameOrder(product1.getNameProduct() + "and" + product2.getNameProduct());
        order.setPriceOrder(product1.getPriceProduct() + product2.getPriceProduct());
        orders.add(order);
    }

    public void delete(int idOrder) {

    }

    public void readyOrder(int idOrder) {

    }
}
