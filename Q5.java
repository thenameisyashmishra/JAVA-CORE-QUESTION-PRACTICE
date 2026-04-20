// Q5: Convert temperature from Celsius to Fahrenheit (and vice versa).
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = scanner.nextDouble();
        String unit = scanner.next().trim();
        if (unit.equalsIgnoreCase("C")) {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Fahrenheit: " + fahrenheit);
        } else if (unit.equalsIgnoreCase("F")) {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println("Celsius: " + celsius);
        } else {
            System.out.println("Invalid unit");
        }
        scanner.close();
    }
}
