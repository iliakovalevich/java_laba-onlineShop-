package online.shop.multithreading;

import online.shop.entity.orders.Product;
import online.shop.services.ordersService.ProductServiceThreads;

public class WorkRead implements Runnable {
    final ProductServiceThreads productServiceThreads;

    public WorkRead(ProductServiceThreads productServiceThreads) {
        this.productServiceThreads = productServiceThreads;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            for (Product i : productServiceThreads.getAllProducts()){
                System.out.println("id product= "+i.getIdProduct()+" name product= "+i.getNameProduct()+" price product= "+i.getPriceProduct());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}