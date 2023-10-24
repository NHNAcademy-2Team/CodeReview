package chapter.two;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("How many eggs you have?");
        int eggs = s.nextInt();

        System.out.printf("Your number of eggs is %d gross, %d dozen, and %d",
                eggs / 144, eggs % 144 / 12, eggs % 144 % 12);
    }
}
