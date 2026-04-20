// Q39: Insert an element at a specific position in an array.
import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int element = scanner.nextInt();
        int position = scanner.nextInt();
        if (position < 0 || position > n) {
            System.out.println("Invalid position");
        } else {
            for (int i = n; i > position; i--) {
                arr[i] = arr[i - 1];
            }
            arr[position] = element;
            for (int i = 0; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
