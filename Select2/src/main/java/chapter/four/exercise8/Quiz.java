package chapter.four.exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz {
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
