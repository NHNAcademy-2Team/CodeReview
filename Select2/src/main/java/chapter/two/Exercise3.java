package chapter.two;


import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name? ");
        System.out.print("my name is ");
        String name = s.nextLine();

        System.out.printf("Hello, %s, nice to meet you!", name.toUpperCase());

        s.close();
    }
}
