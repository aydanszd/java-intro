import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Math: ");
        int math = input.nextInt();
        System.out.print("Informatics: ");
        int info = input.nextInt();
        System.out.print("English: ");
        int eng = input.nextInt();

        double avg = (math + info + eng) / 3.0;

        if (math < 0 || math > 100 || info < 0 || info > 100 || eng < 0 || eng > 100) {
            System.out.println("Error: Scores must be between 0 and 100");
        } else if (math < 40) {
            System.out.println("Not admitted");
        } else if (avg >= 80) {
            System.out.println("Admitted");
        } else if (avg >= 60) {
            System.out.println("Waiting list");
        } else {
            System.out.println("Not admitted");
        }
    }
}