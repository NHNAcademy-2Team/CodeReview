package chapter.two;

import java.util.Scanner;

public class Exercise5 {

    /* 이 프로그램은 주어진 수의 계란을 계란으로 변환
     * 계란 1342개는 총 9개, 3다스, 10개이다.
     */
    private static final int GROSS = 144;
    private static final int DOZEN = 12;
    public static void eggCalculate(int egg){
        int gross = egg / GROSS;
        int extraGross = egg % GROSS;
        int dozens = extraGross / DOZEN;
        int extra = extraGross % DOZEN;

        System.out.println("gross: " + gross);
        System.out.println("dozens: " + dozens);
        System.out.println("extra: " + extra);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("달걀 몇 개? ");
        int egg = scn.nextInt();

        eggCalculate(egg);

        scn.close();

    }
}

