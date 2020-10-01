package online.shop.dao.workWithEmployees;

import online.shop.entity.persons.Employee;

import javax.sql.DataSource;
import java.util.List;

public interface EmployeeDao {

    void createEmployee(String passportNumber, String firstName, String lastName, Integer age,
                        String position, double salary, double workExperience);

    Employee getEmployeeById(int id);

    List listEmployees();

    void removeEmployee(int id);

    void updateEmployee(String passportNumber, String firstName, String lastName, Integer age,
                        String position, double salary, double workExperience);
}
