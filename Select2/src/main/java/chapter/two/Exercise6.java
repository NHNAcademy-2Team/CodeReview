package chapter.two;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NameAnalyzer name = new NameAnalyzer();
        name.setName(scanner);
        name.printName();

        scanner.close();
    }
}

class NameAnalyzer {
    private String[] name;

    public NameAnalyzer() {
    }

    public void setName(Scanner scanner) {
        this.name = scanner.nextLine().split(" ");
    }

    private String initial() {
        String result = "";
        for (int i = 0; i < name.length; i++) {
            result += name[i].charAt(0);
        }
        return result.toUpperCase();
    }

    public void printName() {

        for (int i = 0; i < name.length; i++) {
            System.out.println("Your " + (i + 1) + " name is " + name[i] + ", which has " + name[i].length()
                    + " characters");
        }
        System.out.println("Your initials are " + initial());
    }
}
