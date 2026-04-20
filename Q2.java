// Q2: Read an integer/float/char and print it.
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            System.out.println(value);
        } else if (scanner.hasNextFloat()) {
            float value = scanner.nextFloat();
            System.out.println(value);
        } else if (scanner.hasNext()) {
            String token = scanner.next();
            char value = token.charAt(0);
            System.out.println(value);
        }
        scanner.close();
    }
}
