package chapter.seven;

public class Exercise3 {
    public static double[][] transposeMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                double temp;
                temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        double[][] m = {
                {1.0, 2.0},
                {3.0, 4.0},
                {5.0, 6.0}};

        transposeMatrix(m);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(m[i][j]);
            }
        }

    }
}
