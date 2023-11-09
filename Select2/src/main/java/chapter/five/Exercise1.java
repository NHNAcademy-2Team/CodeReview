package chapter.five;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println(rollDice());

    }

    public static int rollDice() {
        PairOfDice pair = new PairOfDice();

        if (pair.sumDice() == 2) {
            return 1;
        } else {
            return getCount(pair);
        }
    }

    public static int getCount(PairOfDice pair) {
        int count = 0;

        while (pair.sumDice() != 2) {
            count++;
            pair.roll();
        }

        return count;
    }
}
