package unit.nine;

import java.io.*;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni09/node26.html
 * Exercise 09.4 Capture all exceptions in the following program, printing out error messages that describe the type of error that occurred.
 */
public class Exercise4 {

    public static void main(String[] args) {
        int n=10;
        int[] v = new int[n];
        try(FileReader f = new FileReader("dati.txt"); BufferedReader in = new BufferedReader(f)) {
            int i = 0;
            String linea = in.readLine();
            while (linea != null) {
                v[i] = Integer.parseInt(linea);
                linea = in.readLine();
                i++;
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
