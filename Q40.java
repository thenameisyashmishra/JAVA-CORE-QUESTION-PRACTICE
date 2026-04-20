// Q40: Delete an element from a specific position.
import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int position = scanner.nextInt();
        scanner.close();
        if (position < 0 || position >= n) {
            System.out.println("Invalid position");
            return;
        }
        for (int i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
