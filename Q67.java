// Q67: Find the factorial of a number using Recursion.
import java.util.Scanner;

public class Q67 {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(factorial(n));
    }
}
