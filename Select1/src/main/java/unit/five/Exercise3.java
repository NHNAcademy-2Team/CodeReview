package unit.five;

import java.util.Scanner;

public class Exercise3 {
    public static void triangleType(String threeSides) {
        String[] sides = threeSides.split(" ");

        if (sides[0].equals(sides[1]) && sides[0].equals(sides[2]))
            System.out.println("It is regular");
        else if (sides[0].equals(sides[1]) || sides[0].equals(sides[2]) || sides[1].equals(sides[2]))
            System.out.println("It is symmetric");
        else {
            System.out.println("It is irregular");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String threeString = scanner.nextLine();
        triangleType(threeString);

        scanner.close();
    }
}
