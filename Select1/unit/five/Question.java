package Select1.Unit05;

import java.util.Scanner;

public class Question {
    public static void answer(String s) {
        if (s.charAt(s.length() - 1) == 'a' ||
                s.charAt(s.length() - 1) == 'i' ||
                s.charAt(s.length() - 1) == 'u') {
            System.out.println("YES");
        } else if (s.charAt(s.length() - 1) == 'e' || s.charAt(s.length() - 1) == 'o') {
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
