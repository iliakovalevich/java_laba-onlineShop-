package online.shop.entity;

public class Client extends Person {
    private int idClient;

    public Client(String firstName, String lastName, int idClient) {
        super(firstName, lastName);
        this.idClient = idClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    void about() {
    }
}
