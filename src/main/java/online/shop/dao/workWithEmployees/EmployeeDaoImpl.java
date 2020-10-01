package online.shop.dao.workWithEmployees;

import online.shop.entity.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createEmployee(String passportNumber, String firstName, String lastName, Integer age,
                               String position, double salary, double workExperience) {
        String SQL = "INSERT INTO employees (passportNumber, firstName, lastName,age,position,salary,workExperience) " +
                "VALUES (?,?,?,?,?,?,?)";
        jdbcTemplate.update(SQL, passportNumber, firstName, lastName, age, position, salary, workExperience);
    }

    public Employee getEmployeeById(int id) {
        String SQL = "SELECT * FROM employees WHERE id = ?";
        Employee employee =
                (Employee) jdbcTemplate.queryForObject(SQL, new Object[]{id}, new EmployeeMapper());
        return employee;
    }

    public List listEmployees() {
        String SQL = "SELECT * FROM employees";
        List employees = jdbcTemplate.query(SQL, new EmployeeMapper());
        return employees;
    }

    public void removeEmployee(int id) {
        String SQL = "DELETE FROM employees WHERE id = ?";
        jdbcTemplate.update(SQL, id);
    }

    public void updateEmployee(String passportNumber, String firstName, String lastName, Integer age,
                               String position, double salary, double workExperience) {
        String SQL = "UPDATE employees SET firstName = ?, lastName = ?, age = ?, position = ?, salary = ?, workExperience = ? WHERE passportNumber = ?";
        jdbcTemplate.update(SQL, firstName, lastName, age, position, salary, workExperience, passportNumber);
    }
}
