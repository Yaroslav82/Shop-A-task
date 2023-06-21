package app.models;

public abstract class Order {

    private String code;

    public Order(String code) {
        this.code = code;
    }

    public abstract double getOrderCost(double quota, double price);

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
