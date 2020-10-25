package online.shop.entity.orders;

public class Order {
    private int idOrder;
    private String nameOrder;
    private double priceOrder;

    public Order(int idOrder, String nameOrder, double priceOrder) {
        this.idOrder = idOrder;
        this.nameOrder = nameOrder;
        this.priceOrder = priceOrder;
    }

    public Order() {

    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
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

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + getIdOrder() +
                ", nameOrder='" + getNameOrder() + '\'' +
                ", priceOrder=" + getPriceOrder() +
                '}';
    }
}
