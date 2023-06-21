package app.models;

public class OrderB extends Order {

    double delivery;

    public OrderB(String code, double delivery) {
        super(code);
        this.delivery = delivery;
    }

    @Override
    public double getOrderCost(int quantity, double price) {
        return  quantity * price + delivery;
    }
}
