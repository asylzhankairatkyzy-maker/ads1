import java.util.Arrays;

public class HeapSortTask {
    public static void execute(int[] arr) {
        System.out.println("Heap Sort");

        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);

        int max = arr[0];
        arr[0] = arr[n - 1];
        heapify(arr, n - 1, 0);

        System.out.println("Extra: " + max + " ");
        System.out.println( Arrays.toString(Arrays.copyOf(arr, n - 1)) + "\n");
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i, l = 2 * i + 1, r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) largest = l;
        if (r < n && arr[r] > arr[largest]) largest = r;
        if (largest != i) {
            int swap = arr[i]; arr[i] = arr[largest]; arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}