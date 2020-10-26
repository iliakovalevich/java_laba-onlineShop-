package online.shop.services.clientsService;

import online.shop.dao.workWithClients.ClientDaoImpl;
import online.shop.entity.persons.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ClientServices implements Serializable {
    ApplicationContext context =
            new ClassPathXmlApplicationContext("jdbctemplate-config.xml");
    ClientDaoImpl clientDao=(ClientDaoImpl) context.getBean("jdbcTemplateClientDao");

    private static final long serialVersionUID = 1L;

    final List<Client> clientsList = new ArrayList<>();

    public void saveClient(Client client) {
        clientsList.add(client);
    }

    public void saveClientFromDB() {
        ClientDaoImpl clientDao = new ClientDaoImpl();
        clientsList.addAll(clientDao.listClients());
    }

    public List getAllClientsFromDB(){
        return clientDao.listClients();
    }

    public List getAllClients() {
        return clientsList;
    }

    @Override
    public String toString() {
        return "clientsList=" + clientsList +
                '}';
    }

}
