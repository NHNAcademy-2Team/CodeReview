package chapter.three;

import java.util.Random;

public class Dice {
    private final int maxValue;
    private int numberOfRolls;

    public boolean isSnakeEyes(int dice1, int dice2) {
        return (dice1 == 1) && (dice2 == 1);
    }

    public void rollDices() {
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);

        do {
            numberOfRolls++;
            System.out.println("[" + numberOfRolls + "] Roll dices!");
        } while (!isSnakeEyes(dice1.roll(), dice2.roll()));

        System.out.println("OH IT'S SNAKE EYES");
    }

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
