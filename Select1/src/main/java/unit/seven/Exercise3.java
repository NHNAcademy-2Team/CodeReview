package src.main.java.unit.seven;

public class Exercise3 {

    static double[][] transposeMatrix(double[][] Matrix) {
        double[][] W = new double[Matrix[0].length][Matrix.length];
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                W[j][i] = Matrix[i][j];
            }
        }
        return W;
    }
}
