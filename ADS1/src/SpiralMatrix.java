public class SpiralMatrix {
    public static void printSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        fillSpiral(matrix, 0, 0, n, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void fillSpiral(int[][] matrix, int startRow, int startCol, int size, int num) {
        if (size <= 0) return;

        for (int i = 0; i < size; i++) {
            matrix[startRow][startCol + i] = num++;
        }

        for (int i = 1; i < size; i++) {
            matrix[startRow + i][startCol + size - 1] = num++;
        }

        if (size > 1) {
            for (int i = size - 2; i >= 0; i--) {
                matrix[startRow + size - 1][startCol + i] = num++;
            }
        }

        if (size > 1) {
            for (int i = size - 2; i >= 1; i--) {
                matrix[startRow + i][startCol] = num++;
            }
        }

        fillSpiral(matrix, startRow + 1, startCol + 1, size - 2, num);
    }
}