package unit.seven;

public class Exercise4 {

    static int[] matrixSumColumns(int[][] x) {
        int[] sum = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                sum[i] += x[j][i];
            }
        }
        return sum;
    }
}
