package src.main.java.unit.seven;

public class Exercise10 {

    /*
    static boolean lowerTriangular(int[][] M) {
        for (int i = 1; i < M.length; i++) {
            if (!(M[i - 1].length < M[i].length)) {
                return false;
            }
        }
        return true;
    }
    */
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
