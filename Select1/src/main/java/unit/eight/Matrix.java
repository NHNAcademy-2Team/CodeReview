package unit.eight;

import java.io.*;
import java.util.StringTokenizer;

public class Matrix {
    private double[][] data;

    public Matrix(int n, int m){
        data = new double[n][m];
    }

    public void save(String filename){
        try(PrintWriter writer = new PrintWriter(new FileWriter(filename))){
            writer.println(data.length);
            writer.println(data[0].length);
            for(double[] row: data){
                for (int i = 0; i < data[0].length ; i++) {
                    writer.print(row[i]);
                    if(i != data[0].length - 1) {
                        writer.print(" ");
                    }
                }
                writer.println();
            }
            System.out.println("행렬이 성공적으로 파일에 저장되었습니다.");
        } catch(IOException e) {
            System.out.println("파일을 쓸 수 없습니다: " + e.getMessage());
        }
    }

    public static Matrix read(String filename){
        Matrix matrix = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            matrix = new Matrix(n,m);
            for(int i = 0; i < n; i++){
                StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
                for (int j = 0; j < m ; j++) {
                    matrix.data[i][j] = Double.parseDouble(tokenizer.nextToken());
                }
            }
        } catch (IOException e){
            System.out.println("파일을 읽을 수 없습니다: " + e.getMessage());
        }
        return matrix;
    }

    public Matrix sum(Matrix m){
        if(data.length != m.data.length || data[0].length != m.data[0].length){
            return null;
        }
        Matrix result = new Matrix(data.length, data[0].length);
        for (int i = 0; i < data.length ; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result.data[i][j] = data[i][j] + m.data[i][j];
            }
        }
        return result;
    }

    public Matrix product(Matrix m){
        if(data[0].length != m.data.length){
            return null;
        }
        Matrix result = new Matrix(data.length, m.data[0].length);
        for (int i = 0; i < data.length ; i++) {
            for (int j = 0; j < m.data[0].length; j++) {
                for (int k = 0; k < data[0].length ; k++) {
                    result.data[i][j] += data[i][k] * m.data[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(2,3);
        matrix.data[0] = new double[]{1,2,3};
        matrix.data[1] = new double[]{4,5,6};

        matrix.save("/Users/hongjiwon/Desktop/NewGit/Select1/src/main/java/unit/eight/txtfile/Exercise9");

        Matrix readMatrix = read("/Users/hongjiwon/Desktop/NewGit/Select1/src/main/java/unit/eight/txtfile/Exercise9");
        readMatrix.save("/Users/hongjiwon/Desktop/NewGit/Select1/src/main/java/unit/eight/txtfile/read_Exercise9");

        Matrix sumMatrix = matrix.sum(readMatrix);
        if(sumMatrix != null) {
            sumMatrix.save("/Users/hongjiwon/Desktop/NewGit/Select1/src/main/java/unit/eight/txtfile/sum_Exercise9");
        } else {
            System.out.println("행렬의 크기가 동일하지 않아 덧셈을 수행할 수 없습니다.");
        }

        Matrix productMatrix = matrix.product(readMatrix);
        if(productMatrix != null){
            productMatrix.save("/Users/hongjiwon/Desktop/NewGit/Select1/src/main/java/unit/eight/txtfile/product_Exercise9");
        } else {
            System.out.println("행렬의 크기가 호환되지 않아 곱셈을 수행할 수 없습니다.");
        }
    }
}
