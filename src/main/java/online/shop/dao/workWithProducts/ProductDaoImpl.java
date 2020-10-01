package online.shop.dao.workWithProducts;

import online.shop.entity.Product;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createProduct(String nameProduct, double priceProduct) {
        String SQL = "INSERT INTO products (nameProduct,priceProduct) VALUES (?,?)";
        jdbcTemplate.update(SQL, nameProduct, priceProduct);
    }

    public Product getProductById(int id) {
        String SQL = "SELECT * FROM products WHERE id = ?";
        Product product =
                (Product) jdbcTemplate.queryForObject(SQL, new Object[]{id}, new ProductMapper());
        return product;
    }

    public List listProduct() {
        String SQL = "SELECT * FROM products";
        List products = jdbcTemplate.query(SQL, new ProductMapper());
        return products;
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
