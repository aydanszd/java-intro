import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        final int BALANCE = 2000;
        final int LIMIT = 500;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = input.nextInt();
        System.out.print("Enter previous withdrawal: ");
        int prev = input.nextInt();

        if (amount <= 0) {
            System.out.println("Error: Amount must be greater than 0");
        } else if (amount > BALANCE) {
            System.out.println("Error: Insufficient balance");
        } else if (prev + amount > LIMIT) {
            System.out.println("Error: Daily limit exceeded");
        } else {
            System.out.println("Withdrawal successful");
            System.out.println("New balance: " + (BALANCE - amount) + " AZN");
        }
    }
}