package online.shop.services.productsService;

import online.shop.entity.orders.Product;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class ProductService {
    final List<Product> productList = new ArrayList<>();

    public boolean getNotNull(){
        return productList.size() > 0;
    }

    public void saveProduct(Product product) {
        productList.add(product);
    }

    public synchronized Product getProductById(int id) {
        return productList.get(id);
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public void removeProductById(int id) {
        productList.remove(id);
    }

    @Override
    public String toString() {
        return "ProductServiseThreads{" +
                "productList=" + productList+
                '}';
    }
}
