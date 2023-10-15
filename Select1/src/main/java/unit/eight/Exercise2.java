package unit.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Exercise2 {

    /*
     * Exercise 8.2.
     * Write a public static method that reads from the keyboard a sequence of positive integers until the value 0 is inserted,
     * and returns a double representing the average of the read values (without considering the final 0).
     */

    public static double avg(InputStream is) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        System.out.print("양의 정수를 입력하십시오(0 입력 시 종료) : ");
        String[] num = br.readLine().split(" ");
        int n = 0;

        double result = 0.0;
        for (int i = 0; i < num.length; i++) {
            if (num[i].equals("0")) {
                break;
            }
            result += Integer.parseInt(num[i]);
            n++;
        }
        is.close();
        br.close();

        return result / n;
    }

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        OutputStream os = System.out;
        PrintWriter pw = new PrintWriter(os);
        pw.println(avg(is));

        pw.close();
    }
}
