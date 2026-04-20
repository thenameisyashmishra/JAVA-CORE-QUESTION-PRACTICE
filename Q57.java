// Q57: Compare two strings without strcmp.
import java.util.Scanner;

public class Q57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        scanner.close();
        if (s1.length() != s2.length()) {
            System.out.println("Not equal");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println("Not equal");
                return;
            }
        }
        System.out.println("Equal");
    }
}
