package unit.seven;

public class Exercise9 {

    static boolean symmetric(int[][] Matrix) {

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                if (Matrix[i][j] != Matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
