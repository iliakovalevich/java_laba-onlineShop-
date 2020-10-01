package online.shop.entity.persons;

public class Client extends Person {
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

}
