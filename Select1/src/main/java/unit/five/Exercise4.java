package unit.five;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

    public static void triangleInformation(Scanner scanner) {
        double[] sides = inputSides(scanner);

        if (!triangleInequality(sides))
            System.out.println("It's not a triangle.");
        else {
            System.out.println(type(sides) + "\ntriangle perimeter: " + perimeter(sides) + ", area: " + area(sides));
        }
    }

    public static double[] inputSides(Scanner scanner) {
        double[] threeSides = new double[3];
        for (int i = 0; i < 3; i++) {
            threeSides[i] = scanner.nextDouble();
        }
        threeSides = compareSides(threeSides);
        return threeSides;
    }

    public static double[] compareSides(double[] threeSides) {
        Arrays.sort(threeSides);
        return threeSides;
    }

    public static boolean triangleInequality(double[] sides) {
        double[] arrays = sides.clone();
        arrays = cutDecimal(arrays);

        if (arrays[0] + arrays[1] > arrays[2])
            return true;
        else {
            return false;
        }
    }

    public static double[] cutDecimal(double[] sides) {
        for (int i = 0; i < sides.length; i++) {
            sides[i] = Math.round(sides[i] * 100) / 100.0;
        }
        return sides;
    }

    public static String type(double[] sides) {
        if (Math.pow(sides[2], 2) < Math.pow(sides[0], 2) + Math.pow(sides[1], 2))
            return "Acute triangle";
        else if (Math.pow(sides[2], 2) == Math.pow(sides[0], 2) + Math.pow(sides[1], 2))
            return "Right triangle";
        else {
            return "Obtuse triangle";
        }
    }

    public static double perimeter(double[] sides) {
        return sides[0] + sides[1] + sides[2];
    }

    public static double area(double[] sides) {
        double s = (sides[0] + sides[1] + sides[2]) / 2.0;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        triangleInformation(scanner);

        scanner.close();
    }

}
