package chapter.four.exercise4;

import chapter.four.exercise3.Dice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    private static final int TENTHOUSAND = 10000;
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int sumDice = Integer.parseInt(br.readLine());
            int six = 6;
            diceOutOfSum(sumDice, six);
            System.out.println("주사위의 총합      평균 굴림 횟수");
            System.out.println("-------------     --------------");
            System.out.printf("     %d               %f", sumDice, totalRollCount(sumDice));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void diceOutOfSum(int number, int eyes){
        if(number < 2 || number > eyes * 2)
            throw new IllegalArgumentException("유효한 수가 아닙니다.");
    }

    private static double totalRollCount(int sumInput) {
        double sum = 0.0;
        int six = 6;
        for (int i = 0; i < TENTHOUSAND; i++) {
            sum += countDice(new Dice(six), new Dice(six), 1, sumInput);
        }
        return sum / TENTHOUSAND;
    }

    private static int countDice(Dice dice1, Dice dice2, int count, int sumInput) {
        if (dice1.roll() + dice2.roll() == sumInput) {
            return count;
        }
        count++;
        return countDice(dice1, dice2, count, sumInput);
    }
}
