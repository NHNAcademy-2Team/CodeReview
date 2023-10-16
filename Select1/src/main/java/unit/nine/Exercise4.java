package nine;

import java.io.*;
import java.util.Arrays;

public class Exercise4 {

    public static void main(String[] args) {
        int n = 10;
        int[] v = new int[n];

        try (FileReader f = new FileReader("/Users/taehee/과정1/resources/nine/exercise4.txt");
                BufferedReader in = new BufferedReader(f);) {
            int i = 0;
            String linea = in.readLine();

            while (linea != null) {
                v[i] = Integer.parseInt(linea);
                linea = in.readLine();
                i++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Arrays.toString(v));
    }
}
