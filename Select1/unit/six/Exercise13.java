package unit.six;

import java.util.Scanner;

/*
 * 처음부터 n개의 소수 출력
 */
public class Exercise13 {

    public static void printPrime(int n) {
        for (int i = 2, count = 0; count < n; i++) {
            if (Exercise11.prime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPrime(n);

        scanner.close();
    }
}
