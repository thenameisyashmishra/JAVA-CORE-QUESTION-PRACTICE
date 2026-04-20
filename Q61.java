// Q61: Convert a string to lowercase/uppercase.
import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());
    }
}
