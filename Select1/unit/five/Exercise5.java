package unit.five;

import java.util.Scanner;

public class Exercise5 {
    //보류
    //이차 방정식 a * x2 + b * x + c = 0의 계수 a, b, c를 입력으로 받고 방정식의 근을 계산하는 프로그램을 작성하세요.
    //b2 - 4 * a * c의 판별식의 부호에 따라 프로그램은 두 개의 서로 다른 실근, 실수 해 두 개 또는 두 개의 복소수 해를 출력해야 합니다.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a : ");
        System.out.print("b : ");
        System.out.print("c : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
    }

    public static int compute(int a, int b, int c) {
        return 0;
    }

}
