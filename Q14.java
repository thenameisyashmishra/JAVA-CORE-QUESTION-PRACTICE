// Q14: Check if a year is a leap year.
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(isLeap ? "Leap year" : "Not a leap year");
        scanner.close();
    }
}
