package unit.eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {
    public static void printLine(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] array = line.split("");
                if (array[0].equals("/") || array[0].equals(";") || array[0].equals("%")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        String filename = "/Users/hongjiwon/Desktop/NewGit/Select1/Exercise3_test.txt";
        printLine(filename);
    }
}
