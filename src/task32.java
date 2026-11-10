import java.util.Scanner;

public class task32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Minutes: ");
        int minutes = input.nextInt();
        System.out.print("Internet (GB): ");
        double gb = input.nextDouble();
        System.out.print("SMS: ");
        int sms = input.nextInt();

        if (minutes < 0 || gb < 0 || sms < 0) {
            System.out.println("Error: Values cannot be negative");
            return;
        }

        double total = 10;

        if (minutes > 100) {
            total = total + (minutes - 100) * 0.05;
        }
        if (gb > 5) {
            total = total + (gb - 5) * 2;
        }
        if (sms > 100) {
            total = total + (sms - 100) * 0.02;
        }

        System.out.println("Total bill: " + total + " AZN");
    }
}