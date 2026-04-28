import java.util.Arrays;

public class BinarySearchTask {
    public static void execute(int[] arr, int target) {
        System.out.println("Binary Search");

        Arrays.sort(arr);
        System.out.println("Sorted dataset: " + Arrays.toString(arr) + " ");

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("Low: " + low + ", High: " + high + ", Mid: " + mid + " ");
            if (arr[mid] == target) break;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println();
    }
}