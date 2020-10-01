package online.shop.dao.workWithProducts;

import online.shop.entity.orders.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        int idProduct = rs.getInt("idProduct");
        String nameProduct = rs.getString("nameProduct");
        double priceProduct = rs.getDouble("priceProduct");
        return new Product(idProduct, nameProduct, priceProduct);
    }

}
