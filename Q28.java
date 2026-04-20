// Q28: Find the GCD (HCF) and LCM of two numbers.  Pattern Printing (Visual Logic)
import java.util.Scanner;

public class Q28 {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Math.abs(scanner.nextInt());
        int b = Math.abs(scanner.nextInt());
        scanner.close();
        int hcf = gcd(a, b);
        int lcm = (a == 0 || b == 0) ? 0 : (Math.abs(a / hcf * b));
        System.out.println("GCD: " + hcf);
        System.out.println("LCM: " + lcm);
    }
}
