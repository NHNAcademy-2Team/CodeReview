package unit.ten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                     new FileReader("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/resources/null"));) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(countInt(line, '1'));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int countInt(String str, char i) {

        if (str.length() == 0) {
            return 0;
        } else if (str.charAt(0) == i) {
            return 1 + countInt(str.substring(1), i);
        } else {
            return countInt(str.substring(1), i);
        }

    }

}
