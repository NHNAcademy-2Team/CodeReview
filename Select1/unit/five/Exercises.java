package Select1.Unit05;

import java.util.Scanner;

public class Exercises {
    // 1
    public static void alcoholInclude(double g) {

        if (40 < g) {
            System.out.println("extra strong liquor");
        } else if (20 < g && g <= 40) {
            System.out.println("strong liquor");
        } else if (15 < g && g <= 20) {
            System.out.println("liquor");
        } else if (12 < g && g <= 12) {
            System.out.println("strong vine");
        } else if (10.5 < g && g <= 12) {
            System.out.println("normal vine");
        } else {
            System.out.println("light vine");
        }
    }

    // 2
    public static void triangleType(int length1, int length2, int length3) {
        int pairs = 0;
        if (length1 == length2 || length1 == length3 || length2 == length3) {
            pairs = 1;
        }
        if (length1 == length2 && length2 == length3) {
            pairs = 2;
        }

        if (pairs == 0) {
            System.out.println("It is irregular");
        } else if (pairs == 1) {
            System.out.println("It is symmetric");
        } else
            System.out.println("It is regular");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double g = scn.nextDouble();

        alcoholInclude(g);

        int length1 = scn.nextInt();
        int length2 = scn.nextInt();
        int length3 = scn.nextInt();

        triangleType(length1, length2, length3);

        scn.close();
    }
}
