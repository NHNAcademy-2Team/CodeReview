package chapter.six;


import java.util.Scanner;

public class Exercise11 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        }

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        isPrime(p);
        if (isPrime(p) == false) {
            System.out.println("소수가 아닙니다.");
        } else if (isPrime(p) == true)
            System.out.println("소수입니다.");

        scn.close();
    }
}
