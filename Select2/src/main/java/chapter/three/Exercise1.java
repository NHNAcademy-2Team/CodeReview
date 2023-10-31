package chapter.three;

import chapter.two.*;

public class Exercise1 {

    private static int count = 0;

    public static void main(String[] args) {
        //주사위 한 쌍을 몇 번이나 굴려야 뱀의 눈(두 주사위가 1이 나오는 경우)이 나오는지?

        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);
        System.out.println(count(count, dice1, dice2));


    }

    public static boolean isSnake(Dice dice) {
        if (dice.getRoll() == 1) {
            return true;
        }
        return false;
    }

    public static int count(int count, Dice dice1, Dice dice2) {

        dice1.setRoll();
        dice2.setRoll();

        if (!(isSnake(dice1) && isSnake(dice2))) {
            count++;
            return count(count, dice1, dice2);
        }

        return count;
    }
}
