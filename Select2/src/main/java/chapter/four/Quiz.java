package chapter.four;

import java.util.Scanner;

public class Quiz {
    private static final int QUIZ_NUMBER = 10;
    private static final int SCORE_QUESTION = 10;
    private static final int MAX_OPERAND = 100;

    private int[] firstOperand = new int[QUIZ_NUMBER];
    private int[] secondOperand = new int[QUIZ_NUMBER];
    private int[] answerOfUser = new int[QUIZ_NUMBER];

    public Quiz() {
        for (int i = 0; i < QUIZ_NUMBER; i++) {
            firstOperand[i] = (int) (Math.random() * MAX_OPERAND);
            secondOperand[i] = (int) (Math.random() * MAX_OPERAND);
        }
    }

    public void createQuestion(int first, int second) {
        System.out.printf("%d + %d = ", first, second);
    }

    public void manageQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < QUIZ_NUMBER; i++) {
            System.out.printf("[%d] ", i + 1);
            createQuestion(firstOperand[i], secondOperand[i]);
            answerOfUser[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("======= Result =======");

        for (int i = 0; i < QUIZ_NUMBER; i++) {
            System.out.printf("[%d] ", i + 1);
            createQuestion(firstOperand[i], secondOperand[i]);
            if (scoreOfQuiz(firstOperand[i], secondOperand[i], answerOfUser[i])) {
                System.out.println(answerOfUser[i]);
                score += SCORE_QUESTION;
            } else {
                System.out.println(firstOperand[i] + secondOperand[i]);
            }
        }

        System.out.printf("Your Score is %d%n", score);
    }

    public boolean scoreOfQuiz(int first, int second, int answer) {
        return ((first + second) == answer) ? true : false;
    }


}
