package unit.five;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lengths of the trhee sides of a triangle : ");
        String[] lengths = scan.nextLine().split(" ");

        compare(lengths);
    }

    public static void compare(String[] lengths) {

        if (lengths.length < 3) {
            System.out.println("3개의 값을 입력하세요.");
            return;
        }

        if (lengths[0].equals(lengths[1]) && lengths[0].equals(lengths[2])) {
            System.out.println("It is regular");
        } else if (lengths[0].equals(lengths[1]) || lengths[0].equals(lengths[2]) || lengths[1].equals(lengths[2])) {
            System.out.println("It is symmetric");
        } else {
            System.out.println("It is irregular");
        }

    }
}
