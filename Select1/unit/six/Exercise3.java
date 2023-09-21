package unit.six;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();

        System.out.println(factorial(n));

        scan.close();
    }

    public static int factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("양의 정수를 입력하십시오");
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            n *= factorial(n - 1);
        }

        return n;
    }
}
