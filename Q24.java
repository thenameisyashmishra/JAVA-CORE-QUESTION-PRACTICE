// Q24: Check if a number is an Armstrong number (e.g., 153).
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int original = n;
        int digits = String.valueOf(Math.abs(n)).length();
        int sum = 0;
        while (n != 0) {
            int digit = Math.abs(n % 10);
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        System.out.println(sum == original ? "Armstrong" : "Not an Armstrong");
    }
}
