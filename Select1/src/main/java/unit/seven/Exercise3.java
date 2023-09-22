package unit.seven;

// definition declaration
//

public class Exercise3 {
    public static double[][] transposeMatrix(double[][] M) {
        double[][] result = new double[M[0].length][M.length];

        for (int i = 0; i < M[0].length; i++) {
            for (int j = 0; j < M.length; j++) {
                result[i][j] = M[j][i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        double[][] a = {{1, 2}, {3, 4}, {5, 6}};

        double[][] result = transposeMatrix(a);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}
