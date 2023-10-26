package chapter.two;

import java.util.Random;

public class Dice {

    private int maxNum;
    private int player;
    private int score;
    private Random rnd = new Random();

    public Dice(int maxNum) {
        this.maxNum = maxNum;
    }

    public void setRoll() {
        try {

            this.score = rnd.nextInt(6) + 1;

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public int getRoll() {
        return this.score;
    }
}
