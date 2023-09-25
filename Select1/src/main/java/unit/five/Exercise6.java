package unit.five;

import java.util.Scanner;

public class Exercise6 {
    public static void answer(String s) {
        char ch = s.charAt(s.length() - 1);
        if (ch == 'a' ||
                ch == 'i' ||
                ch == 'u') {
            System.out.println("YES");
        } else if (ch == 'e' || ch == 'o') {
            System.out.println("NO");
        } else
            System.out.println("DON'T KNOW");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        answer(s);

        scn.close();
    }
}
