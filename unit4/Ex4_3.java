package unit4;

import java.util.Scanner;

/* 
 * 키보드에서 정수 두 개를 읽고 출력
 *  - 산술 평균 (합계를 2로 나눈 값)
 *  - 기하 평균(곱의 제곱근)
 *  - 두 숫자 중 더 큰 숫자와 더 작은 숫자
 */

public class Ex4_3 {
    public static int arithmeticMean(int sum) {
        return sum / 2;
    }

    public static double geometricMean(int sum) {
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int sum = x + y;

        System.out.println("산술 평균은 " + arithmeticMean(sum));
        System.out.print("기하 평균은 ");
        System.out.printf("%.3f", geometricMean(sum));
        System.out.println();
        if (arithmeticMean(sum) > geometricMean(sum)) {
            System.out.println("산술 평균이 더 큽니다.");
        } else
            System.out.println("기하 평균이 더 큽니다,");
    }
}
