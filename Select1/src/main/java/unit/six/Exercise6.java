package unit.six;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력하십시오 : ");
        char[] ch = scan.nextLine().toCharArray();
        System.out.print("정수를 입력하십시오 : ");
        int d = scan.nextInt();

        System.out.println(decoding(ch, d));

    }

    public static String decoding(char[] ch, int d) {
        if (ch.length == 0) {
            throw new NullPointerException("문자를 입력하십시오");
        }

        if (d < 0) {
            throw new IllegalArgumentException("정수를 입력하십시오");
        }

        StringBuilder sb = new StringBuilder();

        for (char c : ch) {
            c -= d;
            sb.append(c);
        }
        return sb.toString();
    }
}
