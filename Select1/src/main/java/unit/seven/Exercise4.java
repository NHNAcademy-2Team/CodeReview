package unit.seven;

public class Exercise4 {
    public static int[] matrixSumColumns(int[][] m) {
        int[] c = new int[m[0].length];
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                c[i] += m[j][i];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] m = {
                {2, 5, 6},
                {5, 6, 2},
                {6, 3, 8},
                {8, 4, 9}
        };

        int[] b = matrixSumColumns(m);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();


    }
}



