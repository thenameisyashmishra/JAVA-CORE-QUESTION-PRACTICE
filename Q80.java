// Q80: Bit Manipulation: Check if the -th bit is set.
import java.util.Scanner;

public class Q80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int position = scanner.nextInt();
        scanner.close();
        boolean isSet = (number & (1 << position)) != 0;
        System.out.println(isSet ? "Bit is set" : "Bit is not set");
    }
}
