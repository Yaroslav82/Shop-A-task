package app.controllers;


import app.models.Order;
import app.models.OrderB;
import app.utils.Rounder;
import app.views.OrderBView;
import app.views.OrderView;

public class OrderBController extends OrderController {

    public void handleData() {
        OrderView view = new OrderBView();

        String[] data = view.getData();

        String code = data[0];

        double price = Double.parseDouble(data[3]);

        Order product = new OrderB(code, price);

        String cost = getCost(product, data);

        String delivery = Rounder.roundValue(price);

        String output = "\nOrder " + code + " is USD " +
                cost + "\nDelivery is USD " + delivery;

        view.getOutput(output);
    }
}
