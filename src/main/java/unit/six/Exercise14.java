package unit.six;

import java.util.Scanner;

public class Exercise14 {
    public static void factorization(int m) {
        for (int i = 2; i <= m; i++) {
            while (m % i == 0) {
                System.out.println(i);
                m /= i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("소인수분해 할 n을 입력하세요.");
        int m = scn.nextInt();
        factorization(m);

        scn.close();
    }
}
