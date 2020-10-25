package online.shop.dao.workWithClients;

import online.shop.entity.persons.Client;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper implements RowMapper<Client>{
    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
        Client client = new Client();
        client.setIdClient(rs.getInt("idClient"));
        client.setFirstName(rs.getString("firstName"));
        client.setLastName(rs.getString("lastName"));
        return client;
    }
}