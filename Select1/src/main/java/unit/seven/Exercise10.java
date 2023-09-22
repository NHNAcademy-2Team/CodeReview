package unit.seven;

public class Exercise10 {
    /*
     *  lower triangular
     *  1 0 0 0 0
     *  1 1 0 0 0
     *  1 1 1 0 0
     *  1 1 1 1 0
     *  1 1 1 1 1
     */

    public static boolean lowerTriangular(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 1 + i; j < M[0].length; j++) {
                if (M[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] M = {
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0,},
                {1, 1, 1, 0, 0,},
                {1, 1, 1, 1, 0,},
                {1, 1, 1, 1, 1,},
        };

        System.out.println(lowerTriangular(M));
    }
}
