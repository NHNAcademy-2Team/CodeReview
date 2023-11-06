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
    }
}
