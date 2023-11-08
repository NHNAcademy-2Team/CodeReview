<<<<<<< HEAD
package select2.src.main.java.chapter.four;

import java.util.Scanner;

public class Exercise1 {
    public static void printCapitalized(String string){
        char ch;
        char frontCh = '.';
        for (int i = 0; i < string.length() ; i++) {
            ch = string.charAt(i);
            if(Character.isLetter(ch) && !Character.isLetter(frontCh))
                System.out.print(Character.toUpperCase(ch));
            else
                System.out.print(ch);
            frontCh = ch;
        }
    }

    public static void main(String[] args) {
        String line;
        Scanner scn = new Scanner(System.in);
        System.out.println("문장을 입력하세요.");
        line = scn.nextLine();
        System.out.print("바뀐 문장: ");
        printCapitalized(line);

    }
}
=======
package chapter.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static void main(String[] args) {
        printCapitalized(inputUser());
    }

    private static String inputUser() {
        String line = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            line = br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return line;
    }

    private static void printCapitalized(String line) {
        System.out.println(capitalized(line));
    }

    private static String capitalized(String line) {
        if (precondition(line)) {
            return line;
        }
        char[] lineCharArray = line.toCharArray();
        boolean isFirst = true;
        for (int i = 0; i < lineCharArray.length; i++) {
            char ch = lineCharArray[i];
            if (isSpace(ch)) {
                isFirst = true;
            } else if (isFirstCharacter(isFirst, ch)) {
                lineCharArray[i] = Character.toUpperCase(ch);
                isFirst = false;
            }
        }
        return new String(lineCharArray);
    }

    private static boolean precondition(String line) {
        return line == null || line.isEmpty();
    }

    private static boolean isSpace(char ch) {
        return ch == ' ';
    }

    private static boolean isFirstCharacter(boolean isFirst, char ch) {
        return isFirst && Character.isLetter(ch);
    }
}

>>>>>>> origin/develop
