package online.shop.entity.persons;

import java.io.Serializable;

public class Client extends Person implements Serializable {

    private int idClient;

    public Client(String firstName, String lastName, int idClient) {
        super(firstName, lastName);
        this.idClient = idClient;
    }

    public Client() {
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + getIdClient() +", "+
                super.toString() +
                '}';
    }
}
