package unit.six;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 n을 입력하십시오 : ");
        int n = scan.nextInt();

        System.out.println(sosues(n));
    }

    public static String sosues(int n) {
        StringBuilder sb = new StringBuilder();

        if (isSosu(n)) {
            return String.valueOf(n);
        } else {
            return sosu(n);
        }
    }

    public static String sosu(int n) {
        StringBuilder sb = new StringBuilder();

        if (n < 0) {
            throw new IllegalArgumentException("음의 정수를 입력하지 마십시오");
        }

        if (n == 0 || n == 1) {
            return String.valueOf(n);
        }

        for (int i=2; i<n-1; i++) {
            if (n % i != 0) {
                sb.append(i + ", ");
            }
        }
        if (n % n-1 != 0) {
            sb.append(n);
        }

        return sb.toString();
    }

    public static boolean isSosu(int n) {

        int count = 0;

        if (n < 0) {
            throw new IllegalArgumentException("음의 정수를 입력하지 마십시오");
        }

        if (n == 0 || n == 1) {
            return false;
        }

        for (int i=2; i<n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return (count > 0) ? false : true;
    }
}
