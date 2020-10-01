package online.shop.dao.workWithOrders;

import online.shop.entity.orders.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<Order>{

    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        Order order=new Order();
        order.setIdOrder(rs.getInt("idOrder"));
        order.setNameOrder(rs.getString("nameOrder"));
        order.setPriceOrder(rs.getDouble("priceOrder"));
        return order;
    }
}
