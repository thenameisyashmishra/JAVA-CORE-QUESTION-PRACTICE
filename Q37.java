// Q37: Find the largest and smallest element in an array.
import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("No elements");
            scanner.close();
            return;
        }
        int value = scanner.nextInt();
        int max = value;
        int min = value;
        for (int i = 1; i < n; i++) {
            value = scanner.nextInt();
            if (value > max) max = value;
            if (value < min) min = value;
        }
        scanner.close();
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
