package five;

import java.util.Scanner;

public class Exercise1 {

    public static void alcoholContent(double g) {

        if (g > 40)
            System.out.println("extra strong liquor");
        else if (g <= 40 && g > 20)
            System.out.println("strong liquor");
        else if (g <= 20 && g > 15)
            System.out.println("liquor");
        else if (g <= 15 && g > 12)
            System.out.println("strong vine");
        else if (g <= 12 && g > 10.5)
            System.out.println("normal vine");
        else {
            System.out.println("light vine");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double g = scanner.nextDouble();
        alcoholContent(g);

        scanner.close();
    }
}