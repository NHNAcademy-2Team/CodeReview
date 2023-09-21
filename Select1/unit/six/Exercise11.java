package unit.six;

import java.util.Scanner;

public class Exercise11 {

    public static boolean prime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(prime(n));

        scanner.close();
    }
}
