package chapter.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

class Quiz {
    private final int maxValue = 100;
    private List<Integer> firstNumber;
    private List<Integer> secondNumber;
    private List<Integer> answerNumber;

    public Quiz() {
        this.firstNumber = new ArrayList<>();
        this.secondNumber = new ArrayList<>();
        this.answerNumber = new ArrayList<>();
    }

    public void generator(int amount) {
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            firstNumber.add(random.nextInt(maxValue) + 1);
            secondNumber.add(random.nextInt(maxValue) + 1);
            answerNumber.add(firstNumber.get(i) + secondNumber.get(i));
        }
    }

    public void printQuiz(int index) {
        System.out.printf("%d번. %d + %d 는 무엇일까요?\n", index + 1, firstNumber.get(index), secondNumber.get(index));
    }

    public boolean quizGrade(int answer, int index) {
        return answer == answerNumber.get(index);
    }
}
