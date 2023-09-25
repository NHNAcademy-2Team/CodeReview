package unit.seven;


/* Exercise 7.10
 * A matrix M is said to be lower triangular if all elements M[i][j] with i<j
 * (i.e., that are "above" the main diagonal) are equal to 0.
 *
 * Write a predicate static boolean lowerTriangular(int[][] M)
 * that returns true if the matrix M is lower triangular, and false otherwise.
 */
public class Exercise10 {
    /*
     *  lower triangular
     *  1 0 0 0 0
     *  1 1 0 0 0
     *  1 1 1 0 0
     *  1 1 1 1 0
     *  1 1 1 1 1
     */

    public static boolean lowerTriangular(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 1 + i; j < M[0].length; j++) {
                if (M[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] M = {
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0,},
                {1, 1, 1, 0, 0,},
                {1, 1, 1, 1, 0,},
                {1, 1, 1, 1, 1,},
        };

        System.out.println(lowerTriangular(M));
    }
}
