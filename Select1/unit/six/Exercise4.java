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
        int even = 0;
        int odd = 0;

        for (int number : length) {
            if (number >= 0) {
                even += number;
            } else {
                odd += number;
            }
        }

        return String.format("짝수 합 : %d, 홀수 합 : %d", even, odd);
    }


}
