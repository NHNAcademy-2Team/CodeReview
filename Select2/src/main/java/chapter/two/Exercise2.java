package chapter.two;

import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.rollDice(2);
        dice.printDice();
    }
}

class Dice {
    private Random random = new Random();
    private int[] dice;

    public Dice() {
    }

    private int randomDiceNumer() {
        return random.nextInt(6) + 1;
    }

    public void rollDice(int number) {
        dice = new int[number];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = randomDiceNumer();
        }
    }

    public int sumDice() {
        int sum = 0;
        for (int i : this.dice) {
            sum += i;
        }
        return sum;
    }

    public void printDice() {

        for (int i = 0; i < this.dice.length; i++) {
            System.out.println((i + 1) + "번째 주사위는 " + dice[i] + "가 나옵니다.");
        }
        System.out.println("총 합은 " + sumDice() + "입니다.");
    }
}
