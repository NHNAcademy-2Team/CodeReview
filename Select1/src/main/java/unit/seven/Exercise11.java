package unit.seven;

public class Exercise11 {

    /*
     * diagonal
     * 1 0 0 0 0
     * 0 1 0 0 0
     * 0 0 1 0 0
     * 0 0 0 1 0
     * 0 0 0 0 1
     *
     */
    public static boolean diagonal(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if ((i == j && M[i][j] == 0) || (i != j && M[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };

        int[][] b = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 2},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };


        System.out.println(diagonal(a));
        System.out.println(diagonal(b));
    }
}
