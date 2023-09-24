package unit.six;

import java.util.Scanner;

public class Exercise14 {

    public static void primeFactors(int n) {
        int count = n;
        if (n < 2)
            throw new IllegalArgumentException("소수가 아닙니다.");

        for (int i = 2; i < count; i++) {
            if (Exercise11.prime(i)) {
                while (n % i == 0 && n != 1) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        primeFactors(n);

        scanner.close();
    }
}
