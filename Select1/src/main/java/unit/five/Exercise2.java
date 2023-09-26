package unit.five;

import java.util.Scanner;

public class Exercise2 {
    public static void triangleType(String threeSides) {
        String[] sides = threeSides.split(" ");
        int count = checkLength(sides);

        if (count == 0)
            System.out.println("It is irregular");
        else if (count == 1)
            System.out.println("It is symmetric");
        else {
            System.out.println("It is regular");
        }
    }

    private static int checkLength(String[] sides) {
        int count = 0;
        for (int i = 0; i < sides.length; i++) {
            for (int j = i + 1; j < sides.length; j++) {
                if (sides[i].equals(sides[j]))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String threeSides = scanner.nextLine();
        triangleType(threeSides);

        scanner.close();
    }
}
