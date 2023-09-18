package unit4;

import java.util.Scanner;

public class Ex4_1 {
    public static double convertLiraEuro(int x) {
        return x * 0.035;
    }

    public static void main(String[] args) {
        int lira = 0;
        Scanner scn = new Scanner(System.in);
        lira = scn.nextInt();

        // System.out.println(lira + " lira는 " + convertLiraEuro(lira) + "유로입니다.");
        System.out.println();
        System.out.print(lira + " 리라는 ");
        System.out.printf("%.2f", convertLiraEuro(lira));
        System.out.println(" 유로입니다.");
        scn.close();
    }
}
