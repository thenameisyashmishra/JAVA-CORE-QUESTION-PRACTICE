// Q70: Reverse a sentence using Recursion.
import java.util.Scanner;

public class Q70 {
    public static void printReverse(String[] words, int index) {
        if (index < 0) return;
        System.out.print(words[index]);
        if (index > 0) System.out.print(" ");
        printReverse(words, index - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();
        String[] words = sentence.split(" ");
        printReverse(words, words.length - 1);
        System.out.println();
    }
}
