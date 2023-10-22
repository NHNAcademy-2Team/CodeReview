package unit.nine;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni09/node26.html
 * Exercise 09.7 Write a class containing the following static methods:
 * <p>
 * fileExists, that takes as a parameter a string and returns a boolean value that is true, if the file whose name is passed as parameter exists, and false otherwise;
 * isInt, that takes as parameter a string and returns a boolean value that is true if the string represents an integer, and false otherwise.
 * isDouble, that takes as parameter a string and returns a boolean value that is true if the string represents a real number, and false otherwise.
 * Solve the exercise by suitably catching exceptions.
 */
public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(fileExists(".txt"));
        System.out.println(isInt("12"));
        System.out.println(isInt("hi"));
        System.out.println(isDouble("1.23"));
        System.out.println(isInt("hi"));
    }

    public static boolean fileExists(String fileName) {
        boolean isFileExist;
        try (FileInputStream file = new FileInputStream(fileName)) {
            isFileExist = true;
        } catch (IOException e) {
            isFileExist = false;
        }
        return isFileExist;
    }

    public static boolean isInt(String str) {
        boolean isInt;
        try {
            Integer.parseInt(str);
            isInt = true;
        } catch (NumberFormatException e) {
            isInt = false;
        }
        return isInt;
    }

    public static boolean isDouble(String str) {
        boolean isDouble;
        try {
            Double.parseDouble(str);
            isDouble = true;
        } catch (NumberFormatException e) {
            isDouble = false;
        }
        return isDouble;
    }
}
