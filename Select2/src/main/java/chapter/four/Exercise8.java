package chapter.four;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdditionQuiz.administerQuiz(scanner);

        scanner.close();
    }
}

class AdditionQuiz{
    private static final int QUIZ_LENGTH = 10;
    private static final int RANDOM_NUM = 1000;
    private static Random random = new Random();
    public static int[][] quiz = new int[QUIZ_LENGTH][2];
    public static int[] userAnswer = new int[QUIZ_LENGTH];

    public static void createQuiz(){
        for (int i = 0; i < QUIZ_LENGTH; i++) {
            quiz[i][0] = random.nextInt(RANDOM_NUM) + 1;
            quiz[i][1] = random.nextInt(RANDOM_NUM) + 1;
        }
    }

    public static void administerQuiz(Scanner scanner){
        createQuiz();
        for (int i = 0; i < QUIZ_LENGTH; i++) {
            System.out.print((i+1) + ". " + quiz[i][0] + " + " + quiz[i][1] + " = ");
            userAnswer[i] = scanner.nextInt();
        }
        System.out.println("\n점수 : " + gradeQuiz());
    }

    public static int gradeQuiz(){
        int score = 0;
        for (int i = 0; i < QUIZ_LENGTH; i++) {
            if(quiz[i][0] + quiz[i][1] == userAnswer[i])
                score++;
        }
        return (score * (100 / QUIZ_LENGTH));
    }
}
