package unit.eight;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exercise6 {
    /*
    Exercise 8.6.
    Realize a class IOFile that exports some functionalities on text files.
    The class should have a constructor with one parameter of type String, representing the name of the file on which to operate,
    and should export the following methods:
    • int countLines() : that returns the number of lines of the file;
    • void write(OutputStream os) : that writes the content of the file to os;
    • void print() : that prints the content of the file to the video;
    • void copy(String filename) : that copies the content of the file to the file specified by filename; • void delete() : that deletes the file from mass-storage.
     */

    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/java/unit/eight/ioFile.txt");

        IOFile ioFile = new IOFile("test.txt");
        ioFile.write(os);
        System.out.println(ioFile.countLines());
    }
}


