package chapter.two.exercise7;

import java.util.List;

public class StudentExamScores {
    private Student student;
    private List<Exam> examList;
    public StudentExamScores(Student student, List<Exam> examList){
        this.student = student;
        this.examList = examList;
    }
    public int average(){
        int total = 0;
        int count = 0;
        for(Exam exam : examList){
            total += exam.getScore();
            count++;
        }
        return total / count;
    }
}
