package unit.seven;

//Exercise 07.9: 행렬 M은 정사각형이며(i.e., 행과 열의 수가 동일),
//각 유효한 인덱스 i와 j 쌍에 대해 M[i][j]가 M[j][i]와 동일한 경우에 대해 대칭이라고 합니다.
//static boolean symmetric(int[][] M)라는 메소드를 작성하세요.
//이 메소드는 행렬 M이 대칭인 경우 true를 반환하고, 그렇지 않은 경우 false를 반환해야 합니다.
public class Exercise9 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 2, 3, 7},
                {2, 5, 6, 8},
                {3, 6, 9, 10},
                {7, 8, 10, 11}
        };

        int[][] n = {
                {1, 2, 3, 6},
                {2, 5, 6, 8},
                {3, 9, 9, 10},
                {7, 8, 10, 11}
        };

        System.out.println(symmetric(m));   //true
        System.out.println(symmetric(n));   //false
    }

    public static boolean symmetric(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = i+1; j < m.length; j++) {
                if (m[i][j] != m[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
