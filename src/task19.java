import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double amount = input.nextDouble();

        double discount = 0;

        if (amount > 500) {
            discount = 0.20;
        } else if (amount >= 300) {
            discount = 0.15;
        } else if (amount >= 100) {
            discount = 0.10;
        }

        double total = amount - amount * discount;

        System.out.printf("Final amount: %.2f AZN", total);
    }
}