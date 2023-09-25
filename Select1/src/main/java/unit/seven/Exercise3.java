package unit.seven;

public class Exercise3 {
    public static double[][] transposeMatrix(double[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m[0].length; j++) {
                double temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        double[][] m = {
                {3.0, 5.0, 4.0},
                {2.5, 3.5, 5.6},
                {7.5, 2.0, 5.3}
        };

        /* 치환 전 배열 */
        System.out.println("치환 전");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        transposeMatrix(m);

        System.out.println("치환 후");
        for (double[] array : transposeMatrix(m)) {
            for (double arr : array){
                System.out.print(arr + "\t");
            }
            System.out.println();
        }
    }
}

