// Q65: Create a function to check for Prime/Armstrong/Perfect numbers.
import java.util.Scanner;

public class Q65 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(Math.abs(n)).length();
        int sum = 0;
        while (n != 0) {
            int digit = Math.abs(n % 10);
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    public static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Armstrong: " + isArmstrong(number));
        System.out.println("Perfect: " + isPerfect(number));
    }
}
