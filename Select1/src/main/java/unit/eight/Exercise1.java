package unit.eight;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni08/node24.html
 * Exercise 08.1 Write a class IOStrings containing two public static methods:
 * String[] loadArray(InputStream is, int n) : that returns an array of n strings read from the input channel specified by is;
 * void saveArray(OutputStream os, String[] sa) : that writes the array of strings sa to the output channel specified by os.
 */
public class Exercise1 {
    public static void main(String[] args) throws IOException {
        String[] arr = loadArray(System.in, 5);
        saveArray(System.out, arr);
    }

    public static String[] loadArray(InputStream is, int n) {
        String[] result = new String[n];
        try (Scanner sc = new Scanner(is)) {
            for (int i = 0; i < n; i++) {
                result[i] = sc.next();
            }
        }
        return result;
    }

    public static void saveArray(OutputStream os, String[] sa) throws IOException {
        for (int i = 0; i < sa.length; i++) {
            byte[] strToByte = sa[i].getBytes();
            os.write(strToByte);
            os.write(" ".getBytes());
        }
    }
}
