// Q44: Linear Search: Find an element in an array.
import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value == target && index == -1) {
                index = i;
            }
        }
        scanner.close();
        System.out.println(index == -1 ? "Not found" : "Found at index " + index);
    }
}
