package chapter.two.Exercise4;

import java.util.Scanner;

public class Change {
    // 1 penny == 1cents;
    // 1 nickel == 5cents;
    // 1 dime == 10cents;
    // 1 quarter == 25cents;
    // 1 dollor == 100cents;
    private double penny = 0;
    private double nickel = 0;
    private double dime = 0;
    private double quarter = 0;
    private double dollor = 0;

    private static final double PENNY_TO_DOLLOR = 0.01;
    private static final double NICKEL_TO_DOLLOR = 0.05;
    private static final double DIME_TO_DOLLOR = 0.1;
    private static final double QUARTER_TO_DOLLOR = 0.25;


    public void inputInfor(Scanner s) {
        System.out.println("How many quarters you have?");
        System.out.print("=> ");
        quarter = s.nextInt();

        System.out.println("How many dimes you have?");
        System.out.print("=> ");
        dime = s.nextInt();

        System.out.println("How many nickels you have?");
        System.out.print("=> ");
        nickel = s.nextInt();

        System.out.println("How many pennies you have?");
        System.out.print("=> ");
        penny = s.nextInt();
    }

    public void change() {
        dollor = penny * PENNY_TO_DOLLOR +
                nickel * NICKEL_TO_DOLLOR +
                dime * DIME_TO_DOLLOR +
                quarter * QUARTER_TO_DOLLOR;
    }

    public String getDollor() {
        change();
        return String.format("You have %.2f dollor", dollor);
    }
}
