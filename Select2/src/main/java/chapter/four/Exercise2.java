<<<<<<< HEAD
package select2.src.main.java.chapter.four;

import java.util.Scanner;

public class Exercise2 {
    public static int hexValue(char ch) {
        switch (ch) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return ch - '0';
            case 'A':
            case 'a':
                return 10;
            case 'B':
            case 'b':
                return 11;
            case 'C':
            case 'c':
                return 12;
            case 'D':
            case 'd':
                return 13;
            case 'E':
            case 'e':
                return 14;
            case 'F':
            case 'f':
                return 15;
            default:
                return -1;
        }

    }

    public static void main(String[] args) {
        System.out.println("16진수를 입력하세요");
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int decimal = 0;

        for (char ch : str.toCharArray()) {
            if (hexValue(ch) == -1) {
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }
            decimal = decimal * 16 + hexValue(ch);
        }
        System.out.println(decimal);

        scn.close();
=======
package chapter.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(hexToDecimal(inputUser(), 0, 1, 1));
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

    private static int hexValue(char digits) {
        String hex = "0123456789ABCDEFG";

        int hexNumber = hex.indexOf(String.valueOf(Character.toUpperCase(digits)));

        if (hexNumber == -1) {
            throw new IllegalArgumentException("16진수가 아닙니다.");
        }

        return hexNumber;
    }

    private static int hexToDecimal(String hexNumber, int result, int digit, int count) {
        if (hexNumber.length() < count) {
            return result;
        }

        return hexToDecimal(hexNumber, result + digit * hexValue(hexNumber.charAt(hexNumber.length() - count)),
                digit * 16, count + 1);
>>>>>>> origin/develop
    }
}
