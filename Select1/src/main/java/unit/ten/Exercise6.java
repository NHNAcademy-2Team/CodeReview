package unit.ten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise6 {

    //연속된 문자의 가장 긴 길이 반환

    public static int longest(String str, char c) {

        int n = 0;
        int[] count = new int[str.length()];

        if (str.length() == 0) {
            return 0;
        } else if (str.charAt(0) == c) {
            n++;
            count[n] = c;
            return 1 + longest(str.substring(1), c);
        } else {
            return longest(str.substring(1), c);
        }

    }

    public static int countSequence(int count) {



    }
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/resources/null"));) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(longest(line, '1'));
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
