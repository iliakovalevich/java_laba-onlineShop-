package online.shop.entity;

public class Order {
    String id;
    String nameOrder;
    String priceOrder;
    boolean completedOrder;

    public boolean isCompletedOrder() {
        return completedOrder;
    }

    public void setCompletedOrder(boolean completedOrder) {
        this.completedOrder = completedOrder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public String getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(String priceOrder) {
        this.priceOrder = priceOrder;
    }
}
