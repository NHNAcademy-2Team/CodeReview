package main.java.unit.seven;


import java.util.Arrays;

public class Exercise9 {
    /*
     * m[i][j]와 m[j][i]가 대칭인지
     * */
    public static boolean symmetric(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (Arrays.equals(m[i][j], m[j][i])) {
                    return true;
                } else
                    return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] m = {
                {1, 3, 4, 6},
                {3, 1, 5, 7},
                {4, 5, 1, 8},
                {6, 7, 8, 1}
        };

        System.out.println(symmetric(m));

    }
}
