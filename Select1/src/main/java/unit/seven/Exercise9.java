package unit.seven;

public class Exercise9 {
    /**
     *
     * Exercise 07.9 A matrix M is said to be symmetric if it is square (i.e., has the same number of rows and columns)
     * and M[i][j] is equal to M[j][i], for each pair of valid indexes i and j.
     * Write a predicate static boolean symmetric(int[][] M) that returns true if the matrix M is symmetric, and false otherwise.
     * */

    static boolean symmetric(int[][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if(arrays[i][j] != arrays[j][i])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arrays = {{1, 2, 3},
                          {2, 4, 5},
                          {3, 5, 6}
        };
        System.out.println(symmetric(arrays));
    }
}
