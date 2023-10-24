package unit.ten;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercise6 {
    private static int longest, sequence,index;
    public static int longestSequence(String s, char c) {

        if(s.length() <= index) {
            if(longest < sequence) longest = sequence;
            return longest;
        }
        else if(s.charAt(index++) == c) {
            sequence++;
        } else {
            if(longest < sequence) longest = sequence;
            sequence = 0;
        }

        return longestSequence(s, c);
    }

    public static void main(String[] args) {
        System.out.println(longestSequence("hellohhhhh", 'h'));
    }
}
