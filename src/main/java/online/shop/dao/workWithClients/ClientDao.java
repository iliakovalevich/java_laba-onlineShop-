package online.shop.dao.workWithClients;

import online.shop.entity.persons.Client;

import javax.sql.DataSource;
import java.util.List;

public interface ClientDao {

    void createClient(String firstName, String lastName);

    Client getClientById(int id);

    List listClients();

    void removeClient(int id);

    void updateClient(String firstName, String lastName, int idClient);

}
