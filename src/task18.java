import java.util.Scanner;

public class task18{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num = input.nextInt();

        int hundreds = num / 100;
        int ones = num % 10;

        if (hundreds == ones) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        input.close();
    }
}