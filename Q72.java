// Q72: Find the sum of natural numbers using Recursion.
import java.util.Scanner;

public class Q72 {
    public static int sumNatural(int n) {
        return n <= 1 ? n : n + sumNatural(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(sumNatural(n));
    }
}
