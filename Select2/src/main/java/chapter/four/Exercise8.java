<<<<<<< HEAD
package select2.src.main.java.chapter.four;

import java.util.Scanner;

public class Exercise8 {
    private static int[] firstNumber = new int[10];
    private static int[] secondNumber = new int[10];
    private static int[] userAnswer = new int[10];

    public static void createQuiz() {
        for (int i = 0; i < 10; i++) {
            firstNumber[i] = (int) (Math.random() * 100 + 1);
            secondNumber[i] = (int) (Math.random() * 100);
        }
    }

    public static void manageQuiz() {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int quizNumber = i + 1;
            System.out.print(quizNumber + ". " + firstNumber[i] + " + " + secondNumber[i] + "? ");
            userAnswer[i] = scn.nextInt();
            System.out.println();
        }
    }

    public static void scoreQuiz() {
        System.out.println("정답");
        int correctCount = 0;
        int score = 0;
        for (int i = 0; i < 10; i++) {
            int quizNumber = i + 1;
            int correctAnswer = firstNumber[i] + secondNumber[i];
            System.out.print(quizNumber + ". " + firstNumber[i] + " + " + secondNumber[i] + "? " + correctAnswer);
            System.out.println();
            if (userAnswer[i] == correctAnswer) {
                System.out.println("정답입니다.");
                correctCount++;
            } else
                System.out.println("틀렸습니다. 정답은 " + correctAnswer + "입니다.");
        }
        score = correctCount * 10;
        System.out.println(correctCount + "문제 맞췄습니다. 점수는 " + score + "점입니다.");
    }

    public static void main(String[] args) {
        System.out.println("퀴즈를 시작하지.");
        createQuiz();
        manageQuiz();
        scoreQuiz();
=======
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
>>>>>>> origin/develop
    }
}
