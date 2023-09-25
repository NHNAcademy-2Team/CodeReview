package src.main.java.unit.seven;

public class Exercise9 {

    static boolean symmetric(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            if (M.length != M[i].length) {
                return false;
            }
        }
        return true;
    }
}
