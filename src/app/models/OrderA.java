package app.models;

public class OrderA extends Order {

    public OrderA(String code) {
        super(code);
    }

    @Override
    public double getOrderCost(double quota, double price) {
        return quota * price;
    }
}
