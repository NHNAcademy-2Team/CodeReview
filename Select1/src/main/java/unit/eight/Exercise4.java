package unit.eight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import unit.nine.Exercise6;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni08/node24.html
 * Exercise 08.4 Write a public static method that takes as parameters a string representing a filename and an integer n, and writes on the file the multiplication table of size n. For example, for n = 3, the method should write:
 * 1  2  3
 * 2  4  6
 * 3  6  9
 */
public class Exercise4 {
    public static void main(String[] args) throws IOException {
        multiplyWriteFile(Objects.requireNonNull(Exercise6.class.getClassLoader().getResource("multiply.txt")).getFile(), 3);
    }

    public static void multiplyWriteFile(String fileName, int n) throws IOException {
        FileWriter f = new FileWriter(fileName);
        try (PrintWriter out = new PrintWriter(f)) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    out.print(i * j + " ");
                }
                out.println();
            }
        }
    }
}
