package src.main.java.unit.seven;

public class Exercise11 {

    static boolean diagonal(int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (Matrix[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
