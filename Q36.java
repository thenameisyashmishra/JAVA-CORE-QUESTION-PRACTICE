// Q36: Find the sum and average of array elements.
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        scanner.close();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (n > 0 ? (double) sum / n : 0));
    }
}
