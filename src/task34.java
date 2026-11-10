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

        if (!active) {
            System.out.println("System is off. No alarm");
        } else if (home && pass.equals(PASSWORD)) {
            System.out.println("System turned off");
        } else if (home && door) {
            System.out.println("Door is open, owner is home. No alarm");
        } else if (home) {
            System.out.println("Owner is home. Wrong password, system stays active");
        } else if (door) {
            System.out.println("ALARM!");
        } else {
            System.out.println("Door is closed. No alarm");
        }
    }
}