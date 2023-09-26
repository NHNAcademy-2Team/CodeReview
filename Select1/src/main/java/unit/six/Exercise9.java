package unit.six;

import java.util.Scanner;

public class Exercise9 {

    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= i; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            for (int j = n - i; j >= i; j--)
                System.out.print(" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPyramid(n);

        scanner.close();
    }
}
