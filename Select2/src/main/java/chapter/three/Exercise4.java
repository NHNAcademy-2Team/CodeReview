package chapter.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.List;

public class Exercise4 {


    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            System.out.print("> ");

            String line = br.readLine();
            if (line != null) {
                print(separate(line));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<String> separate(String line) {
        List<String> list = new ArrayList<>();
        String[] separate = line.split(" ");

        for (int i=0; i<separate.length; i++) {
            list.add(isString(separate[i]));
        }
        return list;
    }

    public static String isString(String separate) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<separate.length(); i++) {
            if (Character.isLetter(separate.charAt(i))) {
                sb.append(separate.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void print(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
