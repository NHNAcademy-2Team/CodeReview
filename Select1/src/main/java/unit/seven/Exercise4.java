package unit.seven;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] num = new int[3][5];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        for(int[] nums : num) {
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(matrixSumColumns(num)));
    }

    public static int[] matrixSumColumns(int[][] num) {
        int[] result = new int[num[0].length];
        for (int i = 0; i < num[0].length; i++) {
            for (int j = 0; j < num.length; j++) {
                result[i] += num[j][i];
            }
        }
        return result;
    }
}
