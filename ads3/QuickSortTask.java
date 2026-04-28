import java.util.Arrays;

public class QuickSortTask {
    public static void execute(int[] arr) {
        System.out.println(" Quick Sort ");

        int pivot = arr[0];
        int high = arr.length - 1;

        int temp = arr[0]; arr[0] = arr[high]; arr[high] = temp;

        int i = 0;
        for (int j = 0; j < high; j++) {
            if (arr[j] <= pivot) {
                int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
                i++;
            }
        }
        int t2 = arr[i]; arr[i] = arr[high]; arr[high] = t2;

        System.out.println("pivot (" + pivot + "): Index " + i + " [cite: 6]");
        System.out.println("Result: " + Arrays.toString(arr) + "\n");
    }
}