package online.shop.dao.workWithProducts;

import online.shop.entity.orders.Product;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    private JdbcTemplate jdbcTemplate;


    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createProduct(String nameProduct, double priceProduct) {
        String SQL = "INSERT INTO products (nameProduct,priceProduct) VALUES (?,?)";
        jdbcTemplate.update(SQL, nameProduct, priceProduct);
    }

    public Product getProductById(int id) {
        String SQL = "SELECT * FROM products WHERE idProduct = ?";
        return (Product) jdbcTemplate.queryForObject(SQL, new Object[]{id}, new ProductMapper());
    }

    public List listProduct() {
        String SQL = "SELECT * FROM products";
        return jdbcTemplate.query(SQL, new ProductMapper());
    }

    public void removeProduct(int id) {
        String SQL = "DELETE FROM products WHERE id = ?";
        jdbcTemplate.update(SQL, id);
    }

    public void updateProduct(int idProduct, String nameProduct, double priceProduct) {
        String SQL = "UPDATE products SET nameProduct = ?, priceProduct = ? WHERE idProduct = ?";
        jdbcTemplate.update(SQL, nameProduct, priceProduct, idProduct);
    }
}
