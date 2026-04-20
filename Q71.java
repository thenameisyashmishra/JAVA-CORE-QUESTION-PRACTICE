// Q71: Calculate the power of a number using Recursion.
import java.util.Scanner;

public class Q71 {
    public static double power(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent < 0) return 1 / power(base, -exponent);
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        int exponent = scanner.nextInt();
        scanner.close();
        System.out.println(power(base, exponent));
    }
}
