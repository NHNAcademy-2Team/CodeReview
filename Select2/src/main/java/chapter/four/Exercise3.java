package select2.src.main.java.chapter.four;

import java.util.Scanner;

public class Exercise3 {
    public static int diceSum() {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;

        return dice1 + dice2;
    }

    public static int compare(int value) {
        if (value < 2 || value > 12) {
            throw new IllegalArgumentException("합이 2보다 작거나 12보다 클 순 없습니다.");
        }
        int count = 0;
        // 주사위 합과 입력한 변수가 같을 때까지 diceSum 호출
        while (true){
            count++;
            if (value == diceSum())
                break;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int value = scn.nextInt();
        int count = compare(value); // 실제 횟수

        System.out.println(count);

        scn.close();


    }
}
