package chapter.three;

import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println(SnakeEyes.count(dice));
    }
}

class SnakeEyes{

    public static int count (Dice dice){
        int count = 0;
        do{
            dice.rollDice(2);
            count++;
        } while(!(dice.getDice()[0] == 1 && dice.getDice()[1] == 1));

        return count;
    }
}

// chapter 2 Dice.java
class Dice {
    private Random random = new Random();
    private int[] dice;

    public Dice() {
    }

    public int randomDice() {
        return random.nextInt(6) + 1;
    }

    public void rollDice(int number) {
        dice = new int[number];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = randomDice();
        }
    }

    public int[] getDice(){
        return dice;
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
