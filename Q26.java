// Q26: Reverse a given integer.
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        System.out.println(sign * reversed);
    }
}
