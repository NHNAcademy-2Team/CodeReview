package unit.six;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise7 {

    // 문자열 속의 문자가 얼마나 연속적으로 반복되는지... 가장 많이 연속적으로 반복되는 문자 찾는 문제
    public static void print(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int max = 0;
        String c = "-1";
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            if (temp.length() > max) {
                max = temp.length();
                c = String.valueOf(temp.charAt(0));
            }
        }
        System.out.println(c);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();

        print(text);
    }
}
