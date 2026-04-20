// Q22: Print all Prime numbers between 1 and N.
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int num = 2; num <= n; num++) {
            boolean prime = true;
            for (int div = 2; div <= Math.sqrt(num); div++) {
                if (num % div == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(num);
            }
        }
    }
}
