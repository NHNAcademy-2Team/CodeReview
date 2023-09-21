package unit.five;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lengths of the trhee sides of a triangle : ");
        String length = scan.nextLine();
        String[] lengths = length.split(" ");

        compare(lengths);


    }

    public static void compare(String[] lengths) {

        int pair = 0;

        if (lengths.length < 3) {
            System.out.println("3개의 값을 입력하세요.");
            return;
        }

        for (int i = 0; i < lengths.length - 1; i++) {
            for (int j = i+1; j < lengths.length; j++) {
                if (lengths[i].equals(lengths[j])) {
                    pair++;
                }
            }
        }

        switch (pair) {
            case 0:
                System.out.println("It is irregular");
                break;
            case 1:
                System.out.println("It is symmetric");
                break;
            default:
                System.out.println("It is regular");
        }

    }

}
