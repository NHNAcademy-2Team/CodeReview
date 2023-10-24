package chapter.two;

import java.util.Scanner;

public class Exercise5 {

    /* 이 프로그램은 주어진 수의 계란을 계란으로 변환
     * 계란 1342개는 총 9개, 3다스, 10개이다.
     */
    public static void eggCalculate(int egg){
        int gross = egg / 144;
        int extraGross = egg % 144;
        int dozens = extraGross / 12;
        int extra = extraGross % 12;

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

