package online.shop.dao.workWithOrders;

import online.shop.entity.Order;

import javax.sql.DataSource;
import java.util.List;

public interface OrderDao {
    public void setDataSource(DataSource dataSource);

    public void createOrder(String nameOrder, double priceOrder);

    public Order getOrderById(int id);

    public List listOrder();

    public void removeOrder(int id);

    public void updateOrder(int idOrder, String nameOrder, double priceOrder);
}
