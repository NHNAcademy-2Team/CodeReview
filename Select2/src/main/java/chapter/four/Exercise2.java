package chapter.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {

    //16진수 -> 10진수

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("> ");
            String str = br.readLine();
            hexToInt(str);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void hexToInt(String str) {

        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            value = value * 16 + hexValue(str.charAt(i));
        }

        System.out.println(value);
    }

    public static char hexValue(char ch) {

        ch = Character.toUpperCase(ch);

        switch(ch) {
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            case 7 :
            case 8 :
            case 9 :
                return ch;
            case 'A' :
                return 10;
            case 'B' :
                return 11;
            case 'C' :
                return 12;
            case 'D' :
                return 13;
            case 'E' :
                return 14;
            case 'F' :
                return 15;
            default:
                throw new IllegalArgumentException();
        }


    }

}
