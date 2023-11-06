package chapter.four.exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise8 {

    public static void main(String[] args) {
        quizGame();
    }

    public static void quizGame() {
        int grade = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int amount = 10;
            Quiz quiz = new Quiz();
            quiz.generator(amount);

            for (int i = 0; i < amount; i++) {
                quiz.printQuiz(i);
                int userAnswer = Integer.parseInt(br.readLine());
                System.out.printf("유저의 답안 : %d\n", userAnswer);
                if (quiz.quizGrade(userAnswer, i)) {
                    System.out.println("정답입니다!");
                    grade += 10;
                } else {
                    System.out.printf("틀렸습니다. 정답은 %d입니다.\n", userAnswer);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("점수는 %d입니다.\n", grade);
    }
}
