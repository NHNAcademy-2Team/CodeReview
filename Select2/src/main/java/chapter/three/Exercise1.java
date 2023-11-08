package chapter.three;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            System.out.println(snakeEyesSimulation(6, 6));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int snakeEyesSimulation(int firstDiceMaxEye, int secondDiceMaxEye) {
        return countSnakeEyes(0, new Dice(firstDiceMaxEye), new Dice(secondDiceMaxEye));
    }

    private static int countSnakeEyes(int count, Dice firstDice, Dice secondDice) {
        if (isSnakeEyes(firstDice, secondDice)) {
            return count;
        }
        count += 1;
        return countSnakeEyes(count, firstDice, secondDice);
    }

    private static boolean isSnakeEyes(Dice firstDice, Dice secondDice) {
        return firstDice.roll() == 1 && secondDice.roll() == 1;
    }
}
class Dice {
    private final int maxValue;

    public Dice(int maxValue) {
        this.maxValue = maxValue;
        classInvariant();
    }

    private void classInvariant() {
        if (this.maxValue < 1) {
            throw new IllegalArgumentException("양수가 아닙니다.");
        }
    }

    public int roll() {
        Random random = new Random();
        return random.nextInt(this.maxValue) + 1;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "maxValue=" + maxValue +
                '}';
    }
}
