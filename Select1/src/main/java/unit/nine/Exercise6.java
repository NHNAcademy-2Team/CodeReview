package unit.nine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni09/node26.html
 * <p>
 * Exercise 09.6 Define a new exception, called ExceptionLineTooLong, that prints out the error message "The strings is too long". Write a program that reads all lines of a file and throws an exception of type ExceptionLineTooLong in the case where a string of the file is longer than 80 characters. Handle also all exceptions that could be thrown by the program.
 */
public class Exercise6 {
    public static void main(String[] args) throws IOException {
        test();
    }

    public static void test() throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader("/Users/suyeon/Documents/nhn/git/CodeReview/Select1/src/main/resources/test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() > 80) {
                    throw new ExceptionLineTooLong("파일의 문자열이 80자를 초과했습니다.");
                }
            }
        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }
    }
}
