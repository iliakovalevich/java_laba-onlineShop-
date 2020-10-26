package online.shop.services.personServices;

import online.shop.dao.workWithEmployees.EmployeeDaoImpl;
import online.shop.dao.workWithOrders.OrderDaoImpl;
import online.shop.entity.persons.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.util.*;

public class EmployeeServices implements Serializable {
    private static final long serialVersionUID = 1L;
    final ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemplate-config.xml");
    final EmployeeDaoImpl employeeDao = (EmployeeDaoImpl) context.getBean("jdbcTemplateEmployeeDao");
    final List<Employee> employeesList = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public void saveEmployeeFromDB() {
        employeesList.addAll(employeeDao.listEmployees());
    }

    public void removeEmployee(String passportNumber) {
        employeesList.stream().filter(e->!e.getPassportNumber().equals(passportNumber));
    }

    public double getAllEmployeesSalary() {
        double sum = 0;
        for (Employee i : employeesList) {
            sum += i.getSalary();
        }
        return sum;
    }

    public void printPostEmployees(String post) {
        employeesList.stream().forEach(o -> {
            System.out.println(o.getPost());
        });
    }

    public List getAllEmployees() {
        return employeesList;
    }

    public void getSerializableObject() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("E:\\ilya\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee employee = (Employee) objectInputStream.readObject();
        System.out.println(employee);
    }

    @Override
    public String toString() {
        return "EmployeeServices{" +
                "employeesList=" + employeesList +
                '}';
    }
}
