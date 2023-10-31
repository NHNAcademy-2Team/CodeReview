package Select2.src.main.java.chapter.three;

import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        int countRoll = 0;

        do {
            dice1.roll();
            dice2.roll();
            countRoll++;

        } while (!(dice1.getValue() == 1 && dice2.getValue() == 1));

        System.out.print("주사위 몇 번 돌았냐? " + countRoll);

    }

}
