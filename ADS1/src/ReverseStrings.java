import java.util.Scanner;

public class ReverseStrings {
    public static void readAndPrintStringsReverse(int n, Scanner scanner) {
        if (n == 0) return;
        String str = scanner.next();
        readAndPrintStringsReverse(n - 1, scanner);
        System.out.println(str);
    }
}
