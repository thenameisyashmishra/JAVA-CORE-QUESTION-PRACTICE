// Q13: Find the largest of three numbers.
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double max = Math.max(a, Math.max(b, c));
        System.out.println(max);
        scanner.close();
    }
}
