package chapter.two;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // 1 penny == 1cents;
        // 1 nickel == 5cents;
        // 1 dime == 10cents;
        // 1 quarter == 25cents;
        // 1 dollor == 100cents;

        Scanner s = new Scanner(System.in);
        int penny = 0;
        int nickel = 0;
        int dime = 0;
        int quarter = 0;
        double dollor = 0;

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

        dollor = (penny + nickel * 5 + dime * 10 + quarter * 25) / 100.0;
        System.out.printf("You have %.2f dollor", dollor);

        s.close();
    }
}
