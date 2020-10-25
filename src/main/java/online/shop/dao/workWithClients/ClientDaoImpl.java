package online.shop.dao.workWithClients;

import online.shop.entity.persons.Client;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class ClientDaoImpl implements ClientDao {
    private JdbcTemplate jdbcTemplate;


    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createClient(String firstName, String lastName) {
        String SQL = "INSERT INTO clients (firstName,lastName) VALUES (?,?)";
        jdbcTemplate.update(SQL, firstName, lastName);
    }

    @Override
    public Client getClientById(int id) {
        String SQL = "SELECT * FROM clients WHERE id = ?";
        return jdbcTemplate.queryForObject(SQL, new Object[]{id}, new ClientMapper());
    }

    @Override
    public List listClients() {
        String SQL = "SELECT * FROM clients";
        return jdbcTemplate.query(SQL, new ClientMapper());
    }

    @Override
    public void removeClient(int id) {
        String SQL = "DELETE FROM clients WHERE id = ?";
        jdbcTemplate.update(SQL, id);
    }

    @Override
    public void updateClient(String firstName, String lastName, int idClient) {
        String SQL = "UPDATE clients SET firstName = ?, lastName = ? WHERE idClient = ?";
        jdbcTemplate.update(SQL, firstName, lastName, idClient);
    }
}
