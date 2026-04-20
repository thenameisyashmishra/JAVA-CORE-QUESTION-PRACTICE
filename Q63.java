// Q63: Remove all characters in a string except alphabets.
import java.util.Scanner;

public class Q63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        StringBuilder filtered = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                filtered.append(ch);
            }
        }
        System.out.println(filtered.toString());
    }
}
