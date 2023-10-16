package unit.eight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Matrix {

    private int n;
    private int m;
    private int[][] size;
    private String filename;

    public Matrix(int n, int m) {

        this.size = new int[n][m];
    }

    public void save(String filename) {
        this.filename = filename;
        File file = new File("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/resources/" + filename);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));) {

            for (int i = 0; i < size.length; i++) {
                for (int j = 0; j < size[0].length; j++) {
                    bw.write(size[i][j]);
                }
            }

        } catch (IOException e) {
            System.out.println("잘못된 입력입니다.");
        }
    }

    public static Matrix read(String filename) {

    }
}
