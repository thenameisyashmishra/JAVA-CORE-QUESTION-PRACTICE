// Q15: Check if a character is a vowel or consonant.
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("Not an alphabet");
        } else {
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
        scanner.close();
    }
}
