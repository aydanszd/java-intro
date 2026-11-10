import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean a = input.nextBoolean();
        boolean b = input.nextBoolean();

        System.out.println("AND: " + (a && b));
        System.out.println("OR: " + (a || b));
        System.out.println("XOR: " + (a ^ b));
    }
}