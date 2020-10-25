//package online.shop.multithreading;
//
//
//import online.shop.entity.orders.Product;
//import online.shop.services.ordersService.ProductServiceThreads;
//
//public class WorkWithThreads implements Runnable {
//    final ProductServiceThreads productServiceThreads;
//
//    public WorkWithThreads(ProductServiceThreads productServiceThreads) {
//        this.productServiceThreads = productServiceThreads;
//    }
//
//    public void run() {
//        try {
//            Product product1 = new Product(21, "Cola", 50);
//            Product product2 = new Product(22, "Pizza", 150);
//            Product product3 = new Product(23, "Chicken", 200);
//            productServiceThreads.saveProduct(product1);
//            System.out.println("Thread 1 is write");
//            productServiceThreads.saveProduct(product2);
//            System.out.println("Thread 2 is write");
//            productServiceThreads.saveProduct(product3);
//            System.out.println("Thread 3 is write");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//}