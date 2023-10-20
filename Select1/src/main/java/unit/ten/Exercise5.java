package unit.ten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {

    public static int countSameWord(String filename, String word) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String data;
            while ((data = br.readLine()) != null) {
                String[] sentence = data.split("");

                for (String i : sentence) {
                    if (i.equals(word))
                        count++;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public static void main(String[] args) {
        String filename = "/Users/taehee/과정1/unit/resources/ten/exercise5.txt";

        System.out.println(countSameWord(filename, "1"));
    }
}
