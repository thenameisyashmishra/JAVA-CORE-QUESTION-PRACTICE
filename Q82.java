// Q82: Count set bits in an integer.
import java.util.Scanner;

public class Q82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(Integer.bitCount(number));
    }
}
