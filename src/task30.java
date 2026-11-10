import java.util.Scanner;

public class task30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter color (red/yellow/green): ");
        String color = input.next();
        System.out.print("Is it night? (true/false): ");
        boolean isNight = input.nextBoolean();

        if (color.equals("red")) {
            System.out.println("Stop");
        } else if (color.equals("yellow")) {
            if (isNight) {
                System.out.println("Proceed with caution");
            } else {
                System.out.println("Get ready");
            }
        } else if (color.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid signal");
        }
    }
}