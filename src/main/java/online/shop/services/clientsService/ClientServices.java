package online.shop.services.clientsService;

import online.shop.dao.workWithClients.ClientDaoImpl;
import online.shop.entity.persons.Client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ClientServices implements Serializable {
    private static final long serialVersionUID = 1L;


    final List<Client> clientsList = new ArrayList<>();

    public void saveClient(Client client) {
        clientsList.add(client);
    }

    public void saveClientFromDB() {
        ClientDaoImpl clientDao = new ClientDaoImpl();
        clientsList.addAll(clientDao.listClients());
    }

    public void removeClient(int idClient) {
        clientsList.stream().filter(c->!(c.getIdClient()==idClient));
//        ListIterator<Client> clientListIterator = clientsList.listIterator();
//        int index = 0;
//        while (clientListIterator.hasNext()) {
//            Client nextClient = clientListIterator.next();
//            if (nextClient.getIdClient() == idClient) {
//                index = clientListIterator.nextIndex();
//                break;
//            }
//        }
//        clientsList.remove(index);
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