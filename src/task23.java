import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        final int BALANCE = 1000;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: ");
        int amount = input.nextInt();

        if (amount <= 0) {
            System.out.println("Error: Amount must be positive");
        } else if (amount % 10 != 0) {
            System.out.println("Error: Amount must be divisible by 10");
        } else if (amount > BALANCE) {
            System.out.println("Error: Insufficient balance");
        } else {
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + (BALANCE - amount) + " AZN");
        }
    }
}