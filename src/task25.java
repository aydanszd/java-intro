import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter consumption (kWh): ");
        double kwh = input.nextDouble();

        double bill = 0;

        if (kwh <= 100) {
            bill = kwh * 0.08;
        } else if (kwh <= 200) {
            bill = 8 + (kwh - 100) * 0.10;
        } else {
            bill = 18 + (kwh - 200) * 0.15;
        }

        System.out.printf("Total bill: %.2f AZN", bill);
    }
}