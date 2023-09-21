package unit.six;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("양의 정수를 입력하십시오 : ");
        int num = scan.nextInt();

        System.out.println(isPrime(num));

    }

    public static boolean isPrime(int n) {

        int count = 0;

        if (n < 0) {
            throw new IllegalArgumentException("음의 정수를 입력하지 마십시오");
        }

        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return (count > 0) ? false : true;
    }
}
