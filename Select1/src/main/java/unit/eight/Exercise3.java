package unit.eight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Exercise3 {

    /*
    Exercise 8.3.
    Write a public static method that prints on the video all lines of a file that start with one of the characters ’/’, ’;’, or ’%’.
    The name of the file should be given as a parameter.
     */

    public static void prints(String title) {
        if (title.startsWith("/") || title.startsWith(";") || title.startsWith("%")) {
            System.out.println(title);
        }
    }


    public static void main(String[] args) throws IOException {
        File file = new File("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/java/unit/eight/test.txt");
        FileInputStream is = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = br.readLine();

        while(line != null) {
            prints(line);
            line = br.readLine();
        }

        is.close();
        br.close();
    }
}
