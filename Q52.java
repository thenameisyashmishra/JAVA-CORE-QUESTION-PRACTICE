// Q52: Calculate the sum of diagonal elements.
import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = scanner.nextInt();
                if (i == j) {
                    sum += value;
                }
            }
        }
        scanner.close();
        System.out.println(sum);
    }
}
