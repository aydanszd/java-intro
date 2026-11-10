import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        System.out.println("Initial: " + num);
        System.out.println("num++: " + num++);
        System.out.println("++num: " + ++num);
        System.out.println("num--: " + num--);
        System.out.println("--num: " + --num);
    }
}