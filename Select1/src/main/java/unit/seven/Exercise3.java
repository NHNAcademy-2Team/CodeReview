package src.main.java.unit.seven;

public class Exercise3 {

    static double[][] transposeMatrix(double[][] M) {
        double[][] W = new double[M[0].length][M.length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                W[j][i] = M[i][j];
            }
        }
        return W;
    }
}
