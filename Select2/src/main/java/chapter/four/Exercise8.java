package chapter.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise8 {

    public static void main(String[] args) {
        question();
    }

    public static void question() {

        int score = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            for (int i = 1; i <= 10; i++) {

                Quiz quiz = new Quiz(100);

                System.out.printf("%d번 문제 : %d + %d = ?\n", i, quiz.getFirst(), quiz.getSecond());
                System.out.print("> ");
                String input = br.readLine();

                int sum = quiz.sum(quiz.getFirst(), quiz.getSecond());

                if (quiz.isCorrect(input, sum)) {
                    System.out.println("정답입니다!");
                    score += 10;
                } else {
                    System.out.println("틀렸습니다!");
                    System.out.println("정답은 " + sum + "입니다.");
                }
            }

            System.out.println("총 점수는 " + score + "점 입니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
