package unit.seven;

public class Exercise11 {
    static boolean diagonal(int[][] M) {
        if (M.length != M[0].length) {
            throw new IllegalArgumentException("정방행렬이 아니기 때문에 대각행렬의 조건이 될 수 없습니다.");
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (i != j && M[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void diagonalTest() {
        int[][][] testMatrix = {
                {{1, 0, 0}, {4, 5, 6}, {7, 8, 9}},
                {{1, 0, 0}, {0, 7, 0}, {0, 0, 9}},
                {{1, 0, 0, 0}, {2, 7, 0, 0}, {3, 8, 9, 0}}
        };
        for (int[][] test : testMatrix) {
            System.out.println(diagonal(test));
        }
    }

    public static void main(String[] args) {
        diagonalTest();
    }
}
