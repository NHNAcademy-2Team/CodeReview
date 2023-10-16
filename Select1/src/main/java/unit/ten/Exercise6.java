package unit.ten;

//  as parameters a string s and a character c로는 못 풀고
// as parameters a string s and a string c로 풀었습니다..

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni10/node30.html
 * Provide the implementation of a recursive method that takes as parameters a string s and a character c and returns the length of the longest sequence of consecutive occurrences of character c in s.
 */
public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(longestSequence("xxyxxxhiizyy", "y"));
    }
    public static int longestSequence(String s, String c){
        if(s.contains(c))
            return longestSequence(s, c + c.substring(0, 1));
        return c.length() - 1;
    }
}
