package unit.six;

import java.util.Scanner;

public class Exercise13 {
    public static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        while (i <= n) {
            if (prime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }
}
