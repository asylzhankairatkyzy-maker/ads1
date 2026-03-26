public class SumOfSquares {
        public static int sumOfSquares(int n) {
            if (n == 0) return 0;
            return n * n + sumOfSquares(n - 1);
        }

}

