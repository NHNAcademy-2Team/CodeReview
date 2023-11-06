package chapter.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            System.out.print("> ");
            String input = br.readLine();
            System.out.println(printCapitalized(input));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String printCapitalized(String input) {

        String[] str = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {

            if (Character.isLetter(str[i].charAt(0))) {
                sb.append(str[i].toUpperCase().charAt(0));
                sb.append(str[i].substring(1));
            }

            sb.append(" ");

        }

        return sb.toString();
    }

}
