package six;

import java.util.Scanner;

/*
 * 2부터 n 사이에 소수 출력
 */
public class Exercise12 {

    public static void allPrime(int n) {
        for (int i = 1; i <= n; i++) {
            if (Exercise11.prime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        allPrime(n);

        scanner.close();
    }
}
