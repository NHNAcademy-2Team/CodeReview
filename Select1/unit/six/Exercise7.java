package unit.six;

import java.util.Scanner;

public class Exercise7 {
    /*
     * 문자열에서 입력받은 문자가 가장 많이 연속되는 부분의 첫 인덱스를 반환해라.
     */

    public static int findIndex(String sentence, String word) {
        String[] arrays = sentence.split("");

        int i = 0;
        int index = -1;
        int count = 0;
        while (i != arrays.length) {
            if (arrays[i].equals(word)) {
                if (count < wordCount(arrays, i)) {
                    count = wordCount(arrays, i);
                    index = i;
                }
            }
            i++;
        }
        return index;
    }

    public static int wordCount(String[] arrays, int i) {
        int count = 0;
        for (int j = i; j < arrays.length; j++) {
            if (arrays[j].equals(arrays[i]))
                count++;
            else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();
        String word = scanner.next();
        System.out.println(findIndex(sentence, word));

        scanner.close();
    }

}
