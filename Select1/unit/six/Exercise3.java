package Select1.unit.six;

import java.util.Scanner;

public class Exercise3 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            throw new ArithmeticException("음수입니다. 다시 입력하세요.");
        } else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int answer;
        answer = factorial(n);
        System.out.println(n + "의 계승 = " + answer);

        scn.close();
    }
}
