package online.shop.services.personServices;

import online.shop.dao.workWithEmployees.EmployeeDaoImpl;
import online.shop.entity.persons.Employee;

import java.io.*;
import java.util.*;

public class EmployeeServices implements Serializable {
    private static final long serialVersionUID = 1L;

    final List<Employee> employeesList = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public void saveEmployeeFromDB() {
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeesList.addAll(employeeDao.listEmployees());
    }

    public void removeEmployee(String passportNumber) {
        employeesList.stream().filter(e->!e.getPassportNumber().equals(passportNumber));
//        ListIterator<Employee> employeeIterator = employeesList.listIterator();
//        int index = 0;
//        while (employeeIterator.hasNext()) {
//            Employee nextEmployee = employeeIterator.next();
//            if (nextEmployee.getPassportNumber().equals(passportNumber)) {
//                index = employeeIterator.nextIndex();
//                break;
//            }
//        }
//        employeesList.remove(index);
    }

    public double getAllEmployeesSalary() {
        double sum = 0;
        employeesList.stream().forEach(x->x.getSalary());
        for (Employee i : employeesList) {
            sum += i.getSalary();
        }
        return sum;
    }

    public void printPostEmployees(String post) {
        employeesList.stream().forEach(o -> {
            System.out.println(o.getPost().toString());
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
