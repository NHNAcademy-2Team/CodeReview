package chapter.three;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                System.out.print(line.charAt(i));
            } else {
                System.out.println();
            }
        }
    }

}
