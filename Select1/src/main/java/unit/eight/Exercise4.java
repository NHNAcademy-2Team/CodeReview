package eight;

import java.io.FileWriter;
import java.io.IOException;

public class Exercise4 {

    public static void writeMultiTable(String filename, int size) throws IOException {

        try (FileWriter fw = new FileWriter(filename)) {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    fw.write(String.valueOf(i * j) + " ");
                }
                fw.write("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        String filename = "/Users/taehee/과정1/eight/exercise4.txt";
        writeMultiTable(filename, 3);
    }
}
