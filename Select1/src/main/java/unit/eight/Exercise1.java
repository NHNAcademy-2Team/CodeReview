package unit.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Exercise1 {

    /*
    Exercise 8.1. Write a class IOStrings containing two public static methods:
    • String[] loadArray(InputStream is, int n) : that returns an array of n strings read from the input channel specified by is;
    • void saveArray(OutputStream os, String[] sa) : that writes the array of strings sa to the output channel specified by os.
    */

    public static String[] loadArray(InputStream is, int n) throws IOException {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf((char) is.read());
            if (result[i] == null) {
                break;
            }
        }

        is.close();
        return result;
    }


    public static void saveArray(OutputStream os, String[] sa) throws IOException {
        PrintWriter pw = new PrintWriter(os);
        pw.println(Arrays.toString(sa));
        for (int i = 0; i < sa.length; i++) {
            pw.print(sa[i]);
        }
        pw.close();
        os.close();
    }

}


class Exercise1Main {
    public static void main(String[] args) throws IOException {
        System.out.print("문자를 입력하십시오 : ");
        InputStream is = System.in;
        OutputStream os = System.out;
        String[] sa = Exercise1.loadArray(is, 5);

        Exercise1.saveArray(os, sa);

    }
}
