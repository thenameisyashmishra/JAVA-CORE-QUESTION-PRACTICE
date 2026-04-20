// Q20: Generate the Fibonacci sequence up to N terms.
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
