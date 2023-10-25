package chapter;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercise2 {
    public static void main(String[] args) {

        Dice dice = new Dice(6);
        dice.roll(2);
        print(dice);

    }

    public static void print(Dice dice) {
        for (int i = 1; i <= dice.getHuman(); i++) {
            System.out.println("The " + i + "'s dice comes up " + dice.getRoll(i));
        }

        System.out.println("Your total roll is " + dice.total());
    }
}

class Dice {

    private int maxNum;
    private int human;
    private int[] player;
    private Random rnd = new Random();

    public Dice(int maxNum) {
        this.maxNum = maxNum;
    }

    public void roll(int human) {
        try {
            this.player = new int[human];
            this.human = human;

            for (int i = 0; i < human; i++) {
                player[i] = rnd.nextInt(maxNum) + 1;
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public int getRoll(int index) {
        return player[index - 1];
    }

    public int getHuman() {
        return this.human;
    }

    public int total() {
        int sum = 0;
        for (int i = 0; i < player.length; i++) {
            sum += player[i];
        }
        return sum;
    }

}

