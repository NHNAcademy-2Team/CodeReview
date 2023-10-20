package unit.eight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExerciseFour {
    public static void multiTable(String filename, int n) throws IOException {
        FileWriter f = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f);

        for(int i = 1 ;i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                out.print(i*j + "\t");
            }
            out.println();
        }

        f.close();
    }

    public static void main(String[] args) {
        try {
            multiTable("src/main/java/unit/eight/resource/test2.txt", 5);
        } catch(IOException e) {
            throw new RuntimeException();
        }
    }
}
