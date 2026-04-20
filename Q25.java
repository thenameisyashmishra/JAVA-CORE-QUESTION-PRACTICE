// Q25: Check if a number is a Strong number (sum of factorial of digits = number).
import java.util.Scanner;

public class Q25 {
    public static int factorial(int x) {
        int result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int original = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        System.out.println(sum == original ? "Strong number" : "Not a strong number");
    }
}
