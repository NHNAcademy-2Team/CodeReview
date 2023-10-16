package eight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {

    static void printFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String sentence = "";

            while (!sentence.equals("\n")) {
                sentence = br.readLine();

                if (sentence.charAt(0) == '/' || sentence.charAt(0) == ';' || sentence.charAt(0) == '%') {
                    System.out.println(sentence.substring(1, sentence.length()));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        File file = new File("/Users/taehee/과정1/resources/eight/exercise3.txt");
        printFile(file);
    }
}
