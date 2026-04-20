// Q69: Solve the Tower of Hanoi problem.
import java.util.Scanner;

public class Q69 {
    public static void solve(int n, char source, char target, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        solve(n - 1, source, auxiliary, target);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        solve(n - 1, auxiliary, target, source);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        solve(n, 'A', 'C', 'B');
    }
}
