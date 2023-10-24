package unit.eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import unit.nine.ExceptionWrongMatrixDimension;
import unit.nine.ExceptionWrongMatrixValue;

public class Matrix {
    private int n;
    private int m;
    private int[][] matrix;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = new int[n][m];
    }

    public int getN() {
        return this.n;
    }

    public int getM() {
        return this.m;
    }

    public int getMatrixElement(int n, int m) {
        return this.matrix[n][m];
    }

    public void setMatrix(int n, int m, int result) {
        this.matrix[n][m] = result;
    }

    public void save(String filename) throws IOException {
        FileWriter f = new FileWriter(filename);
        try (PrintWriter out = new PrintWriter(f)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    out.print(matrix[i][j] + " ");
                }
                out.println();
            }
        }
    }

    public static Matrix read(String filename) throws IOException, ExceptionWrongMatrixDimension {
        Matrix newMatrix = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            if (line == null) {
                return newMatrix;
            }
            String[] nm = line.split(" ");
            newMatrix = new Matrix(Integer.parseInt(nm[0]), Integer.parseInt(nm[1]));
            for (int i = 0; i < Integer.parseInt(nm[0]); i++) {
                String[] m = br.readLine().split(" ");
                for (int j = 0; j < Integer.parseInt(nm[1]); j++) {
                    newMatrix.setMatrix(i, j, Integer.parseInt(m[j]));
                }
            }
        }
        if(newMatrix == null){
            throw new ExceptionWrongMatrixDimension("행렬이 될 수 없는 파일입니다.");
        }
        return newMatrix;
    }

    public Matrix sum(Matrix m) throws ExceptionWrongMatrixValue {
        if (this.m != m.getM() || this.n != m.getN()) {
            throw new ExceptionWrongMatrixValue("형식이 맞지 앖습니다.");
        }
        Matrix newMatrix = new Matrix(m.getM(), m.getN());
        for (int i = 0; i < m.getM(); i++) {
            for (int j = 0; j < m.getN(); j++) {
                newMatrix.setMatrix(i, j, this.getMatrixElement(i, j) + m.getMatrixElement(i, j));
            }
        }
        return newMatrix;
    }

    public Matrix product(Matrix m) throws ExceptionWrongMatrixValue {
        if (this.m != m.getM() || this.n != m.getN()) {
            throw new ExceptionWrongMatrixValue("형식이 맞지 앖습니다.");
        }
        Matrix newMatrix = new Matrix(m.getM(), m.getN());
        for (int i = 0; i < m.getM(); i++) {
            for (int j = 0; j < m.getN(); j++) {
                newMatrix.setMatrix(i, j, this.getMatrixElement(i, j) * m.getMatrixElement(i, j));
            }
        }
        return newMatrix;
    }

    public void printMatrix() {
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}