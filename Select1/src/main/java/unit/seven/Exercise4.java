package unit.seven;

/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.4
 * Write a method, static int[] matrixSumColumns(int[][]), that takes as parameter a matrix and returns an array with one element for each column of the matrix;
 * the element of index i of the array must be equal to the sum of the elements of column i of the matrix.
 */
public class Exercise4 {
    public static int[] matrixSumColumns(int[][] matrix) {
        int[] matrixSumColumns = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixSumColumns[i] += matrix[j][i];
            }
        }
        return matrixSumColumns;
    }

    public static void printMatrix(int[][] matrixs) {
        for (int[] matrix : matrixs) {
            for (int m : matrix) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    public static void printArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void matrixSumColumnsTest() {
        int[][] matrix = {{1, 2, 3, 10}, {4, 5, 6, 10}, {7, 8, 9, 10}};
        System.out.println("Matrix");
        printMatrix(matrix);
        System.out.println("Sum Columns");
        printArr(matrixSumColumns(matrix));
    }

    public static void main(String[] args) {
        matrixSumColumnsTest();
    }
}
