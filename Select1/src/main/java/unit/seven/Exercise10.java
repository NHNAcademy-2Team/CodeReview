package unit.seven;

//Exercise 07.10: 행렬 M은 모든 요소 M[i][j]가 i<j (i.e., 주 대각선 위쪽에 있는 요소)인 경우에만 하삼각 행렬로 간주됩니다. 
//static boolean lowerTriangular(int[][] M)라는 프레디케이트를 작성하세요. 
//이 프레디케이트는 행렬 M이 하삼각 행렬인 경우 true를 반환하고, 그렇지 않은 경우 false를 반환해야 합니다.
public class Exercise10 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 0, 0, 0},
                {5, 2, 0, 0},
                {6, 7, 3, 0},
                {8, 9, 10, 4}
        };

        int[][] n = {
                {1, 0, 0, 7},
                {5, 2, 0, 0},
                {6, 7, 3, 0},
                {8, 9, 10, 4}
        };

        System.out.println(lowerTriangular(m)); //true
        System.out.println(lowerTriangular(n)); //false
    }

    public static boolean lowerTriangular(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i < j) {
                    if (m[i][j] != 0) {
                        count++;
                    }
                }
            }
        }

        if (count > 0) {
            return false;
        }
        return true;
    }
}