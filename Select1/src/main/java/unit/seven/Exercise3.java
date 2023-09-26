package unit.seven;

import java.util.Scanner;

public class Exercise3 {
    /**
     *
     * Exercise 07.3 Write a method static double[][] transposeMatrix(double[][] M) that returns a new matrix
     * that is the transpose of the matrix M. We recall that the transpose of a matrix M is obtained by exchanging
     * the rows with the columns, which corresponds to exchange M[i][j] with M[j][i], for each pair of valid indexes i and j.
     * */

    static double[][] transposeMatrix(double[][] M){
        double[][] arrays = new double[M[0].length][M.length];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                arrays[i][j] = M[j][i];
            }
        }
        return arrays;
    }

    static double[][] inputMatrix(Scanner scanner, double[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        return matrix;
    }

    static void printArrays(double[][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        double[][] matrix = new double[row][column];

        matrix = inputMatrix(scanner, matrix);
        printArrays(transposeMatrix(matrix));

        scanner.close();
    }
}
