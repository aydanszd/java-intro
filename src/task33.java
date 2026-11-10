import java.util.Scanner;

public class task33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Salary: ");
        double salary = input.nextDouble();
        System.out.print("Experience (years): ");
        int years = input.nextInt();
        System.out.print("Score (0-100): ");
        int score = input.nextInt();

        if (salary <= 0) {
            System.out.println("Error: Salary must be positive");
            return;
        }
        if (years < 0) {
            System.out.println("Error: Experience cannot be negative");
            return;
        }
        if (score < 0 || score > 100) {
            System.out.println("Error: Score must be between 0 and 100");
            return;
        }

        double bonus = 0;

        if (years > 5) {
            bonus += salary * 0.10;
        }

        if (score >= 90) {
            bonus += salary * 0.15;
        } else if (score >= 70) {
            bonus += salary * 0.05;
        }

        double total = salary + bonus;

        System.out.println("Employee: " + name);
        System.out.println("Bonus: " + bonus + " AZN");
        System.out.println("Total salary: " + total + " AZN");
    }
}