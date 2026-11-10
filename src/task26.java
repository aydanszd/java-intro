import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        final double PRICE = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("Sorry " + name + ", reservation is not possible.");
            return;
        }

        System.out.print("Number of nights: ");
        int nights = input.nextInt();
        System.out.print("VIP customer? (true/false): ");
        boolean isVip = input.nextBoolean();

        double base = PRICE * nights;
        double longStay = nights > 5 ? base * 0.10 : 0;
        double vip = isVip ? (base - longStay) * 0.15 : 0;
        double total = base - longStay - vip;

        System.out.println("RESERVATION RECEIPT");
        System.out.println("Customer: " + name);
        System.out.println("Base price (" + nights + " nights): " + base + " AZN");
        System.out.println("Long stay discount: -" + longStay + " AZN");
        System.out.println("VIP discount: -" + vip + " AZN");
        System.out.println("TOTAL: " + total + " AZN");
    }
}