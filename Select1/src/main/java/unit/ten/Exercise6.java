package unit.ten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise6 {

    private static int max = 0;

    //연속된 문자의 가장 긴 길이 반환
    //보류

    public static int longest(String str, char c, int count) {

        if (str.length() == 0) {
            return 0;
        } else if (str.charAt(0) == c) {
            count++;
            return 1 + longest(str.substring(1), c, count);
        } else {
            max(count, max);
            count = 0;
            return longest(str.substring(1), c, count);
        }

    }

    public static void max(int count, int max) {
        if (max < count) {
            max = count;
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/resources/null"));) {

            int count = 0;

            String line = br.readLine();
            while (line != null) {
                System.out.println(longest(line, '1', count));
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
