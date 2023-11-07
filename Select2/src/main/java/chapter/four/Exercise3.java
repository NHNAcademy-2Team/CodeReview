package chapter.four;

import java.util.Scanner;

public class Exercise3 {
    private static int sumDices;

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
        if (sumDices <= 0 || sumDices > 12) {
            throw new IllegalArgumentException("주사위의 합계는 1~12 사이의 값이어야 합니다. 정신차리자 코린아");
        }
    }

    public static int getSumDices() {
        return sumDices;
    }

    public static void main(String[] args) {
        sumOfDicesEyes();
        System.out.println(getSumDices() + "를 구하기 위해서 주사위 2개를 " + getRollCount(getSumDices()) + "번 돌렸습니다.");
    }
}
