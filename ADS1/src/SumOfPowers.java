public class SumOfPowers {
    public static int sumOfPowers(int b, int n) {
        if (n == 0) return 1; // b^0 = 1
        return (int) Math.pow(b, n) + sumOfPowers(b, n - 1);
    }
}