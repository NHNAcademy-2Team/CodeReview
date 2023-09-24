package CodeReview.Select1.src.main.java.unit.six;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 n을 입력하세요 : ");
        int n = scan.nextInt();

        System.out.println(printFactorial(n));
    }

    public static String printFactorial(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(i + "! = " + factorial(i) + "\n");
        }

        return sb.toString();
    }

    public static int factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("양의 정수를 입력하십시오");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            n *= factorial(n - 1);
        }

        return n;
    }
}
