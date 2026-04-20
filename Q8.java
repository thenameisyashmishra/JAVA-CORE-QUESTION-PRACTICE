// Q8: Check if a number is even or odd (using modulus operator).
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n % 2 == 0) ? "Even" : "Odd");
        scanner.close();
    }
}
