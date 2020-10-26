package online.shop.services.productsService;

import online.shop.dao.workWithProducts.ProductDaoImpl;
import online.shop.entity.orders.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class ProductServiceImpl implements ProductService {
    final List<Product> productList = new ArrayList<>();
    final ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemplate-config.xml");
    final ProductDaoImpl productDao = (ProductDaoImpl) context.getBean("jdbcTemplateProductDao");

    @Override
    public void createProduct(String nameProduct, double priceProduct){
        productDao.createProduct(nameProduct,priceProduct);
    }

    @Override
    public List getAllProductsFromDB(){
        return productDao.listProduct();
    }

    @Override
    public Product getProductByIdFromDB(int idProduct){
        return productDao.getProductById(idProduct);
    }

    @Override
    public void removeProduct(int idProduct) {
        productDao.removeProduct(idProduct);
    }

    @Override
    public void updateProduct(int idProduct, String nameProduct, double priceProduct){
        productDao.updateProduct(idProduct, nameProduct, priceProduct);
    }

//    public synchronized Product getProductById(int id) {
//        return productList.get(id);
//    }
//
//    public List<Product> getAllProducts() {
//        return productList;
//    }
//
//    public void removeProductById(int id) {
//        productList.remove(id);
//    }

    @Override
    public String toString() {
        return "ProductServiseThreads{" +
                "productList=" + productList+
                '}';
    }
}
