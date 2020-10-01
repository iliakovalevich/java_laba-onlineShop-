package online.shop.dao.workWithEmployees;

import online.shop.entity.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        String passportNumber=rs.getString("passportNumber");
        String firstName=rs.getString("firstName");
        String lastName=rs.getString("lastName");
        int age=rs.getInt("age");
        String position=rs.getString("position");
        double salary=rs.getDouble("salary");
        double workExperience=rs.getDouble("workExperience");
        Employee employee=new Employee(passportNumber,firstName,lastName,age,position,salary,workExperience);
        return employee;
    }
}