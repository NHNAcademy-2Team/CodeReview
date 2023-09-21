package unit.six;

import java.util.Scanner;

/*
 * 원래 문자의 유니코드 값에서 -d 한 값의 문자 반환
 */
public class Exercise6 {

    public static String decode(String sentence, int d) {
        String result = "";
        for (int i = 0; i < sentence.length(); i++) {

            result += (char) (sentence.charAt(i) - d);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();
        int d = scanner.nextInt();
        System.out.println(decode(sentence, d));

        scanner.close();
    }
}
