package unit.seven;

public class Exercise10 {

    static boolean lowerTriangular(int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = i + 1; j < Matrix[0].length; j++) {
                if (Matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
