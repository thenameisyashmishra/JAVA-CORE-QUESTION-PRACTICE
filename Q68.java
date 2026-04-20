// Q68: Find the GCD of two numbers using Recursion.
import java.util.Scanner;

public class Q68 {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Math.abs(scanner.nextInt());
        int b = Math.abs(scanner.nextInt());
        scanner.close();
        System.out.println(gcd(a, b));
    }
}
