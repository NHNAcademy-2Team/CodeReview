package chapter.four;

public class Exercise3 {

    private static Dice dice1 = new Dice(6);
    private static Dice dice2 = new Dice(6);
    private static int count;

    public static void main(String[] args) {

//        System.out.println(rollDice(10));
        System.out.println(rollDice(2));

    }

    public static int rollDice(int rollNum) {

        dice1.setDice();
        dice2.setDice();

        int totalDice = dice1.getDiceNum() + dice2.getDiceNum();

        if (totalDice > 12) {
            throw new IllegalArgumentException();
        }

        if (totalDice != rollNum) {
            count++;
            rollDice(rollNum);
        }

        return count;
    }
}
