package chapter.eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static String printHighStudent(String filename) {
        String highStudent = "";
        double maxAverage = -1;

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = reader.readLine()) != null){
                String[] tokens = line.split(" ");
                String name = tokens[0];
                int sum = 0;
                int numOfMarks = tokens.length -1;
                int[] marks = new int[numOfMarks];

                for (int i = 1; i < tokens.length; i++) {
                    marks[i -1] = Integer.parseInt(tokens[i]);
                    sum += marks[i - 1];
                }

                double average = (double) sum/ numOfMarks;

                if(average > maxAverage){
                    maxAverage = average;
                    highStudent = name;
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return highStudent;
    }

    public static void main(String[] args) {
        String filename = "/Users/hongjiwon/Desktop/NewGit/Select1/src/main/java/unit/eight/txtfile/Exercise5.txt";
        String highStudent = printHighStudent(filename);
        System.out.println("평균 점수가 가장 높은 학생은 " + highStudent + "입니다.");
    }

}
