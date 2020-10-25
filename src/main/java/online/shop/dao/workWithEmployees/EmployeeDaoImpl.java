package online.shop.dao.workWithEmployees;

import online.shop.entity.persons.Employee;
import online.shop.exceptions.CheckException;
import online.shop.exceptions.CheckExceptions;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createEmployee(String passportNumber, String firstName, String lastName, Integer age,
                               String post, double salary, double workExperience) {
        CheckExceptions checkExceptions = new CheckExceptions() {
            @Override
            public void checkAge(int age) {
                try {
                    if (age > 15 & age < 80) {
                    } else {
                        throw new Exception("The input number must be between from 16 to 80!");
                    }
                } catch (Exception exception) {
                    exception.getMessage();
                }
            }
        };
        checkExceptions.checkAge(age);
        String SQL = "INSERT INTO employees (passportNumber, firstName, lastName,age,position ,salary,workExperience) " +
                "VALUES (?,?,?,?,?,?,?)";
        jdbcTemplate.update(SQL, passportNumber, firstName, lastName, age, post, salary, workExperience);
    }

    public Employee getEmployeeById(int id) {
        String SQL = "SELECT * FROM employees WHERE id = ?";
        return jdbcTemplate.queryForObject(SQL, new Object[]{id}, new EmployeeMapper());
    }

    public List listEmployees() {
        String SQL = "SELECT * FROM employees";
        return jdbcTemplate.query(SQL, new EmployeeMapper());
    }

    public void removeEmployee(int id) {
        String SQL = "DELETE FROM employees WHERE id = ?";
        jdbcTemplate.update(SQL, id);
    }

    public void updateEmployee(String passportNumber, String firstName, String lastName, Integer age,
                               String post, double salary, double workExperience) {
        CheckException checkException = new CheckException() {
            @Override
            public void checkAge(int age) {
                try {
                    if (age > 15 & age < 80) {
                    } else {
                        throw new Exception("The input number must be between from 16 to 80!");
                    }
                } catch (Exception exception) {
                    exception.getMessage();
                }
            }
        };
        checkException.checkAge(age);
        String SQL = "UPDATE employees SET firstName = ?, lastName = ?, age = ?, post = ?, salary = ?, workExperience = ? WHERE passportNumber = ?";
        jdbcTemplate.update(SQL, firstName, lastName, age, post, salary, workExperience, passportNumber);
    }

}
