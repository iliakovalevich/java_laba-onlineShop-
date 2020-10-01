package online.shop.dao.workWithOrders;

import online.shop.entity.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper {

    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("idOrder");
        String nameOrder = rs.getString("nameOrder");
        double priceOrder = rs.getDouble("priceOrder");
        Order order = new Order(id, nameOrder, priceOrder);
        return order;
    }
}
