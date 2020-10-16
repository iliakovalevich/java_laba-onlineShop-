package online.shop.runnerShop;

import online.shop.multithreading.WorkRead;
import online.shop.multithreading.WorkWithThreads;
import online.shop.services.ordersService.ProductServiceThreads;

public class Runner {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("jdbctemplate-config.xml");
//        Employee employee1 = new Employee("Vasya", "Petrov",
//                "AB3425879", 25, "Senior", 1500, 3.5);
//        Employee employee2 = new Employee("Petya", "Petrov",
//                "AB3475879", 27, "Senior", 1900, 4.5);
//        Employee employee3 = new Employee("Zenya", "Vasiliev",
//                "AB315879", 23, "Middle", 800, 1.5);
//        EmployeeServices employeeServices = new EmployeeServices();
//        employeeServices.saveEmployee(employee1);
//        employeeServices.saveEmployee(employee3);
//        employeeServices.printPostEmployees("Middle");
//        System.out.println(employeeServices.getAllEmployeesSalary());
//        FileOutputStream outputStream = new FileOutputStream("E:\\ilya\\save.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        objectOutputStream.writeObject(employee2);
//        objectOutputStream.close();
//        employeeServices.getSerializableObject();
//        //*-----------------------------------------------------------------------*\\
//        ProductService productService=new ProductService();
//        productService.addInMap(25,"Cola");
//        productService.addInMap(100,"Pizza");
//        productService.addInMap(200,"Fish with vejetables");
//        productService.addInMap(27,"Cola");
//        productService.addInMap(26,"Cola");
//        List<String> list=productService.getAllProducts();
//        for (String i : list){
//            System.out.println(i);
//        }
        ProductServiceThreads productServiceThreads =new ProductServiceThreads();
        Thread t1 = new Thread(new WorkWithThreads(productServiceThreads));
        Thread t2 = new Thread(new WorkRead(productServiceThreads));
        t1.start();
        t2.start();
    }
}
