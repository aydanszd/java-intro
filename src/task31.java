import java.util.Scanner;

public class task31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.print("Ticket price: ");
        double price = input.nextDouble();
        System.out.print("Baggage weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Business class? (true/false): ");
        boolean isBusiness = input.nextBoolean();

        if (age < 0) {
            System.out.println("Error: Age cannot be negative");
            return;
        }
        if (price <= 0) {
            System.out.println("Error: Ticket price must be positive");
            return;
        }
        if (weight < 0) {
            System.out.println("Error: Baggage weight cannot be negative");
            return;
        }

        double ticket = price;

        if (age < 2) {
            ticket = 0;
        } else if (age <= 12) {
            ticket = price * 0.50;
        } else if (age > 60) {
            ticket = price * 0.80;
        }

        double baggage = 0;
        if (weight > 20) {
            baggage = (weight - 20) * 5;
        }

        double total = ticket + baggage;

        if (isBusiness) {
            total = total * 1.30;
        }

        System.out.println("Total price: " + total + " AZN");
    }
}