package chapter.two;

import chapter.TextIO;

public class Exercise6 {

    public static void printName() {
        System.out.print("Please enter your first name and last name, separated by a space\n? ");
        String[] name = TextIO.getln().split(" ");

        System.out.printf("Your first name is %s, which has %d characters.\n", name[0], name[0].length());
        System.out.printf("Your last name is %s, which has %d characters.\n", name[1], name[1].length());
        System.out.printf("Your initials are %c%c\n", name[0].charAt(0), name[1].charAt(0));
    }

    public static void main(String[] args) {
        printName();
    }
}

