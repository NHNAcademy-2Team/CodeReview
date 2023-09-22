package unit.seven;

public class Exercise9 {
    public static boolean symmetric(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (M[i][j] != M[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 4},
                {2, 3, 5,},
                {4, 5, 6}
        };

        int[][] b = {
                {1, 2, 2},
                {2, 3, 4,},
                {3, 4, 4}
        };

        System.out.println(symmetric(a));
        System.out.println(symmetric(b));
    }
}
