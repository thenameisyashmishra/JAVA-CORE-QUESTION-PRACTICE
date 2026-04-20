// Q55: Copy one string to another without strcpy.
import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        scanner.close();
        StringBuilder copy = new StringBuilder();
        for (char ch : source.toCharArray()) {
            copy.append(ch);
        }
        System.out.println(copy.toString());
    }
}
