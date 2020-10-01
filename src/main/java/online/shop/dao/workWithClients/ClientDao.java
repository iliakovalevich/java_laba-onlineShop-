package online.shop.dao.workWithClients;

import online.shop.entity.persons.Client;

import javax.sql.DataSource;
import java.util.List;

public interface ClientDao {
    public void setDataSource(DataSource dataSource);

    public void createClient(String firstName, String lastName);

    public Client getClientById(int id);

    public List listClients();

    public void removeClient(int id);

    public void updateClient(String firstName, String lastName, int idClient);

}
