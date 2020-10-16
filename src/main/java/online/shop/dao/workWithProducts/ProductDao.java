package online.shop.dao.workWithProducts;

import online.shop.entity.orders.Product;

import java.util.List;

public interface ProductDao {
    void createProduct(String nameProduct, double priceProduct);

    Product getProductById(int id);

    List listProduct();

    void removeProduct(int id);

    void updateProduct(int idProduct, String nameProduct, double priceProduct);
}

