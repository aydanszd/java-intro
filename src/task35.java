import java.util.Scanner;

public class task35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("GPA (0-100): ");
        double gpa = input.nextDouble();
        System.out.print("Family income: ");
        double income = input.nextDouble();
        System.out.print("Has failed a course? (true/false): ");
        boolean failed = input.nextBoolean();
        System.out.print("Volunteering? (true/false): ");
        boolean volunteer = input.nextBoolean();

        if (gpa < 0 || gpa > 100) {
            System.out.println("Error: GPA must be between 0 and 100");
            return;
        }

        int scholarship = 0;

        if (!failed) {
            if (gpa >= 90) {
                scholarship = 100;
            } else if (gpa >= 80) {
                scholarship = 50;
            } else if (gpa >= 70) {
                scholarship = 25;
            }
        }

        if (scholarship > 0 && volunteer) {
            scholarship += 5;
        }

        if (scholarship > 100) {
            scholarship = 100;
        }

        System.out.println("Student: " + name);
        System.out.println("Scholarship: " + scholarship + "%");

        if (gpa > 90 && income < 500) {
            System.out.println("Social priority: Yes");
        }
    }
}