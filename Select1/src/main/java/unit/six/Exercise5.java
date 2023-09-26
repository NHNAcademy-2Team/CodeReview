package unit.six;

import java.util.Scanner;

public class Exercise5 {

    public static double pi(int n) {
        double number = 4.0;
        int sign = -1;

        for (int i = 0, j = 3; i < n - 1; i++) {
            number += ((double) 4 / j) * sign;
            j += 2;
            sign *= -1;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(pi(n));

        scanner.close();
    }
}
