package chapter.five;


import java.util.Scanner;

public class Exercise2 {
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
        int length1 = scn.nextInt();
        int length2 = scn.nextInt();
        int length3 = scn.nextInt();

        triangleType(length1, length2, length3);

        scn.close();
    }
}
