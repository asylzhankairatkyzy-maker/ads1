public class SumOfIntegers {
    public static int sumOfIntegers(int n) {
        if (n == 0) return 0;
        return n + sumOfIntegers(n - 1);
    }
}