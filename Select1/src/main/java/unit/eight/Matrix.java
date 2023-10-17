package unit.eight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


// 다 못 품 잠깐 기달기달
public class Matrix {
    private int[][] matrix;
    private int weight;
    private int height;

    public Matrix(int n, int m) {
        matrix = new int[n][m];

        this.weight = n;
        this.height = m;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void setMatrix(int matrix[][]) {
        this.matrix = matrix;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

    public void save(String filename) {
        try {
            PrintWriter out = new PrintWriter(filename);

            for(int i = 0; i < weight; i++) {
                for(int j = 0; j < this.height; j++) {
                    out.print(matrix[i][j] + " ");
                }
                out.println();
            }
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Matrix read(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line;


        return new Matrix(0,0);
//        Matrix m = new Matrix();
    }

    public Matrix sum(Matrix m) {
        if(this.weight != m.getWeight() || this.height != m.getHeight()) {
            return null;
        }

        Matrix result = new Matrix(this.weight, this.height);

        int temp[][] = m.getMatrix();

        for(int i = 0; i < this.weight; i++) {
            for(int j = 0; j < this.height; j++) {
                temp[i][j] += matrix[i][j];
            }
        }

        result.setMatrix(temp);
        return result;
    }

    public Matrix product(Matrix m) {
        return new Matrix(1,1);
    }

    public static void main(String[] args) {
        Matrix m = new Matrix(3, 4);

        m.save("src/main/java/unit/resource/matrixData");

    }
}
