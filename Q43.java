// Q43: Rotate an array left or right by N positions.
import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        char direction = scanner.next().charAt(0);
        int positions = scanner.nextInt();
        scanner.close();
        positions %= n;
        if (positions < 0) positions += n;
        int[] rotated = new int[n];
        if (direction == 'L' || direction == 'l') {
            for (int i = 0; i < n; i++) {
                rotated[i] = arr[(i + positions) % n];
            }
        } else {
            for (int i = 0; i < n; i++) {
                rotated[i] = arr[(i - positions + n) % n];
            }
        }
        for (int num : rotated) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
