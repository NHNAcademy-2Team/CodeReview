package unit.seven;

public class Exercise8 {
    public static int mystery(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                x++;
            }
        }
        return x;
    }

    // 배열 안에 들어있는 홀수를 짝수로 바꾸는 작업

}
