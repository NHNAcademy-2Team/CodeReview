package unit.eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import unit.nine.Exercise6;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni08/node24.html
 * Exercise 08.5 Write a public static method that reads from a file information about exam marks obtained by students, organized as follows:
 * Rossi 25 24 26 30 24 30
 * Bianchi 20 24 25
 * Verdi 30 24 30 27
 * The method should return a string representing the name of the student with the highest average marking.
 */
public class Exercise5 {
    public static void main(String[] args) {
        try {
            System.out.println(highestAverageStudent(
                    Objects.requireNonNull(Exercise5.class.getClassLoader().getResource("student.txt")).getFile()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String highestAverageStudent(String fileName) throws IOException {
        String highestStudentName = "NotFoundStudent";
        int max = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(" ");
                int sum = 0;
                for (int i = 1; i < arr.length; i++) {
                    sum += Integer.parseInt(arr[i]);
                }
                int average = sum / (arr.length - 1);
                if (max < average) {
                    max = average;
                    highestStudentName = arr[0];
                }
            }
        }
        return highestStudentName;
    }
}
