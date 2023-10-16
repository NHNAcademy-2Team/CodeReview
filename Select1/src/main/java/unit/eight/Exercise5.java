package unit.eight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {

    /*
    Exercise 8.5.
    Write a public static method that reads from a file information about exam marks obtained by students, organized as follows:
    Rossi 25 24 26 30 24 30
    Bianchi 20 24 25
    Verdi 30 24 30 27
    The method should return a string representing the name of the student with the highest average marking.
     */

    public static double avg(String[] score) {
        double result = 0.0;
        int n = 0;

        for (int i = 1; i < score.length; i++) {
            result += Integer.parseInt(score[i]);
            n++;
        }

        return result / n;
    }

    public static String max(String[] student, String line) {
        String[] score = line.split(" ");

        if(student[1] == null || Double.parseDouble(student[1]) < avg(score)){
            student[0] = score[0];
            student[1] = String.valueOf(avg(score));
        }

        return student[0];
    }

    public static String student(BufferedReader br) {

        String[] student = new String[2];
        String result = "";
        try {
            String line = br.readLine();

            while (line != null) {
                result = max(student, line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("파일이 존재하지 않습니다.");
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/java/unit/eight/score");
        BufferedReader br = new BufferedReader(new FileReader(file));

        System.out.println(student(br));

    }


}
