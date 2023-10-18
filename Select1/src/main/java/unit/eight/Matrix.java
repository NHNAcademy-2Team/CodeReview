package unit.eight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Matrix {

    private int n;
    private int m;
    private int[][] size;

    public Matrix(int n, int m) {

        this.size = new int[n][m];
    }

    public void save(String filename) {
        File file = new File("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/resources/" + filename);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));) {

            for (int i = 0; i < size.length; i++) {
                for (int j = 0; j < size[0].length; j++) {

                    bw.write(size[i][j] + " ");
                }
                bw.write("\r\n");
            }

        } catch (IOException e) {
            System.out.println("잘못된 입력입니다.");
        }
    }

    public static Matrix read(String filename) {
        File file = new File("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/resources/" + filename);
        String[] value;
        Matrix matrix = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file));) {

            matrix = sizeMatrix(br);
            String line;

            while ((line = br.readLine()) != null) {
                value = line.split(" ");
                for (int i = 0; i < matrix.getMatrix().length; i++) {
                    for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                        matrix.setMatrix(i, j, Integer.valueOf(value[j]));
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("잘못된 입력입니다.");
//        } catch (ExceptionWroneMatrixValues ewmv) {

        }

        return matrix;
    }

    private static Matrix sizeMatrix(BufferedReader br) {
        String line;
        int row = 0;
        int column = 0;
        String[] value;

        try {
            while ((line = br.readLine()) != null) {
                row++;
                value = line.split(" ");
                column = value.length;
            }

        } catch (IOException e) {
            System.out.println("잘못된 입력입니다.");
        }

        Matrix matrix = new Matrix(row, column);
        return matrix;
    }

    public void setMatrix(int row, int column, int value) {
        this.size[row][column] = value;
    }

    public int[][] getMatrix() {
        return this.size;
    }

    public Matrix sum(Matrix x) {
        Matrix fresh;
        int row = x.getMatrix().length;
        int column = x.getMatrix()[0].length;
        if (n == row && m == column) {
            fresh = new Matrix(n, m);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    fresh.setMatrix(i, j, this.getMatrix()[i][j] + x.getMatrix()[i][j]);
                }
            }

            return fresh;
        }

        return null;
    }

    public Matrix product(Matrix x) {
        Matrix fresh;
        int row = x.getMatrix().length;
        int column = x.getMatrix()[0].length;

        if (m == row) {
            fresh = new Matrix(n, column);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < column; j++) {
                    for (int k = 0; k < this.getMatrix()[0].length; k++) {
                        fresh.setMatrix(i, j, this.getMatrix()[i][k] * x.getMatrix()[k][j]);
                    }
                }
            }

            return fresh;
        }

        return null;
    }

}
