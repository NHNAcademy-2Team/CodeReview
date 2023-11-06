package chapter.four;

import java.util.Random;

public class Dice {

    private int maxNum;
    private int diceNum;
    private Random rnd = new Random();


    public Dice(int maxNum) {
        this.maxNum = maxNum;
    }

    public void setDice() {
        try {
            this.diceNum = rnd.nextInt(maxNum) + 1;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public int getDiceNum() {
        return this.diceNum;
    }

}
