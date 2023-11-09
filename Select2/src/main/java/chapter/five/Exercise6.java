package chapter.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6 {
    public static void main(String[] args) {


        quizGame();
    }

    public static void quizGame() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            int count = 0;
            int[] input = new int[10];
            int[] answer = new int[10];

            while (count < 10) {
                AdditionQuestion additionQuestion = new AdditionQuestion();

                System.out.println(additionQuestion.getQuestion());
                System.out.print("> ");
                input[count] = Integer.parseInt(br.readLine());
                answer[count] = additionQuestion.getCorrectAnswer();

                count++;
            }

            printResult(input, answer);

        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void printResult(int[] input, int[] answer) {
        int score = 0;

        for (int i = 0; i<answer.length; i++) {
            if (input[i] == answer[i]) {
                System.out.printf("입력값 : %d | 정답 : %d -> 정답입니다!\n", input[i], answer[i]);
                score += 10;
            } else {
                System.out.printf("입력값 : %d | 정답 : %d -> 틀렸습니다!\n", input[i], answer[i]);
            }
        }

        System.out.println();
        System.out.println("최종 접수는 "+ score + "점 입니다.");
    }
}
