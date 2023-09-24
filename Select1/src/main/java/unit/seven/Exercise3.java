package CodeReview.Select1.src.main.java.unit.seven;

import java.util.Arrays;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        double[][] m = new double[2][3];
        Random rnd = new Random();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = rnd.nextInt(9) + 1;
            }
        }

        for(double[] result : m) {
            System.out.println(Arrays.toString(result));
        }

        for(double[] result : transposeMatrix(m)) {
            System.out.println(Arrays.toString(result));
        }
    }

    public static double[][] transposeMatrix(double[][] m) {
        double[][] result = new double[3][2];
        for (int j = 0; j < m[0].length; j++) {
            for (int i = 0; i < m.length; i++) {
                result[j][i] = m[i][j];
            }
        }
        return result;
    }
}
