package app.controllers;


import app.models.Order;
import app.models.OrderA;
import app.views.OrderAView;
import app.views.OrderView;

public class OrderAController extends OrderController {

    public void handleData() {
        OrderView view = new OrderAView();

        String[] data = view.getData();

        String code = data[0];

        Order product = new OrderA(code);

        String cost = getCost(product, data);

        String output = "\nOrder " + code + " is USD " +
                cost + "\nAddress: " + data[3];

        view.getOutput(output);
    }
}
