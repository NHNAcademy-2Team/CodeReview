package chapter.four.exercise2;

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

        if(hexNumber == -1)
            throw new IllegalArgumentException("16진수가 아닙니다.");

        return hexNumber;
    }

    private static int hexToDecimal(String hexNumber, int result, int digit, int count) {
        if (hexNumber.length() < count) {
            return result;
        }

        return hexToDecimal(hexNumber, result + digit * hexValue(hexNumber.charAt(hexNumber.length() - count)), digit * 16, count + 1);
    }
}
