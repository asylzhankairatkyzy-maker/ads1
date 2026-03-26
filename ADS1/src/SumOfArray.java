public class SumOfArray {
    public static int sumOfArray(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }
}
