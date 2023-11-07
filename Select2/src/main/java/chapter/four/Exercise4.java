package chapter.four;

import java.util.Scanner;

public class Exercise4 {
    private static int sumDices;
    private static final int LOOP_NUM = 10000;

    public static int getRollCount(int sumDices) {
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);
        int count = 0;

        do {
            count++;
        } while (sumDices != (dice1.roll() + dice2.roll()));

        return count;
    }

    public static void sumOfDicesEyes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주사위의 합계를 입력해주세요(범위: 1~12): ");
        sumDices = scanner.nextInt();
        scanner.close();
        if (sumDices < 2 || sumDices > 12) {
            throw new IllegalArgumentException("주사위의 합계는 2~12 사이의 값이어야 한다. 정신차리자 코린아");
        }
    }

    public static int getSumDices() {
        return sumDices;
    }

    public static void avgOfRollCount() {
        System.out.println("  주사위의 총합 \t 평균 굴림 횟수");
        System.out.println("-------------\t-------------");


        for (int i = 2; i <= 12; i++) {
            double sum = 0;
            double avgCount = 0;

            System.out.printf("      %d", i);
            for (int j = 0; j < LOOP_NUM; j++) {
                sum += getRollCount(i);
            }
            avgCount = sum / LOOP_NUM;
            System.out.printf("\t\t      %.4f %n", avgCount);
        }
    }

    public static void main(String[] args) {
        avgOfRollCount();
    }
}
