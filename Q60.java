// Q60: Count the number of vowels, consonants, digits, and spaces in a string.
import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                spaces++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if ("aeiou".indexOf(lower) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
