package app;

import app.controllers.OrderAController;
import app.controllers.OrderBController;
import app.controllers.OrderController;

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        filterOption(getOption());
    }

    private static int getOption() {
        System.out.println("""
                Choose an option:
                1 - order without delivery
                2 - order with delivery
                """);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void filterOption(int option) {
        switch (option) {
            case 1 -> {
                OrderController controller = new OrderAController();
                controller.handleData();
            }
            case 2 -> {
                OrderController controller = new OrderBController();
                controller.handleData();
            }
        }
    }
}
