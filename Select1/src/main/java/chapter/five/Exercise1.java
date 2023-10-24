package chapter.five;


import java.util.Scanner;

public class Exercise1 {
    public static void alcoholInclude(double g) {

        if (40 < g) {
            System.out.println("extra strong liquor");
        } else if (20 < g && g <= 40) {
            System.out.println("strong liquor");
        } else if (15 < g && g <= 20) {
            System.out.println("liquor");
        } else if (12 < g && g <= 15) {
            System.out.println("strong vine");
        } else if (10.5 < g && g <= 12) {
            System.out.println("normal vine");
        } else {
            System.out.println("light vine");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double g = scn.nextDouble();

        alcoholInclude(g);

        scn.close();
    }
}
