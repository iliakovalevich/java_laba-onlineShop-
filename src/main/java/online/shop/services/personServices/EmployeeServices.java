package online.shop.services.personServices;

import online.shop.dao.workWithClients.ClientDaoImpl;
import online.shop.dao.workWithEmployees.EmployeeDaoImpl;
import online.shop.entity.persons.Client;
import online.shop.entity.persons.Employee;

import java.util.*;

public class PersonServicesWithCollections {
    List<Employee> employeesList = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public void saveEmployeeFromDB() {
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeesList.addAll(employeeDao.listEmployees());
    }

    public void removeEmployee(String passportNumber) {
        ListIterator<Employee> employeeIterator = employeesList.listIterator();
        int index = 0;
        while (employeeIterator.hasNext()) {
            Employee nextEmployee = employeeIterator.next();
            if (nextEmployee.getPassportNumber().equals(passportNumber)) {
                index = employeeIterator.nextIndex();
                break;
            }
        }
        employeesList.remove(index);
    }

    public double getAllEmployeesSalary() {
        double sum = 0;
        for (Employee i : employeesList) {
            sum += i.getSalary();
        }
        return sum;
    }

    public void printPostEmployees(String post){
        for (Employee i : employeesList){
            if (i.getPost().equals(post)){
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "PersonServicesWithCollections{" +
                "employeesList=" + employeesList +
                '}';
    }
}