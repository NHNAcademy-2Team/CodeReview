package unit.seven;

/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.8
 * What does the following method calculate?
 * public static int mystery(int[] A) {
 *   int x = 0;
 *   for (int i = 0; i < A.length; i++)
 *     if (A[i] % 2 == 1) x++;
 *   return x;
 * }
 */
public class Exercise8 {
    // 문제. What does the following method calculate?
    // 답. 배열 안에 elements 중 홀수인 element의 개수 구하는 메서드
    public static int mystery(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] % 2 == 1) x++;
        return x;
    }
}
