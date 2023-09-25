package unit.seven;

/* Exercise 7.11
 * A matrix M is said to be diagonal if all elements M[i][j] with i different from j
 * (i.e., that are not on the main diagonal) are equal to 0.
 *
 * Write a predicate static boolean diagonal(int[][] M)
 * that returns true if the matrix M is diagonal, and false otherwise.
 */
public class Exercise11 {

    /*
     * diagonal
     * 1 0 0 0 0
     * 0 1 0 0 0
     * 0 0 1 0 0
     * 0 0 0 1 0
     * 0 0 0 0 1
     *
     */
    public static boolean diagonal(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if ((i == j && M[i][j] == 0) || (i != j && M[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };

        int[][] b = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 2},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };


        System.out.println(diagonal(a));
        System.out.println(diagonal(b));
    }
}
