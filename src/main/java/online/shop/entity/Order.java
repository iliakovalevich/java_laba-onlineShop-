package online.shop.entity;

public class Order extends Product{
    int idOrder;
    String nameOrder;
    double priceOrder;
    boolean completedOrder;

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public boolean isCompletedOrder() {
        return completedOrder;
    }

    public void setCompletedOrder(boolean completedOrder) {
        this.completedOrder = completedOrder;
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
}
