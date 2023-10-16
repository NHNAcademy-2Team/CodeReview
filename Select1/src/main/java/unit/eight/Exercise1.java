package eight;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exercise1 {
    static String[] loadArray(InputStream is, int n) throws IOException {
        String[] arrays = new String[n];

        int data;
        for (int i = 0; i < n; i++) {
            data = is.read();
            arrays[i] = String.valueOf((char) data);
        }
        return arrays;
    }

    static void saveArray(OutputStream os, String[] sa) throws IOException {
        for (String i : sa) {
            os.write(i.getBytes());
        }
    }

    public static void main(String[] args) throws IOException {

        try (InputStream is = System.in;
                OutputStream os = new FileOutputStream("/Users/taehee/과정1/eight/exercise1.txt", true);) {
            saveArray(os, loadArray(is, 5)); // 5글자 입력
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
