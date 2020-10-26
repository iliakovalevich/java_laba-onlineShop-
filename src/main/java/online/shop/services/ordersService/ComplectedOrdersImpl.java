package online.shop.services.ordersService;

import online.shop.dao.workWithOrders.OrderDaoImpl;
import online.shop.entity.orders.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplectedOrdersImpl {
    final ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemplate-config.xml");
    final OrderDaoImpl orderDao = (OrderDaoImpl) context.getBean("jdbcTemplateOrderDao");

    public void complectedOrder(Product product) {
        String orderName;
        double priceOrder;
        orderName = product.getNameProduct();
        priceOrder=product.getPriceProduct();
        orderDao.createOrder(orderName,priceOrder);
    }

    public void complectedOrder(Product product1, Product product2) {
        String orderName;
        double priceOrder;
        orderName = product1.getNameProduct()+" + "+product2.getNameProduct();
        priceOrder=product1.getPriceProduct()+product2.getPriceProduct();
        orderDao.createOrder(orderName,priceOrder);
    }

    public void complectedOrder(Product product1, Product product2, Product product3) {
        String orderName;
        double priceOrder;
        orderName = product1.getNameProduct()+" "+product2.getNameProduct()+" "+product3.getNameProduct();
        priceOrder=product1.getPriceProduct()+product2.getPriceProduct()+product3.getPriceProduct();
        orderDao.createOrder(orderName,priceOrder);
    }

}
