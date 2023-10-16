package eight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Matrix {

    private int[][] matrix;

    public Matrix(int n, int m) {
        matrix = new int[n][m];
    }

    public void setMatrix(int row, int column, int data) {
        this.matrix[row][column] = data;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void save(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    bw.write(matrix[i][j] + " ");
                }
                bw.write("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Matrix sizeMatrix(String filename) {
        int row = 1;
        int column = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String[] arrays = br.readLine().split(" ");
            column = arrays.length;

            while (br.readLine() != null) {
                row++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Matrix matrix = new Matrix(row, column);
        return matrix;
    }

    public static Matrix read(String filename) {
        Matrix matrix = sizeMatrix(filename);

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            for (int i = 0; i < matrix.getMatrix().length; i++) {
                String[] data = br.readLine().split(" ");

                for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                    matrix.setMatrix(i, j, Integer.parseInt(data[j]));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return matrix;
    }

    private boolean samecheck(Matrix matrix) {
        if (this.matrix.length == matrix.getMatrix().length && this.matrix[0].length == matrix.getMatrix()[0].length)
            return true;
        else {
            return false;
        }
    }

    public Matrix sum(Matrix matrix) {

        if (samecheck(matrix)) {
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[0].length; j++) {
                    matrix.setMatrix(i, j, matrix.getMatrix()[i][j] + this.matrix[i][j]);
                }
            }
        } else {
            throw new IllegalArgumentException("null");
        }
        return matrix;
    }

    public Matrix product(Matrix matrix) {
        Matrix productMatrix;

        if (this.matrix[0].length == matrix.getMatrix().length) {
            productMatrix = new Matrix(this.matrix.length, matrix.getMatrix()[0].length);

            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                    for (int k = 0; k < this.matrix[0].length; k++) {
                        productMatrix.setMatrix(i, j, this.matrix[i][k] * matrix.getMatrix()[k][j]);
                    }
                    matrix.setMatrix(i, j, matrix.getMatrix()[i][j] * this.matrix[i][j]);
                }
            }
        } else {
            throw new IllegalArgumentException("null");
        }
        return productMatrix;
    }
}
