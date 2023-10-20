package unit.seven;

public class Exercise3 {
    public static double[][] transposeMatrix(double[][] M) {
        double temp;
        for (int i = 0; i < M.length - 1; i++) {
            for (int j = i + 1; j < M[0].length; j++) {
                temp = M[i][j];
                M[i][j] = M[j][i];
                M[j][i] = temp;
            }
        }
        return M;
    }

    public static void printMatrix(double[][] matrixs) {
        for (double[] matrix : matrixs) {
            for (double m : matrix) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrixTest() {
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Before");
        printMatrix(matrix);
        double[][] transposeMatrix = transposeMatrix(matrix);
        System.out.println("After");
        printMatrix(transposeMatrix);
    }

    public static void main(String[] args) {
        transposeMatrixTest();
    }
}
