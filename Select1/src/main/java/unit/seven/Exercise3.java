package unit.seven;

/* Exercise 7.3
 * Write a method static double[][] transposeMatrix(double[][] M)
 * that returns a new matrix that is the transpose of the matrix M.
 *
 * We recall that the transpose of a matrix M is obtained by exchanging the rows with the columns,
 * which corresponds to exchange M[i][j] with M[j][i], for each pair of valid indexes i and j.
 */
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
