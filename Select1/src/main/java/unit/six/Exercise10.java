package unit.six;

import java.util.Scanner;

public class Exercise10 {
    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        try {
            for (int i = 1; i <= n; i++) {
                System.out.println(factorial(i));
            }
        } catch (StackOverflowError e) {
            System.out.println("양수를 적어주세유잉");
        }

    }
}
