package online.shop.dao.workWithOrders;

import online.shop.entity.orders.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper {

    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("idOrder");
        String nameOrder = rs.getString("nameOrder");
        double priceOrder = rs.getDouble("priceOrder");
        return new Order(id, nameOrder, priceOrder);
    }
}
