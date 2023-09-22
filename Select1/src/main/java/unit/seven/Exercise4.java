package unit.seven;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] num = new int[3][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        System.out.println(Arrays.toString(matrixSumColumns(num)));
    }

    public static int[] matrixSumColumns(int[][] num) {
        int[] result = new int[3];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                sum += num[j][i];
            }
            result[i] = sum;
        }
        return result;
    }
}
