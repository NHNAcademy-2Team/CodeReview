package chapter.four;

import java.util.Random;

public class Quiz {

    private int first;
    private int second;
    private Random rnd = new Random();

    public Quiz(int maxNum) {
        first = rnd.nextInt(maxNum) + 1;
        second = rnd.nextInt(maxNum) + 1;
    }

    public Quiz(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int sum(int first, int second) {
        return first + second;
    }

    public int substract(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int division(int first, int second) {
        return first / second;
    }

    public int mod(int first, int second) {
        return first % second;
    }

    public boolean isCorrect(String input, int answer) {

        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }

        String result = String.valueOf(answer);

        return input.equals(result);
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
