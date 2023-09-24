package unit.six;

import java.util.Scanner;

public class Exercise10 {

    public static void allFactorial(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(Exercise3.factorial(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        allFactorial(n);

        scanner.close();
    }
}
