package unit.seven;

/* Exercise 7.9
 * A matrix M is said to be symmetric if it is square (i.e., has the same number of rows and columns)
 * and M[i][j] is equal to M[j][i], for each pair of valid indexes i and j.
 *
 * Write a predicate static boolean symmetric(int[][] M)
 * that returns true if the matrix M is symmetric, and false otherwise.
 */
public class Exercise9 {
    public static boolean symmetric(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (M[i][j] != M[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 4},
                {2, 3, 5,},
                {4, 5, 6}
        };

        int[][] b = {
                {1, 2, 2},
                {2, 3, 4,},
                {3, 4, 4}
        };

        System.out.println(symmetric(a));
        System.out.println(symmetric(b));
    }
}
