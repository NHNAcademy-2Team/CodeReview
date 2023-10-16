package unit.nine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import unit.eight.IOFile;
public class Exercise6 {
    public static void main(String[] args) {
        FileReader f;
        BufferedReader br;
        try {
            f = new FileReader("src/main/java/unit/nine/toolongtext");
            br = new BufferedReader(f);

            String line = br.readLine();
            while (line != null) {
                if(line.length() >= 80) {
                    throw new ExceptionLineTooLong("The strings is too long.");
                }
                System.out.println(line);
                line = br.readLine();
            }
        } catch(IOException e ) {

        } catch (ExceptionLineTooLong e) {
            throw new RuntimeException(e);
        }
    }
}
