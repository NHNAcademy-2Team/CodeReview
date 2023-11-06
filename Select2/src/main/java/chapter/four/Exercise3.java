package chapter.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int sumDice = Integer.parseInt(br.readLine());
            int six = 6;
            diceOutOfSum(sumDice, six);
            System.out.println(countDice(new Dice(six), new Dice(six), 1, sumDice));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void diceOutOfSum(int number, int eyes){
        if(number < 2 || number > eyes * 2)
            throw new IllegalArgumentException("유효한 수가 아닙니다.");
    }

    private static int countDice(Dice firstDice, Dice secondDice, int count, int sumInput){
        if (firstDice.roll() + secondDice.roll() == sumInput)
            return count;
        return countDice(firstDice, secondDice, count + 1, sumInput);
    }
}

class Dice {
    private final int maxValue;

    public Dice(int maxValue) {
        this.maxValue = maxValue;
        classInvariant();
    }

    private void classInvariant() {
        if (this.maxValue < 1) {
            throw new IllegalArgumentException("양수가 아닙니다.");
        }
    }

    public int roll() {
        Random random = new Random();
        return random.nextInt(this.maxValue) + 1;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "maxValue=" + maxValue +
                '}';
    }
}
