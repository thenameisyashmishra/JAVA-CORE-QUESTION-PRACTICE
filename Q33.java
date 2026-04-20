// Q33: Print Pascal’s Triangle.
import java.util.Scanner;

public class Q33 {
    public static int binomial(int n, int k) {
        int res = 1;
        for (int i = 0; i < k; i++) {
            res = res * (n - i) / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < rows; i++) {
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(binomial(i, j) + " ");
            }
            System.out.println();
        }
    }
}
