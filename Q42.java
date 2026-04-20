// Q42: Merge two arrays.
import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = scanner.nextInt();
        scanner.close();
        int[] merged = new int[n1 + n2];
        System.arraycopy(arr1, 0, merged, 0, n1);
        System.arraycopy(arr2, 0, merged, n1, n2);
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
