package chapter.four;

import java.util.Random;

class RollFor2 {
    public static int rollFor(int number) {

        if (number < 2 || number > 12) {
            throw new IllegalArgumentException();
        }

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        int count = 1;
        while (true) {
            if (dice1.randomDice() + dice2.randomDice() == number) {
                break;
            }
            count++;
        }
        return count;
    }
}

class Dice {
    Random random = new Random();
    public Dice(){
    }
    public int randomDice() {
        return random.nextInt(6) + 1;
    }
}
