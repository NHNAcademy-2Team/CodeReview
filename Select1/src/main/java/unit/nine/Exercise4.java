package unit.nine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise4 {
    public static void main(String[] args) {
        int n = 10;
        int[] v = new int[4];
        try {
            FileReader f = new FileReader("test.txt");
            BufferedReader in = new BufferedReader(f);
            int i = 0;
            String linea = in.readLine();
            while (linea != null) {
                try {
                    v[i] = Integer.parseInt(linea);
                } catch (NumberFormatException e) {
                    System.err.println("오류: 라인에서 정수를 파싱할 수 없다." + linea);
                }
                linea = in.readLine();
                i++;
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.err.println("오류: 파일을 찾을 수 없다.");
        } catch (IOException e) {
            System.err.println("오류: 입출력 오류 발생했다.");
        }
    }
}
