package chapter.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    //보류
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            isString(br);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void isString(BufferedReader br) {

        List<String> list = new ArrayList<>();
        try {
            String line = br.readLine();
            if (line != null) {



                print(list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String[] separate(String line) {
        return line.split(" ");
    }

    public static void print(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
