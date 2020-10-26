package online.shop.services.productsService;

import online.shop.entity.orders.Product;

import java.util.List;

public interface ProductService {
    void createProduct(String nameProduct, double priceProduct);

    List getAllProductsFromDB();

    Product getProductByIdFromDB(int idProduct);

    void removeProduct(int idProduct);

    void updateProduct(int idProduct, String nameProduct, double priceProduct);
}
