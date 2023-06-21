package app.models;

public class OrderB extends Order {

    double delivery;

    public OrderB(String code, double delivery) {

        this.delivery = delivery;
    }

    public double getOrderCost(double quantity, double price) {
        return  quantity * price + delivery;
    }
}
