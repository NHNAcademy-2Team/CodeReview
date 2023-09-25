package src.main.java.unit.seven;

public class Exercise11 {

    static boolean diagonal(int[][] M) {
        for (int i = 2; i < M.length; i++) {
            if (M[i].length - M[i - 1].length != M[i - 1].length - M[i - 2].length) {
                return false;
            }
        }
        return true;
    }
}
