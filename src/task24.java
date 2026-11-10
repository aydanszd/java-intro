import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        final double PRICE = 12;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = input.nextBoolean();

        double discount = 0;

        if (age < 7) {
            discount = 0.50;
        } else if (age <= 17) {
            discount = 0.30;
        } else if (age > 60) {
            discount = 0.40;
        } else if (isStudent) {
            discount = 0.20;
        }

        double total = PRICE - PRICE * discount;

        System.out.printf("Ticket price: %.2f AZN", total);
    }
}