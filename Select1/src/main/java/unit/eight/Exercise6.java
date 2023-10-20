package unit.eight;

import java.io.IOException;
import java.io.OutputStream;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        IOFile ioFile = new IOFile("/Users/taehee/과정1/resources/eight/exercise6.txt");
        System.out.println(ioFile.countLines());

        OutputStream os = System.out;
        ioFile.write(os);
        ioFile.print();
        ioFile.copy("/Users/taehee/과정1/resources/eight/exercise6copy.txt");
        ioFile.delete();

    }
}
