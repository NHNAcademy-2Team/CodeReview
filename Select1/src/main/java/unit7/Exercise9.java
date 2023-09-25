package src.main.java.unit7;

public class Exercise9 {

    static boolean symmetric(int[][] M) {
        // M배열이 정사각형(?) 일때 ture를 return;
        for (int i = 0 ; i < M.length ; i++) {
            if (M.length != M[i].length) {
                return false;
            }
        }
        return true;
    }
}
