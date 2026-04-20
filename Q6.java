// Q6: Calculate Simple Interest and Compound Interest.
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100.0;
        double amount = principal * Math.pow(1 + rate / 100.0, time);
        double compoundInterest = amount - principal;
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
        scanner.close();
    }
}
