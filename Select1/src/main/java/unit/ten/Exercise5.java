package unit.ten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni10/node30.html
 * Exercise 10.5 Provide the implementation of a recursive method that counts how many occurrences of 1 appear in a sequence of integers read from a file (accessed through a BufferedReader).
 */
public class Exercise5 {
    public static void main(String[] args) throws IOException {
        String fileName = "one.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(
                Objects.requireNonNull(Exercise5.class.getClassLoader().getResource(fileName)).getFile()))) {
            System.out.println(countOne(br, 0, br.readLine()));
        }
    }

    public static long countOne(BufferedReader br, long count, String line) throws IOException {
        if (line == null) {
            return count;
        }
        count += line.chars().filter(ch -> ch == '1').count();
        return countOne(br, count, br.readLine());
    }
}
