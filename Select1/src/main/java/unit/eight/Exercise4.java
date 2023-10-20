package unit.eight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise4 {
    public static void multipleTable(String filename, int n){
        try(PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    writer.print(i * j);
                    if (j < n) {
                        writer.print(" ");
                    }
                }
                writer.println();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filename = "Exercise4.txt";
        int n= 3;
        multipleTable(filename, n);
    }
}
