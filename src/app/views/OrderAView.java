package app.views;

import java.util.Scanner;

public class OrderAView extends OrderView {

    @Override
    public String[] getData() {
        String[] data = super.getData();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter store/office address: ");
        String address = scanner.nextLine();

        return new String[] {data[0], data[1], data[2], address};
    }
}
