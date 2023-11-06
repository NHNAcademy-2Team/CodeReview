package chapter.four.exercise1;

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

