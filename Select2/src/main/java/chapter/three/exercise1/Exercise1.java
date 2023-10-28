package chapter.three.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            System.out.println(snakeEyesSimulation(6, 6));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int snakeEyesSimulation(int firstDiceMaxEye, int secondDiceMaxEye) {
        return countSnakeEyes(0, new Dice(firstDiceMaxEye), new Dice(secondDiceMaxEye));
    }

    private static int countSnakeEyes(int count, Dice firstDice, Dice secondDice) {
        if (isSnakeEyes(firstDice, secondDice)) {
            return count;
        }
        count += 1;
        return countSnakeEyes(count, firstDice, secondDice);
    }

    private static boolean isSnakeEyes(Dice firstDice, Dice secondDice) {
        return firstDice.roll() == 1 && secondDice.roll() == 1;
    }
}
