import java.util.Scanner;

public class ReverseSequence {
    public static void readAndPrintReverse(int n, Scanner scanner) {
        if (n == 0) return;
        int num = scanner.nextInt();
        readAndPrintReverse(n - 1, scanner);
        System.out.print(num + " ");
    }
}