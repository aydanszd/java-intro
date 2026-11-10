import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = input.nextInt();
        System.out.print("Enter side b: ");
        int b = input.nextInt();
        System.out.print("Enter side c: ");
        int c = input.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Triangle does not exist");
        } else if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}