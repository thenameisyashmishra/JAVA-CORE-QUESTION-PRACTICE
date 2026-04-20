// Q9: Check if a number is even or odd (using bitwise operators).
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(((n & 1) == 0) ? "Even" : "Odd");
        scanner.close();
    }
}
