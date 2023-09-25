package src.main.java.unit.seven;

public class Exercise10 {

    static boolean lowerTriangular(int[][] M) {
        for (int i = 1; i < M.length; i++) {
            if (M[i - 1].length >= M[i].length) {
                return false;
            }
        }
        return true;
    }
}
