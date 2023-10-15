package unit.eight;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exercise4 {
    /*
    Exercise 8.4.
    Write a public static method that takes as parameters a string representing a filename and an integer n,
    and writes on the file the multiplication table of size n.
    For example, for n = 3, the method should write:
    123
    246
    369
     */

    public static void mulTable(String filename, int n) {

        try (FileOutputStream os = new FileOutputStream(
                "/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/java/unit/eight/" + filename);
             PrintWriter pw = new PrintWriter(os);
        ) {

            int num = 1;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    num = i * j;
                    pw.write(String.valueOf(num));
                }
                pw.write("\r\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //파일 출력과 입력을 다르게 해야 함. 출력을 모두 끝내면 포인터가 맨 끝으로 이동하기 때문에 읽어올 게 없어짐 > 파일 작성을 마치고 다시 처음부터 파일을 읽어와야 함
        try (InputStream is = new FileInputStream("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/java/unit/eight/" + filename);
             BufferedReader br = new BufferedReader(new InputStreamReader(is));) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        mulTable("mulTable.txt", 5);


    }
}
