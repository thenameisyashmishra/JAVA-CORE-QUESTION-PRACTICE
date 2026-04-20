// Q62: Sort a set of strings in alphabetical order.
import java.util.Arrays;
import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        scanner.close();
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
