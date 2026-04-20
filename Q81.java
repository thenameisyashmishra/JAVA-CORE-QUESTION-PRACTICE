// Q81: Bit Manipulation: Toggle the -th bit.
import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int position = scanner.nextInt();
        scanner.close();
        int toggled = number ^ (1 << position);
        System.out.println(toggled);
    }
}
