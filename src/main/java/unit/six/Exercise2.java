package unit.six;


import java.util.Scanner;

public class Exercise2 {
    public static void evenIs(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        System.out.print("양의 정수 n을 입력하세요.");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        evenIs(n);

        scn.close();
    }
}
