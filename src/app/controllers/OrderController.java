package app.controllers;

import app.models.Order;
import app.utils.Rounder;

public abstract class OrderController implements DataHandler {

    protected String getCost(Order product, String[] data) {
        return Rounder.roundValue(
                product.getOrderCost(Integer.parseInt(data[1]),
                        Double.parseDouble(data[2]))
        );
    }
}
