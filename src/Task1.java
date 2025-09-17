import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double SHIPPING_FEE = 0.02;
        double itemPrice;
        double shippingCost;
        double totalPrice;

        System.out.println("Enter the price of an item:");

        if (scan.hasNextDouble()) {
            itemPrice = scan.nextDouble();
            if (itemPrice >= 100) {
                shippingCost = itemPrice * SHIPPING_FEE;
                totalPrice = itemPrice + shippingCost;
                System.out.println("The total price of your item is $" + totalPrice + " with a shipping fee of 2%.");
            } else {
                totalPrice = itemPrice;
                System.out.println("The total price of your item is $" + totalPrice + " with free shipping.");
            }
        } else {
            System.out.println("ERROR: You did not enter a valid price.");
        }
    }
}