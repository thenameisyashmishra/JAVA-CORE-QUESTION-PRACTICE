// Q41: Remove duplicate elements from an array.
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }
        scanner.close();
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
