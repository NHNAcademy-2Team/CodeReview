package unit.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

/*
 * Exercise 08.1 Write a class IOStrings containing two public static methods:
 *
 * String[] loadArray(InputStream is, int n) : that returns an array of n strings read from the input channel specified by is;
 * void saveArray(OutputStream os, String[] sa) : that writes the array of strings sa to the output channel specified by os.
 *
 */

public class IOStrings {
    public static String[] loadArray(InputStream is, int n) throws IOException {
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String[] lines = new String[n];

        for(int i = 0; i < n; i++) {
            lines[i] = br.readLine();
        }

        return lines;
    }


    public static void saveArray(OutputStream os, String[] sa) throws IOException{
        PrintStream ps = new PrintStream(os);

        for(int i = 0;i < sa.length; i++) {
            ps.println(sa[i]);
        }
    }
    public static void main(String[] args) {
        try {
            InputStream is = System.in;
            String[] lines = loadArray(is, 5);

            OutputStream os = System.out;
            saveArray(os, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
