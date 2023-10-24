package unit.eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni08/node24.html
 * Exercise 08.3 Write a public static method that prints on the video all lines of a file that start with one of the characters '/', ';', or '%'. The name of the file should be given as a parameter.
 */
public class Exercise3 {
    public static void main(String[] args) {
        try {
            printVideo(Objects.requireNonNull(Exercise3.class.getClassLoader().getResource("hi.txt")).getFile());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printVideo(String fileName) throws IOException {
        FileReader f = new FileReader(fileName);
        try (BufferedReader br = new BufferedReader(f)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (Stream.of("/", ";", "%").anyMatch(line::startsWith)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
