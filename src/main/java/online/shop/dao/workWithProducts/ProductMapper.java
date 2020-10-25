package online.shop.dao.workWithProducts;

import online.shop.entity.orders.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setIdProduct(rs.getInt("idProduct"));
        product.setNameProduct(rs.getString("nameProduct"));
        product.setPriceProduct(rs.getDouble("priceProduct"));
        return product;
    }
}
