package nine;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Exercise6 {

    public static void main(String[] args) throws IOException {

        try (InputStream is = new FileInputStream("/Users/taehee/과정1/nine/exercise6.txt")) {

            int data = -1;
            int count = 0;

            while (data != 0) {

                data = is.read();
                if ((char) data == '\n') {
                    if (count >= 80)
                        throw new ExceptionLineTooLong("The strings is too long");
                    count = 0;
                }
                count++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ExceptionLineTooLong e) {
            System.out.println(e);
        }

    }
}

class ExceptionLineTooLong extends Exception {
    ExceptionLineTooLong(String message) {
        super(message);
    }
}
