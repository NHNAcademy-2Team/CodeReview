package unit.six;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("정수 n을 입력하시오 : ");
        int n = scan.nextInt();
        int[] length = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("숫자 " + n + "개를 입력하십시오 : ");
            length[i] = scan.nextInt();
        }

        System.out.println(sum(length));

        scan.close();
    }

    public static String sum(int[] length) {
        int positive = 0;
        int negative = 0;

        for (int number : length) {
            if (number >= 0) {
                positive += number;
            } else {
                negative += number;
            }
        }

        return String.format("양수 합 : %d, 음수 합 : %d", positive, negative);
    }


}
