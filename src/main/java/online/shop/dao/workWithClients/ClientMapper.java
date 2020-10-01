package online.shop.dao.workWithClients;

import online.shop.entity.Client;
import online.shop.entity.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper implements RowMapper {
    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
        int idClient=rs.getInt("idClient");
        String firstName=rs.getString("firstName");
        String lastName=rs.getString("lastName");
        Client client=new Client(firstName,lastName,idClient);
        return client;
    }
}