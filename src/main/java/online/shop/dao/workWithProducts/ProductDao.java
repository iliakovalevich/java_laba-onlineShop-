package online.shop.dao.workWithProducts;

import online.shop.entity.orders.Product;

import javax.sql.DataSource;
import java.util.List;

public interface ProductDao {
    public void setDataSource(DataSource dataSource);

    public void createProduct(String nameProduct, double priceProduct);

    public Product getProductById(int id);

    public List listProduct();

    public void removeProduct(int id);

    public void updateProduct(int idProduct, String nameProduct, double priceProduct);
}

