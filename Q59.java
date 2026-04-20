// Q59: Check if a string is a Palindrome.
import java.util.Scanner;

public class Q59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String normalized = input.replaceAll("\s+", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(normalized).reverse();
        System.out.println(normalized.equals(reversed.toString()) ? "Palindrome" : "Not a palindrome");
    }
}
