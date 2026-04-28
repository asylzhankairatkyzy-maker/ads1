import java.util.Arrays;

public class BubbleSortTask {
    public static void execute(int[] arr) {
        System.out.println("Bubble Sort");

        for (int i = 1; i <= 3; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println(" " + i + ": " + Arrays.toString(arr) + " [cite: 15]");
            if (!swapped) {
                System.out.println("No swaps");
                break;
            }
        }
        System.out.println();
    }
}