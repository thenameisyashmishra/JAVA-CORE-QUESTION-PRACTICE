// Q12: Calculate the ASCII value of a character.    Phase 2: Control Flow (Conditionals & Loops)  Conditionals (If/Else/Switch)
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println((int) ch);
        scanner.close();
    }
}
