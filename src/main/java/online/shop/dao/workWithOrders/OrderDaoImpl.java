package online.shop.dao.workWithOrders;

import online.shop.entity.orders.Order;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class OrderDaoImpl implements OrderDao {
    private JdbcTemplate jdbcTemplate;


    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createOrder(String nameOrder, double priceOrder) {
        String SQL = "INSERT INTO orders (nameOrder,priceOrder) VALUES (?,?)";
        jdbcTemplate.update(SQL, nameOrder, priceOrder);
    }

    @Override
    public Order getOrderById(int id) {
        String SQL = "SELECT * FROM orders WHERE id = ?";
        return (Order) jdbcTemplate.queryForObject(SQL, new Object[]{id}, new OrderMapper());
    }

    @Override
    public List listOrder() {
        String SQL = "SELECT * FROM orders";
        return jdbcTemplate.query(SQL, new OrderMapper());
    }

    @Override
    public void removeOrder(int id) {
        String SQL = "DELETE FROM orders WHERE id = ?";
        jdbcTemplate.update(SQL, id);
    }

    @Override
    public void updateOrder(int idOrder, String nameOrder, double priceOrder) {
        String SQL = "UPDATE orders SET nameOrder = ?, priceOrder = ? WHERE idOrder = ?";
        jdbcTemplate.update(SQL, nameOrder, priceOrder, idOrder);
    }
}
