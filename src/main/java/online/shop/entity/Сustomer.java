package online.shop.entity;

public class Сustomer extends Person {
    int idOrder;
    double priceOrder;

    public Сustomer(String firstName, String lastName, Sex sexPerson, int idOrder, double priceOrder) {
        super(firstName, lastName, sexPerson);
        this.idOrder = idOrder;
        this.priceOrder = priceOrder;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public double getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(double priceOrder) {
        this.priceOrder = priceOrder;
    }

    void about() {

    }
}
