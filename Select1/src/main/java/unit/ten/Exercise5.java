package unit.ten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    private static int count = 0;

    public static int countOne(BufferedReader br) throws IOException {
        char integer = (char) br.read();

        if (integer == '\uFFFF')    return count;
        else if (integer == '1') {
            count++;
        }
        return countOne(br);
    }

    public static void main(String[] args) {

        int count = 0;
        try{
            FileReader fr = new FileReader("src/main/java/unit/resource/SequenceOfIntegers");
            BufferedReader br = new BufferedReader(fr);

            count = countOne(br);
            fr.close();
            br.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(count);

    }
}
