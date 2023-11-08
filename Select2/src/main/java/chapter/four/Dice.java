package chapter.four;

import java.util.Random;

public class Dice {
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
        return new Random().nextInt(this.maxValue) + 1;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "maxValue=" + maxValue +
                '}';
    }
}
