// Q16: Find the roots of a quadratic equation.
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();
        if (a == 0) {
            if (b == 0) {
                System.out.println(c == 0 ? "Infinite solutions" : "No solution");
            } else {
                System.out.println("Linear root: " + (-c / b));
            }
            return;
        }
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1);
            System.out.println(root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println(root);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-discriminant) / (2 * a);
            System.out.println(real + " + " + imag + "i");
            System.out.println(real + " - " + imag + "i");
        }
    }
}
