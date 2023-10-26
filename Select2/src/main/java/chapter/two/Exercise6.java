package chapter.two;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        question(scan);
        scan.close();
    }


    public static void question(Scanner scan) {

        System.out.print("Please enter your first name and last name, separated by a space. : ");
        String name = scan.nextLine();
        int blank = name.lastIndexOf(" ");

        String firstName = name.substring(0, blank);
        String lastName = name.substring(blank + 1);

        System.out.println("Your first name is " + firstName + ", which has " + count(firstName) + " characters");
        System.out.println("Your last name is " + lastName + ", which has " + count(lastName) + " characters");
        System.out.println("Your initials are " + initials(name));
    }

    public static int count(String name) {
        String result = name.replace(" ", "");
        return result.length();
    }

    public static String initials(String name) {
        StringBuilder sb = new StringBuilder();

        sb.append(name.substring(0, 1));

        for (int i = name.length() - 1; i >= 0; i--) {
            if (Character.isUpperCase(name.charAt(i))) {
                sb.append(name.charAt(i));
                break;
            }
        }

        return sb.toString();
    }

}


