package unit.seven;

public class Exercise4 {
    public static int[] matrixSumColumns(int[][] m) {
        int[] c = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            c[i] = 0;
            for (int j = 0; j < m[i].length; j++) {
                c[i] += m[i][j];
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

