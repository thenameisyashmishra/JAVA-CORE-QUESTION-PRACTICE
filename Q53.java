// Q53: Check if two matrices are equal.    Phase 4: Strings
import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int[][] m1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = scanner.nextInt();
            }
        }
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int[][] m2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        if (r1 != r2 || c1 != c2) {
            System.out.println("Not equal");
            return;
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if (m1[i][j] != m2[i][j]) {
                    System.out.println("Not equal");
                    return;
                }
            }
        }
        System.out.println("Equal");
    }
}
