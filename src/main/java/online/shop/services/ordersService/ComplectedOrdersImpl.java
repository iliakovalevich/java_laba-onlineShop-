package online.shop.services.ordersService;

import online.shop.dao.workWithOrders.OrderDaoImpl;
import online.shop.entity.orders.Product;

public class ComplectedOrdersImpl {

    protected void complectedOrder(Product product) {
        OrderDaoImpl orderDao = new OrderDaoImpl();
        String orderName;
        double priceOrder;
        orderName = product.getNameProduct();
        priceOrder=product.getPriceProduct();
        orderDao.createOrder(orderName,priceOrder);
    }

    protected void complectedOrder(Product product1, Product product2) {
        OrderDaoImpl orderDao = new OrderDaoImpl();
        String orderName;
        double priceOrder;
        orderName = product1.getNameProduct()+" "+product2.getNameProduct();
        priceOrder=product1.getPriceProduct()+product2.getPriceProduct();
        orderDao.createOrder(orderName,priceOrder);
    }

    protected void complectedOrder(Product product1, Product product2, Product product3) {
        OrderDaoImpl orderDao = new OrderDaoImpl();
        String orderName;
        double priceOrder;
        orderName = product1.getNameProduct()+" "+product2.getNameProduct()+product3.getNameProduct();
        priceOrder=product1.getPriceProduct()+product2.getPriceProduct()+product3.getPriceProduct();
        orderDao.createOrder(orderName,priceOrder);
    }

}
