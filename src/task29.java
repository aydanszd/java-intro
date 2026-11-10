import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int qty = input.nextInt();
        System.out.print("Promo code: ");
        String promo = input.next();
        System.out.print("Delivery (1 - Standard, 2 - Express): ");
        int delivery = input.nextInt();

        if (price <= 0 || qty <= 0) {
            System.out.println("Error: Price and quantity must be positive");
        } else if (delivery != 1 && delivery != 2) {
            System.out.println("Error: Invalid delivery type");
        } else {
            double total = price * qty;

            if (promo.equals("JAVA10")) {
                total = total - total * 0.10;
            }

            double shipping = 0;
            if (total <= 200) {
                shipping = (delivery == 1) ? 5 : 10;
            }

            total = total + shipping;

            System.out.println("Delivery fee: " + shipping + " AZN");
            System.out.println("Total: " + total + " AZN");
        }
    }
}