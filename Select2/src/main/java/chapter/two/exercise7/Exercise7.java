package chapter.two.exercise7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exercise7 {
    public static void main(String[] args) {
        // 함수 더 나누기
        String fileName = Objects.requireNonNull(Exercise7.class.getClassLoader().getResource("student.txt")).getFile();
        try(FileReader f = new FileReader(fileName); BufferedReader br = new BufferedReader(f)) {
            Student student = new Student(br.readLine());
            Exam exam1 = new Exam(Integer.parseInt(br.readLine()));
            Exam exam2 = new Exam(Integer.parseInt(br.readLine()));
            Exam exam3 = new Exam(Integer.parseInt(br.readLine()));

            List<Exam> examList = new ArrayList<>();
            examList.add(exam1);
            examList.add(exam2);
            examList.add(exam3);

            StudentExamScores studentExamScores = new StudentExamScores(student, examList);
            System.out.println(studentExamScores.average());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
