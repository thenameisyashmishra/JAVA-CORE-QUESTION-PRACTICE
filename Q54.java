// Q54: Find the length of a string without using strlen.
import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        System.out.println(length);
    }
}
