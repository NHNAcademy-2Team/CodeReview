package unit.five;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the alcohol's gram : ");
        int g = scan.nextInt();

        message(g);
    }

    public static void message(int g) {

        try {

            if (g > 40) {
                System.out.println("extra strong liquor");
            } else if (g > 20) {
                System.out.println("strong liquor");
            } else if (g > 15) {
                System.out.println("liquor");
            } else if (g > 12) {
                System.out.println("strong vine");
            } else if (g > 10.5) {
                System.out.println("normal vine");
            } else if (g > 0) {
                System.out.println("light vine");
            } else {
                System.out.println("0 이상의 값을 입력하십시오.");
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        }

    }
}
