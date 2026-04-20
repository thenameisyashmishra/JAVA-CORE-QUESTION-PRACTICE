// Q11: Convert days into years, weeks, and days.
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDays = scanner.nextInt();
        int years = totalDays / 365;
        int remaining = totalDays % 365;
        int weeks = remaining / 7;
        int days = remaining % 7;
        System.out.println(years + " years, " + weeks + " weeks, " + days + " days");
        scanner.close();
    }
}
