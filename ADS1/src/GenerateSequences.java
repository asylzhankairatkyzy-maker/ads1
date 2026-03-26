public class GenerateSequences {
    public static void generateSequences(int n, int k) {
        generateSequencesHelper(new int[n], 0, n, k);
    }

    private static void generateSequencesHelper(int[] seq, int index, int n, int k) {
        if (index == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(seq[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            seq[index] = i;
            generateSequencesHelper(seq, index + 1, n, k);
        }
    }
}