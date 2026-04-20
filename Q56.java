// Q56: Concatenate two strings without strcat.
import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        scanner.close();
        StringBuilder result = new StringBuilder(s1);
        for (char ch : s2.toCharArray()) {
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}
