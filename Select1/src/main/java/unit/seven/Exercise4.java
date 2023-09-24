package unit.seven;

import java.util.Scanner;

public class Exercise4 {
    /**
     *
     * Exercise 07.4 Write a method, static int[] matrixSumColumns(int[][]), that takes as parameter a matrix and
     * returns an array with one element for each column of the matrix; the element of index i of the array must be
     * equal to the sum of the elements of column i of the matrix.
     * */

    static int[] matrixSumColumns(int[][] matrix){
        int[] result = new int[matrix[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i] += matrix[j][i];
            }
        }
        return result;
    }

    static int[][] inputMaterix(Scanner scanner, int[][] materix){
        for (int i = 0; i < materix.length; i++) {
            for (int j = 0; j < materix[0].length; j++) {
                materix[i][j] = scanner.nextInt();
            }
        }
        return materix;
    }

    static void printMaterix(int[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] materix = new int[row][column];

        materix = inputMaterix(scanner, materix);
        printMaterix(matrixSumColumns(materix));

        scanner.close();
    }
}
