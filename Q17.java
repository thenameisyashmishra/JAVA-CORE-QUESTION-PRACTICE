// Q17: Create a simple calculator using switch case.
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double b = scanner.nextDouble();
        scanner.close();
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
