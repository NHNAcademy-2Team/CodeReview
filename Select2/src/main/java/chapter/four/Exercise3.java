package four;

import java.util.Scanner;

public class Exercise3 {
    // Dice (class)
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        Scanner sc = new Scanner(System.in);
        System.out.print("나올 숫자를 입력하세요. (2~12): ");
        int num = sc.nextInt();
        if (num < 2 || num > 12) {
            throw new IllegalArgumentException("IllegalArgumentException 에러");
        }
        int count = 0;
        do {
            count++;
            if (num == dice1.getNum() + dice2.getNum()) {
                break;
            }
            dice1.reload();
            dice2.reload();
        } while (true);

        System.out.println("나와야하는 수는 " + num + " 이고, 총 " + count + "번을 돌렸습니다.");
        sc.close();
    }
}
