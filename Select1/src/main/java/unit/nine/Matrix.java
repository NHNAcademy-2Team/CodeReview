package unit.nine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


// 보류중
// 보류중
// 보류중
// 보류중
// 보류중
public class Matrix {
    private int[][] matrix;
    private int row;
    private int column;

    public Matrix(int n, int m) {
        matrix = new int[n][m];

        this.row = n;
        this.column = m;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public Matrix(int[][] m) {
        this.matrix = m;
        this.row = m.length;
        this.column = m[0].length;
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void setMatrix(int matrix[][]) {
        this.matrix = matrix;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public void save(String filename) {
        try {
            PrintWriter out = new PrintWriter(filename);

            out.println(this.row + " " + this.column);
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < this.column; j++) {
                    out.print(matrix[i][j] + " ");
                }
                out.println();
            }
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    * 2 3
    *
    * 1 1 1
    * 2 2 2
    *
    * */
    public static Matrix read(String filename) throws IOException, ExceptionWrongMatrixValues {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        String mInfo[] = line.split(" ");
        Matrix matrix = new Matrix(Integer.parseInt(mInfo[0]), Integer.parseInt(mInfo[1]));
        int m[][] = matrix.getMatrix();

        try {
            for(int i = 0; i < m.length; i++) {
                line = br.readLine();
                for(int j = 0; j < m[i].length; j++) {
                    if(m[i].length != Integer.parseInt(mInfo[1]) || m.length != Integer.parseInt(mInfo[0])) {
                        throw new ExceptionWrongMatrixValues("각 행의 열 수가 동일하지 않습니다.");
                    }
                    m[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
        }
        catch(NumberFormatException e) {
            throw new ExceptionWrongMatrixValues("정수가 아닌 요소가 포함되어 있습니다.");
        }

        fr.close();
        br.close();
        matrix.setMatrix(m);

        return matrix;

    }

    public Matrix sum(Matrix m) {
        if(this.row != m.getRow() || this.column != m.getColumn()) {
            return null;
        }

        Matrix result = new Matrix(this.row, this.column);

        int temp[][] = m.getMatrix();

        for(int i = 0; i < this.row; i++) {
            for(int j = 0; j < this.column; j++) {
                temp[i][j] += matrix[i][j];
            }
        }

        result.setMatrix(temp);
        return result;
    }

    public Matrix product(Matrix m) {
        if(this.row != m.getColumn() || this.column != m.getRow()) {
            return null;
        }

        Matrix result = new Matrix(this.row, m.getColumn());
        int[][] mt = result.getMatrix();
        for(int i = 0; i < this.row; i++) {
            for(int j = 0; j < m.getColumn(); j++) {
                for(int k = 0; k < this.column; k++) {
                    mt[i][j] += matrix[i][k] * m.getMatrix()[k][j];
                }
            }
        }
        result.setMatrix(mt);
        return result;
    }

    public static void main(String[] args) throws IOException {

        try {
            read("src/main/java/unit/resource/nineMatrixData");
        } catch(ExceptionWrongMatrixValues e) {
            System.out.println(e.getMessage());
        }
    }
}
