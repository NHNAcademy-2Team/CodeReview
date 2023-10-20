package unit.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExerciseTwo {
    public static double average(InputStream is) throws IOException {
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        double result = 0;
        int i = 0;

        double x = Double.parseDouble(br.readLine());
        while(x != 0) {
            result += x;
            i++;
            x = Double.parseDouble(br.readLine());
        }

        if(i == 0) {
            throw new ArithmeticException();
        }

        return result/i;
    }

    public static void main(String[] args) {
        InputStream is = System.in;

        try{
            System.out.println(average(is));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
