package unit.seven;

/*
 * Exercise 7.4
 * Write a method, static int[] matrixSumColumns(int[][]), that takes as parameter a matrix
 * and returns an array with one element for each column of the matrix;
 *
 * the element of index i of the array must be equal to the sum of the elements of column i of the matrix.
 */
public class Exercise4 {
    public static int[] matrixSumColumns(int[][] a) {
        int[] result = new int[a[0].length];

        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i] += a[j][i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };

        int[] result = matrixSumColumns(a);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
