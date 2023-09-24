package CodeReview.Select1.src.main.java.unit.six;

import java.util.Scanner;

public class Exercise7 {
    //보류
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력하십시오 : ");
        String sentence = scan.nextLine();
        System.out.print("찾을 문자를 입력하십시오 : ");
        char search = scan.next().charAt(0);

        System.out.println(searchIndex(sentence, search));

    }

    public static int searchIndex(String sentence, char search) {
        int count = 0;
        int[] counts = new int[sentence.length()];

        if (sentence.indexOf(search) < 0) {
            return -1;
        }

        char[] sentences = sentence.toCharArray();

        for (int i = 0; i < sentences.length - 1; i++) {
            if (sentences[i] == search && sentences[i] == sentences[i+1]) {
                count++;
            } else {
                counts[i] = count;
                count = 0;
            }
        }
        return max(counts);
    }

    public static int max(int... value) {
        int max = 0;

        for (int m : value) {
            if (m > max) {
                max = m;
            }
        }
        return max;
    }
}
