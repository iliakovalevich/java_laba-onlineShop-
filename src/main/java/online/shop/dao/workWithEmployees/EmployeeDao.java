package online.shop.dao.workWithEmployees;

import online.shop.entity.persons.Employee;

import javax.sql.DataSource;
import java.util.List;

public interface EmployeeDao {
    public void setDataSource(DataSource dataSource);

    public void createEmployee(String passportNumber, String firstName, String lastName, Integer age,
                               String position, double salary, double workExperience) ;

    public Employee getEmployeeById(int id);

    public List listEmployees();

    public void removeEmployee(int id);

    public void updateEmployee(String passportNumber, String firstName, String lastName, Integer age,
                          String position, double salary, double workExperience);
}
