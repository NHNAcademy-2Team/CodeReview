package unit4;

import java.util.Scanner;

public class Ex4_4 {
    public static boolean even(long x) {
        if (x % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long x = scn.nextLong();

        System.out.println(even(x));

        scn.close();
    }
}
