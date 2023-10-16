package eight;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise5 {

    public static String highScoreStudent(String filename, int student) {
        String[] highStudent = new String[2];
        highStudent[1] = "0";

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String readStudent[] = scanner.nextLine().split(" ");

                int sumScore = 0;
                for (int i = 1; i < readStudent.length; i++) {
                    sumScore += Integer.parseInt(readStudent[i]);
                }

                sumScore /= readStudent.length - 1;
                if (sumScore > Integer.parseInt(highStudent[1])) {
                    highStudent[0] = readStudent[0];
                    highStudent[1] = String.valueOf(sumScore);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return highStudent[0];
    }

    public static void main(String[] args) {
        String filename = "/Users/taehee/과정1/resources/eight/exercise5.txt";
        System.out.println("시험을 가장 잘 본 학생 : " + highScoreStudent(filename, 3));
    }
}
