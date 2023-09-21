package five;

import java.util.Scanner;

public class Exercise1 {

    public static void alcoholContent(double g) {
        if (g > 20) {
            if (g > 40)
                System.out.println("extra strong liquor");
            else {
                System.out.println("strong liquor");
            }
        } else if (g > 12) {
            if (g > 15)
                System.out.println("liquor");
            else {
                System.out.println("strong vine");
            }
        } else {
            if (g > 10.5)
                System.out.println("normal vine");
            else {
                System.out.println("light vine");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double g = scanner.nextDouble();
        alcoholContent(g);

        scanner.close();
    }
}