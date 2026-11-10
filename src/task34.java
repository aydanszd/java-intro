import java.util.Scanner;

public class task34 {
    public static void main(String[] args) {
        final String PASSWORD = "secure123";

        Scanner input = new Scanner(System.in);

        System.out.print("Door open? (true/false): ");
        boolean door = input.nextBoolean();
        System.out.print("Owner home? (true/false): ");
        boolean home = input.nextBoolean();
        System.out.print("System active? (true/false): ");
        boolean active = input.nextBoolean();
        System.out.print("Password: ");
        String pass = input.next();

        if (active && door && !home) {
            System.out.println("ALARM!");
        } else if (active && home && pass.equals(PASSWORD)) {
            System.out.println("System turned off");
        } else {
            System.out.println("No alarm");
        }
    }
}