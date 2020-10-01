package online.shop.dao.workWithEmployees;

import online.shop.entity.persons.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee=new Employee();
        employee.setPassportNumber(rs.getString("passportNumber"));
        employee.setFirstName(rs.getString("firstName"));
        employee.setLastName(rs.getString("lastName"));
        employee.setAge(rs.getInt("age"));
        employee.setPost(rs.getString("post"));
        employee.setSalary(rs.getDouble("salary"));
        employee.setWorkExperience(rs.getDouble("workExperience"));
        return employee;
    }
}