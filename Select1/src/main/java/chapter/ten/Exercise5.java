package chapter.ten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {

    public static int countOneFromFile(String filename) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += countOneInString(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public static int countOneInString(String s) {
        if (s.isEmpty()) {
            return 0;
        } else {
            if (s.charAt(0) == '1') {
                return 1 + countOneInString(s.substring(1));
            } else {
                return countOneInString(s.substring(1));
            }
        }
    }


    public static void main(String[] args) {
        String filename = "/Users/hongjiwon/Desktop/NewGit/Select1/Exercise5.txt";
        int oneCount = countOneFromFile(filename);
        System.out.println("시퀀스에서 1은 " + oneCount + "번 나옵니다.");
    }
}
