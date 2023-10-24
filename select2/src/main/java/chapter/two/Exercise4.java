package chapter.two;

import java.util.Scanner;

public class Exercise4 {

    public static int coinCalculate(int quarters, int dimes, int nicks, int pennies) {
        int totalCents;

        totalCents = 25 * quarters + 10 * dimes + 5 * nicks + pennies;

        System.out.println("동전 수: " + totalCents);

        return totalCents;
    }

    public static void dollarCalculate(int totalCents) {
        double dollar = totalCents / 100.0;
        System.out.println("달러: " + dollar);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("쿼터 수: ");
        int quarters = scn.nextInt();

        System.out.print("다임 수: ");
        int dimes = scn.nextInt();

        System.out.print("니켈 수: ");
        int nicks = scn.nextInt();

        System.out.print("페니 수: ");
        int pennies = scn.nextInt();

        int total = coinCalculate(quarters, dimes, nicks, pennies);
        dollarCalculate(total);


        scn.close();
    }
}
