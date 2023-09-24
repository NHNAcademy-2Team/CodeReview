package unit.seven;

//Exercise 07.11: 행렬 M은 i와 j가 다른 경우(i.e., 주 대각선에 없는 경우)에만 대각선 행렬로 간주됩니다.
//static boolean diagonal(int[][] M)라는 프레디케이트를 작성하세요.
//이 프레디케이트는 행렬 M이 대각선 행렬인 경우 true를 반환하고, 그렇지 않은 경우 false를 반환해야 합니다.
//* 대각행렬 : 대각선 제외한 다른 값은 모두 0
public class Exercise11 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 0, 0, 0, 0},
                {0, 2, 0, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 0, 4, 0},
                {0, 0, 0, 0, 5}
        };

        int[][] n = {
                {1, 0, 3},
                {0, 2, 0},
                {0, 0, 3}
        };

        System.out.println(diagonal(m));    //true
        System.out.println(diagonal(n));    //false
    }

    public static boolean diagonal(int[][] m) {
        int count = 0;
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[0].length; j++) {
                if (i != j) {
                    if (m[i][j] != 0) {
                        count++;
                    }
                }
            }
        }

        if(count > 0) {
            return false;
        }
        return true;
    }
}